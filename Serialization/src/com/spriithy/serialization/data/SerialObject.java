package com.spriithy.serialization.data;

import static com.spriithy.serialization.SerialWriter.*;

import java.util.ArrayList;
import java.util.List;

public class SerialObject {

	public static final byte	CONTAINER_TYPE	= SerialContainerType.OBJECT;

	public short				nameLength;
	public byte[]				name;

	private short				fieldCount;
	private List<SerialField>	fields			= new ArrayList<SerialField>();

	private short				arrayCount;
	private List<SerialArray>	arrays			= new ArrayList<SerialArray>();

	private int					size			= 1 + 2 + 2 + 2;

	public SerialObject(String name) {
		setName(name);
	}

	public void addField(SerialField field) {
		fields.add(field);
		size += field.getSize();
		fieldCount = (short) fields.size();
	}

	public void addArray(SerialArray array) {
		arrays.add(array);
		size += array.getSize();
		arrayCount = (short) arrays.size();
	}

	public void setName(String name) {
		assert name.length() < Short.MAX_VALUE : "Object name is too long";
		nameLength = (short) name.length();
		this.name = name.getBytes();
	}

	public int getBytes(byte[] dst, int ptr) {
		assert dst.length > ptr + getSize() : "Overflow !";
		ptr = writeBytes(dst, ptr, CONTAINER_TYPE);
		ptr = writeBytes(dst, ptr, nameLength);
		ptr = writeBytes(dst, ptr, name);

		ptr = writeBytes(dst, ptr, fieldCount);
		for (SerialField field : fields)
			ptr = field.getBytes(dst, ptr);

		ptr = writeBytes(dst, ptr, arrayCount);
		for (SerialArray array : arrays)
			ptr = array.getBytes(dst, ptr);

		return ptr;
	}

	public int getSize() {
		return size + nameLength;
	}

}

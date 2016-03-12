package com.spriithy.serialization.data;

import static com.spriithy.serialization.SerialWriter.*;

import java.util.ArrayList;
import java.util.List;

import com.spriithy.serialization.Serializable;
import com.spriithy.utils.ArrayUtils;

public class SerialObject implements Serializable {

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
		if (!hasFieldNamed(field.getName())) {
			fields.add(field);
			size += field.getSize();
			fieldCount = (short) fields.size();
		} else throw new IllegalArgumentException("Object already contains a field named <" + field.getName() + ">");
	}

	public SerialField getFieldByName(String name) {
		for (SerialField field : fields)
			if (field.getName().equals(name)) return field;
		return null;
	}

	public boolean hasFieldNamed(String name) {
		for (SerialField field : fields)
			if (field.getName().equals(name) || field.getName() == name) return true;
		return false;
	}

	public void addArray(SerialArray array) {
		if (!hasArrayNamed(array.getName())) {
			arrays.add(array);
			size += array.getSize();
			arrayCount = (short) arrays.size();
		} else throw new IllegalArgumentException("Object already contains an array named <" + array.getName() + ">");
	}

	public SerialArray getArrayByName(String name) {
		for (SerialArray array : arrays)
			if (array.getName().equals(name)) return array;
		return null;
	}

	public boolean hasArrayNamed(String name) {
		for (SerialArray array : arrays)
			if (array.getName().equals(name)) return true;
		return false;
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

	public String getName() {
		return ArrayUtils.stringOf(name);
	}

	public int getSize() {
		return size + nameLength;
	}

	public String toString() {
		return "SerialObject [name=\"" + getName() + "\", fields=" + fields + ", arrays=" + arrays + "]";
	}

}

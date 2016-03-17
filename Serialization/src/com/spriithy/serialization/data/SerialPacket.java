package com.spriithy.serialization.data;

import static com.spriithy.serialization.SerialWriter.*;

import java.util.ArrayList;
import java.util.List;

import com.spriithy.serialization.Serializable;
import com.spriithy.utils.ArrayUtils;

/**
 * 
 * @author Theophile Dano, Spriithy 2016
 *
 */
public class SerialPacket implements Serializable {

	public static final byte	CONTAINER_TYPE	= SerialContainerType.PACKET;

	public short				nameLength;
	public byte[]				name;

	private short				objectCount;
	private List<SerialObject>	objects			= new ArrayList<>();

	private int					size			= 1 + 2 + 2;

	public SerialPacket(String name) {
		setName(name);
	}

	public void addObject(SerialObject object) {
		if (!hasObjectNamed(object.getName())) {
			objects.add(object);
			objectCount = (short) objects.size();
			size += object.getSize();
		} else throw new IllegalArgumentException("Packet already contains an Object named <" + object.getName() + ">");
	}

	public boolean hasObjectNamed(String name) {
		for (SerialObject object : objects)
			if (object.getName().equals(name)) return true;
		return false;
	}

	public SerialObject getObjectByName(String name) {
		for (SerialObject object : objects)
			if (object.getName().equals(name)) return object;
		return null;
	}

	public void setName(String name) {
		assert name.length() < Short.MAX_VALUE : "Packet name is too long";
		nameLength = (short) name.length();
		this.name = name.getBytes();
	}

	public String getName() {
		return ArrayUtils.stringOf(name);
	}

	public int getSize() {
		return size + nameLength;
	}

	public int getBytes(byte[] dst, int ptr) {
		ptr = writeBytes(dst, ptr, CONTAINER_TYPE);
		ptr = writeBytes(dst, ptr, nameLength);
		ptr = writeBytes(dst, ptr, name);

		ptr = writeBytes(dst, ptr, objectCount);
		for (SerialObject object : objects)
			ptr = object.getBytes(dst, ptr);

		return ptr;
	}

}

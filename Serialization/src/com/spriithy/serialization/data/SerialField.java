package com.spriithy.serialization.data;

import static com.spriithy.serialization.SerialReader.*;
import static com.spriithy.serialization.SerialWriter.*;
import static com.spriithy.utils.ArrayUtils.*;

import javax.activation.UnsupportedDataTypeException;

import com.spriithy.serialization.Serializable;
import com.spriithy.utils.ArrayUtils;

/**
 * @author Theophile Dano, Spriithy 2015
 */
public class SerialField implements Serializable {

	public static final byte	CONTAINER_TYPE	= SerialContainerType.FIELD;

	public short				nameLength;
	public byte[]				name;
	public byte					type;
	public byte[]				data;

	private Object				generic;

	private SerialField() {}

	public static SerialField Byte(String name, byte value) {
		SerialField field = new SerialField();
		field.setName(name);
		field.data = new byte[SerialType.getSize(SerialType.BYTE)];
		field.type = SerialType.BYTE;
		writeBytes(field.data, 0, value);
		return field;
	}

	public static SerialField Char(String name, char value) {
		SerialField field = new SerialField();
		field.setName(name);
		field.data = new byte[SerialType.getSize(SerialType.CHAR)];
		field.type = SerialType.CHAR;
		writeBytes(field.data, 0, value);
		return field;
	}

	public static SerialField Short(String name, short value) {
		SerialField field = new SerialField();
		field.setName(name);
		field.data = new byte[SerialType.getSize(SerialType.SHORT)];
		field.type = SerialType.SHORT;
		writeBytes(field.data, 0, value);
		return field;
	}

	public static SerialField Integer(String name, int value) {
		SerialField field = new SerialField();
		field.setName(name);
		field.data = new byte[SerialType.getSize(SerialType.INTEGER)];
		field.type = SerialType.INTEGER;
		writeBytes(field.data, 0, value);
		return field;
	}

	public static SerialField Long(String name, long value) {
		SerialField field = new SerialField();
		field.setName(name);
		field.data = new byte[SerialType.getSize(SerialType.LONG)];
		field.type = SerialType.LONG;
		writeBytes(field.data, 0, value);
		return field;
	}

	public static SerialField Float(String name, float value) {
		SerialField field = new SerialField();
		field.setName(name);
		field.data = new byte[SerialType.getSize(SerialType.FLOAT)];
		field.type = SerialType.FLOAT;
		writeBytes(field.data, 0, value);
		return field;
	}

	public static SerialField Double(String name, double value) {
		SerialField field = new SerialField();
		field.setName(name);
		field.data = new byte[SerialType.getSize(SerialType.DOUBLE)];
		field.type = SerialType.DOUBLE;
		writeBytes(field.data, 0, value);
		return field;
	}

	public static SerialField Boolean(String name, boolean value) {
		SerialField field = new SerialField();
		field.setName(name);
		field.data = new byte[SerialType.getSize(SerialType.BOOLEAN)];
		field.type = SerialType.BOOLEAN;
		writeBytes(field.data, 0, value);
		return field;
	}

	public static SerialField String(String name, String value) {
		SerialField field = new SerialField();
		field.setName(name);
		field.data = new byte[value.length() + 2];
		field.type = SerialType.STRING;
		writeBytes(field.data, 0, value);
		return field;
	}

	public static <T extends Serializable> SerialField Generic(String name, T obj) {
		if (obj instanceof Serializable) {
			SerialField field = new SerialField();
			field.generic = obj;
			field.setName(name);
			field.data = new byte[obj.getSize()];
			field.type = SerialType.GENERIC;
			obj.getBytes(field.data, 0);
			return field;
		} else throw new IllegalArgumentException("A generic SerialField must serialize an Object that implements com.spriithy.serialization.Serializable");
	}

	public static SerialField Deserialize(byte[] data, int ptr) throws Exception {
		SerialField field = new SerialField();
		if (data[ptr++] != CONTAINER_TYPE) throw new Exception("Given pointer doesn't represent a SerialField");
		field.nameLength = readShort(data, ptr);
		String name = readString(data, ptr);
		field.setName(name);
		field.type = readByte(data, ptr + 2 + field.nameLength);
		field.data = slice(data, ptr + 2 + field.nameLength + 1, data.length - 1);
		if (field.type == SerialType.GENERIC) {
			switch (field.data[0]) {
			case SerialContainerType.FIELD:
				field.generic = Deserialize(field.data, 0);
				break;
			default:
				throw new UnsupportedDataTypeException("Cannot deserialize generic SerialField if field type is not SerialField");
			}
		}
		return field;
	}

	public void setName(String name) {
		assert name.length() < Short.MAX_VALUE : "Field name is too long";
		nameLength = (short) name.length();
		this.name = name.getBytes();
	}

	public int getBytes(byte[] dst, int ptr) {
		ptr = writeBytes(dst, ptr, CONTAINER_TYPE);
		ptr = writeBytes(dst, ptr, nameLength);
		ptr = writeBytes(dst, ptr, name);
		ptr = writeBytes(dst, ptr, type);
		ptr = writeBytes(dst, ptr, data);
		return ptr;
	}

	public int getSize() {
		assert SerialType.getSize(type) != data.length : "Corrupted data !";
		return 1 + 2 + name.length + 1 + data.length;
	}

	public String getName() {
		return ArrayUtils.stringOf(name);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("SerialField [name=\"");
		sb.append(getName() + "\", ");
		sb.append("type=");
		sb.append(SerialType.getName(type) + ", ");
		sb.append("value=");
		switch (type) {
		case SerialType.BYTE:
			sb.append(readByte(data, 0));
			break;
		case SerialType.SHORT:
			sb.append(readShort(data, 0));
			break;
		case SerialType.CHAR:
			sb.append(readChar(data, 0));
			break;
		case SerialType.INTEGER:
			sb.append(readInt(data, 0));
			break;
		case SerialType.LONG:
			sb.append(readLong(data, 0));
			break;
		case SerialType.FLOAT:
			sb.append(readFloat(data, 0));
			break;
		case SerialType.DOUBLE:
			sb.append(readDouble(data, 0));
			break;
		case SerialType.BOOLEAN:
			sb.append(readDouble(data, 0));
			break;
		case SerialType.STRING:
			sb.append("\"" + readString(data, 0) + "\"");
			break;
		case SerialType.GENERIC:
			sb.append(generic.toString());
			break;
		}
		sb.append("]");
		return sb.toString();
	}

}

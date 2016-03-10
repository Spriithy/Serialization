package com.spriithy.serialization.data;

import static com.spriithy.serialization.SerialWriter.*;

public class SerialArray {

	public static final byte	CONTAINER_TYPE	= SerialContainerType.ARRAY;

	public short				nameLength;
	public byte[]				name;
	public byte					type;
	public int					count;

	public byte[]				byteData;
	public short[]				shortData;
	public char[]				charData;
	public int[]				intData;
	public long[]				longData;
	public float[]				floatData;
	public double[]				doubleData;
	public boolean[]			booleanData;
	public String[]				stringData;

	private SerialArray() {}

	public static SerialArray Byte(String name, byte[] data) {
		SerialArray array = new SerialArray();
		array.setName(name);
		array.count = data.length;
		array.byteData = data;
		array.type = SerialType.BYTE;
		return array;
	}

	public static SerialArray Short(String name, short[] data) {
		SerialArray array = new SerialArray();
		array.setName(name);
		array.count = data.length;
		array.shortData = data;
		array.type = SerialType.SHORT;
		return array;
	}

	public static SerialArray Char(String name, char[] data) {
		SerialArray array = new SerialArray();
		array.setName(name);
		array.count = data.length;
		array.charData = data;
		array.type = SerialType.CHAR;
		return array;
	}

	public static SerialArray Integer(String name, int[] data) {
		SerialArray array = new SerialArray();
		array.setName(name);
		array.count = data.length;
		array.intData = data;
		array.type = SerialType.INTEGER;
		return array;
	}

	public static SerialArray Long(String name, long[] data) {
		SerialArray array = new SerialArray();
		array.setName(name);
		array.count = data.length;
		array.longData = data;
		array.type = SerialType.LONG;
		return array;
	}

	public static SerialArray Float(String name, float[] data) {
		SerialArray array = new SerialArray();
		array.setName(name);
		array.count = data.length;
		array.floatData = data;
		array.type = SerialType.FLOAT;
		return array;
	}

	public static SerialArray Double(String name, double[] data) {
		SerialArray array = new SerialArray();
		array.setName(name);
		array.count = data.length;
		array.doubleData = data;
		array.type = SerialType.DOUBLE;
		return array;
	}

	public static SerialArray Boolean(String name, boolean[] data) {
		SerialArray array = new SerialArray();
		array.setName(name);
		array.count = data.length;
		array.booleanData = data;
		array.type = SerialType.BOOLEAN;
		return array;
	}

	public static SerialArray String(String name, String[] data) {
		SerialArray array = new SerialArray();
		array.setName(name);
		array.count = data.length;
		array.stringData = data;
		array.type = SerialType.STRING;
		return array;
	}

	public void setName(String name) {
		assert name.length() < Short.MAX_VALUE : "Array name is too long";
		nameLength = (short) name.length();
		this.name = name.getBytes();
	}

	public int getBytes(byte[] dst, int ptr) {
		assert dst.length > ptr + getSize() : "Overflow !";
		ptr = writeBytes(dst, ptr, CONTAINER_TYPE);
		ptr = writeBytes(dst, ptr, nameLength);
		ptr = writeBytes(dst, ptr, name);
		ptr = writeBytes(dst, ptr, type);
		ptr = writeBytes(dst, ptr, count);
		switch (type) {
			case SerialType.BYTE:
				ptr = writeBytes(dst, ptr, byteData);
				break;
			case SerialType.SHORT:
				ptr = writeBytes(dst, ptr, shortData);
				break;
			case SerialType.CHAR:
				ptr = writeBytes(dst, ptr, charData);
				break;
			case SerialType.INTEGER:
				ptr = writeBytes(dst, ptr, intData);
				break;
			case SerialType.LONG:
				ptr = writeBytes(dst, ptr, longData);
				break;
			case SerialType.FLOAT:
				ptr = writeBytes(dst, ptr, floatData);
				break;
			case SerialType.DOUBLE:
				ptr = writeBytes(dst, ptr, doubleData);
				break;
			case SerialType.BOOLEAN:
				ptr = writeBytes(dst, ptr, booleanData);
				break;

		}
		return ptr;
	}

	public int getDataSize() {
		switch (type) {
			case SerialType.BYTE:
				return byteData.length * SerialType.getSize(type);
			case SerialType.SHORT:
				return shortData.length * SerialType.getSize(type);
			case SerialType.CHAR:
				return charData.length * SerialType.getSize(type);
			case SerialType.INTEGER:
				return intData.length * SerialType.getSize(type);
			case SerialType.LONG:
				return longData.length * SerialType.getSize(type);
			case SerialType.FLOAT:
				return floatData.length * SerialType.getSize(type);
			case SerialType.DOUBLE:
				return doubleData.length * SerialType.getSize(type);
			case SerialType.BOOLEAN:
				return booleanData.length * SerialType.getSize(type);
			case SerialType.STRING:
				int total = 0;
				for (String string : stringData)
					total += string.length() + 2;
				return total;
		}
		assert false;
		return 0;
	}

	public int getSize() {
		return 1 + 2 + name.length + 1 + 4 + getDataSize();
	}

}

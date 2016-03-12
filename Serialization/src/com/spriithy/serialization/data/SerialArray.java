package com.spriithy.serialization.data;

import static com.spriithy.serialization.SerialWriter.*;

import java.util.Arrays;

import com.spriithy.serialization.Serializable;
import com.spriithy.utils.ArrayUtils;

/**
 * 
 * This class represents a Serialized Array for the SDB system.
 * A SerialArray can only store Java primitive types or strings.
 * 
 * @author Theophile Dano, Spriithy 2016
 * 
 */
public class SerialArray implements Serializable {

	/**
	 * Represents the container type
	 * 
	 * @see com.spriithy.serialization.data.SerialContainerType.ARRAY
	 */
	public static final byte	CONTAINER_TYPE	= SerialContainerType.ARRAY;

	/**
	 * This is the length of the SerialArray name stored in a short (2 bytes)
	 */
	private short				nameLength;

	/**
	 * The SerialArray name stored as a byte array
	 */
	public byte[]				name;

	/**
	 * A byte to know what type of data is stored in the SerialArray
	 * 
	 * @see com.spriithy.serialization.data.SerialType
	 */
	public byte					type;

	/**
	 * The count of elements stored in the SerialArray
	 */
	public int					count;

	/**
	 * The byte array to store the SerialArray data if its type is BYTE
	 * 
	 * @see com.spriithy.serialization.data.SerialType.BYTE
	 */
	private byte[]				byteData;

	/**
	 * The short array to store the SerialArray data if its type is SHORT
	 */
	private short[]				shortData;

	/**
	 * The char array to store the SerialArray data if its type is CHAR
	 */
	private char[]				charData;

	/**
	 * The int array to store the SerialArray data if its type is INTEGER
	 */
	private int[]				intData;

	/**
	 * The long array to store the SerialArray data if its type is LONG
	 */
	private long[]				longData;

	/**
	 * The float array to store the SerialArray data if its type is FLOAT
	 */
	private float[]				floatData;

	/**
	 * The double array to store the SerialArray data if its type is DOUBLE
	 */
	private double[]			doubleData;

	/**
	 * The boolean array to store the SerialArray data if its type is BOOLEAN
	 */
	private boolean[]			booleanData;

	/**
	 * The String array to store the SerialArray data if its type is STRING
	 */
	private String[]			stringData;

	/**
	 * This constructor is made private so one cannot instanciate a SerialArray out of given presets.
	 */
	private SerialArray() {}

	/**
	 * Creates a new instance of SerialArray and initializes it to be a byte array
	 * 
	 * @param name
	 *            The name of the SerialArray
	 * @param data
	 *            The byte array to store
	 * @return The new instance of {@link com.spriithy.serialization.data.SerialArray}
	 */
	public static SerialArray Byte(String name, byte[] data) {
		SerialArray array = new SerialArray();
		array.setName(name);
		array.count = data.length;
		array.byteData = data;
		array.type = SerialType.BYTE;
		return array;
	}

	public void set(int pos, byte val) {
		assert pos >= 0 && pos <= byteData.length : "Out of bounds";
		assert type == SerialType.BYTE : "Cannot put " + SerialType.getName(type) + " when a byte is expected";
		byteData[pos] = val;
	}

	public byte byteAt(int pos) {
		assert pos >= 0 && pos <= byteData.length : "Out of bounds";
		assert type == SerialType.BYTE : "Cannot get " + SerialType.getName(type) + " from byte array";
		return byteData[pos];
	}

	/**
	 * Creates a new instance of SerialArray and initializes it to be a short array
	 * 
	 * @param name
	 *            The name of the SerialArray
	 * @param data
	 *            The short array to store
	 * @return The new instance of {@link com.spriithy.serialization.data.SerialArray}
	 */
	public static SerialArray Short(String name, short[] data) {
		SerialArray array = new SerialArray();
		array.setName(name);
		array.count = data.length;
		array.shortData = data;
		array.type = SerialType.SHORT;
		return array;
	}

	public void set(int pos, short val) {
		assert pos >= 0 && pos <= shortData.length : "Out of bounds";
		assert type == SerialType.SHORT : "Cannot put " + SerialType.getName(type) + " when a short is expected";
		shortData[pos] = val;
	}

	public short shortAt(int pos) {
		assert pos >= 0 && pos <= shortData.length : "Out of bounds";
		assert type == SerialType.SHORT : "Cannot get " + SerialType.getName(type) + " from short array";
		return shortData[pos];
	}

	/**
	 * Creates a new instance of SerialArray and initializes it to be a char array
	 * 
	 * @param name
	 *            The name of the SerialArray
	 * @param data
	 *            The char array to store
	 * @return The new instance of {@link com.spriithy.serialization.data.SerialArray}
	 */
	public static SerialArray Char(String name, char[] data) {
		SerialArray array = new SerialArray();
		array.setName(name);
		array.count = data.length;
		array.charData = data;
		array.type = SerialType.CHAR;
		return array;
	}

	public void set(int pos, char val) {
		assert pos >= 0 && pos <= charData.length : "Out of bounds";
		assert type == SerialType.CHAR : "Cannot put " + SerialType.getName(type) + " when a char is expected";
		charData[pos] = val;
	}

	public char charAt(int pos) {
		assert pos >= 0 && pos <= charData.length : "Out of bounds";
		assert type == SerialType.CHAR : "Cannot get " + SerialType.getName(type) + " from char array";
		return charData[pos];
	}

	/**
	 * Creates a new instance of SerialArray and initializes it to be a int array
	 * 
	 * @param name
	 *            The name of the SerialArray
	 * @param data
	 *            The int array to store
	 * @return The new instance of {@link com.spriithy.serialization.data.SerialArray}
	 */
	public static SerialArray Integer(String name, int[] data) {
		SerialArray array = new SerialArray();
		array.setName(name);
		array.count = data.length;
		array.intData = data;
		array.type = SerialType.INTEGER;
		return array;
	}

	public void set(int pos, int val) {
		assert pos >= 0 && pos <= intData.length : "Out of bounds";
		assert type == SerialType.INTEGER : "Cannot put " + SerialType.getName(type) + " when an integer is expected";
		intData[pos] = val;
	}

	public int intAt(int pos) {
		assert pos >= 0 && pos <= intData.length : "Out of bounds";
		assert type == SerialType.INTEGER : "Cannot get " + SerialType.getName(type) + " from integer array";
		return intData[pos];
	}

	/**
	 * Creates a new instance of SerialArray and initializes it to be a long array
	 * 
	 * @param name
	 *            The name of the SerialArray
	 * @param data
	 *            The long array to store
	 * @return The new instance of {@link com.spriithy.serialization.data.SerialArray}
	 */
	public static SerialArray Long(String name, long[] data) {
		SerialArray array = new SerialArray();
		array.setName(name);
		array.count = data.length;
		array.longData = data;
		array.type = SerialType.LONG;
		return array;
	}

	public void set(int pos, long val) {
		assert pos >= 0 && pos <= longData.length : "Out of bounds";
		assert type == SerialType.LONG : "Cannot put " + SerialType.getName(type) + " when a long is expected";
		longData[pos] = val;
	}

	public long longAt(int pos) {
		assert pos >= 0 && pos <= longData.length : "Out of bounds";
		assert type == SerialType.LONG : "Cannot get " + SerialType.getName(type) + " from long array";
		return longData[pos];
	}

	/**
	 * Creates a new instance of SerialArray and initializes it to be a float array
	 * 
	 * @param name
	 *            The name of the SerialArray
	 * @param data
	 *            The float array to store
	 * @return The new instance of {@link com.spriithy.serialization.data.SerialArray}
	 */
	public static SerialArray Float(String name, float[] data) {
		SerialArray array = new SerialArray();
		array.setName(name);
		array.count = data.length;
		array.floatData = data;
		array.type = SerialType.FLOAT;
		return array;
	}

	public void set(int pos, float val) {
		assert pos >= 0 && pos <= floatData.length : "Out of bounds";
		assert type == SerialType.FLOAT : "Cannot put " + SerialType.getName(type) + " when a float is expected";
		floatData[pos] = val;
	}

	public float floatAt(int pos) {
		assert pos >= 0 && pos <= floatData.length : "Out of bounds";
		assert type == SerialType.FLOAT : "Cannot get " + SerialType.getName(type) + " from float array";
		return floatData[pos];
	}

	/**
	 * Creates a new instance of SerialArray and initializes it to be a double array
	 * 
	 * @param name
	 *            The name of the SerialArray
	 * @param data
	 *            The double array to store
	 * @return The new instance of {@link com.spriithy.serialization.data.SerialArray}
	 */
	public static SerialArray Double(String name, double[] data) {
		SerialArray array = new SerialArray();
		array.setName(name);
		array.count = data.length;
		array.doubleData = data;
		array.type = SerialType.DOUBLE;
		return array;
	}

	public void set(int pos, double val) {
		assert pos >= 0 && pos <= doubleData.length : "Out of bounds";
		assert type == SerialType.DOUBLE : "Cannot put " + SerialType.getName(type) + " when a double is expected";
		doubleData[pos] = val;
	}

	public double doubleAt(int pos) {
		assert pos >= 0 && pos <= doubleData.length : "Out of bounds";
		assert type == SerialType.DOUBLE : "Cannot get " + SerialType.getName(type) + " from double array";
		return doubleData[pos];
	}

	/**
	 * Creates a new instance of SerialArray and initializes it to be a boolean array
	 * 
	 * @param name
	 *            The name of the SerialArray
	 * @param data
	 *            The boolean array to store
	 * @return The new instance of {@link com.spriithy.serialization.data.SerialArray}
	 */
	public static SerialArray Boolean(String name, boolean[] data) {
		SerialArray array = new SerialArray();
		array.setName(name);
		array.count = data.length;
		array.booleanData = data;
		array.type = SerialType.BOOLEAN;
		return array;
	}

	public void set(int pos, boolean val) {
		assert pos >= 0 && pos <= booleanData.length : "Out of bounds";
		assert type == SerialType.BOOLEAN : "Cannot put " + SerialType.getName(type) + " when a boolean is expected";
		booleanData[pos] = val;
	}

	public boolean booleanAt(int pos) {
		assert pos >= 0 && pos <= booleanData.length : "Out of bounds";
		assert type == SerialType.BOOLEAN : "Cannot get " + SerialType.getName(type) + " from boolean array";
		return booleanData[pos];
	}

	/**
	 * Creates a new instance of SerialArray and initializes it to be a String array
	 * 
	 * @param name
	 *            The name of the SerialArray
	 * @param data
	 *            The String array to store
	 * @return The new instance of {@link com.spriithy.serialization.data.SerialArray}
	 */
	public static SerialArray String(String name, String[] data) {
		SerialArray array = new SerialArray();
		array.setName(name);
		array.count = data.length;
		array.stringData = data;
		array.type = SerialType.STRING;
		return array;
	}

	public void set(int pos, String val) {
		assert pos >= 0 && pos <= stringData.length : "Out of bounds";
		assert type == SerialType.STRING : "Cannot put " + SerialType.getName(type) + " when a String is expected";
		stringData[pos] = val;
	}

	public String stringAt(int pos) {
		assert pos >= 0 && pos <= stringData.length : "Out of bounds";
		assert type == SerialType.STRING : "Cannot get " + SerialType.getName(type) + " from string array";
		return stringData[pos];
	}

	/**
	 * Sets the array name and updates related data fields
	 * 
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		assert name.length() < Short.MAX_VALUE : "Array name is too long";
		nameLength = (short) name.length();
		this.name = name.getBytes();
	}

	/**
	 * Writes the array data bytes into the given array starting at the given position
	 * 
	 * @param dst
	 *            The destination array
	 * @param ptr
	 *            Where to start in the destination array
	 * @return the new position of the pointer
	 */
	public int getBytes(byte[] dst, int ptr) {
		assert dst.length > ptr + getSize() : "Array Overflow when writing array's data";

		ptr = writeBytes(dst, ptr, CONTAINER_TYPE);
		ptr = writeBytes(dst, ptr, nameLength);
		ptr = writeBytes(dst, ptr, name);
		ptr = writeBytes(dst, ptr, type);
		ptr = writeBytes(dst, ptr, count);

		// Each type has its own array to store it since we can't template Java primitive types
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
			case SerialType.STRING:
				ptr = writeBytes(dst, ptr, stringData);
				break;
		}
		return ptr;
	}

	/**
	 * Computes the size of the data stored in the array
	 * 
	 * @return The stored data size
	 */
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
				// If the SerialArray contains Strings, we have to manually compute the data size
				int total = 0;
				for (String string : stringData)
					total += string.length() + 2;
				return total;
		}
		assert false;
		return -1;
	}

	/**
	 * Computes the size of the whole array
	 * 
	 * @return The complete size of bytes used by the array
	 */
	public int getSize() {
		return 1 + 2 + name.length + 1 + 4 + getDataSize();
	}

	/**
	 * Recovers the name of the SerialArray using the name byte array
	 * 
	 * @return The name of the SerialArray
	 */
	public String getName() {
		return ArrayUtils.stringOf(name);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("SerialArray [name=\"");
		sb.append(getName() + "\", ");
		sb.append("type=");
		sb.append(SerialType.getName(type) + ", ");
		sb.append("count=" + count + ", ");
		sb.append("value=");
		switch (type) {
			case SerialType.BYTE:
				sb.append(Arrays.toString(byteData));
				break;
			case SerialType.SHORT:
				sb.append(Arrays.toString(shortData));
				break;
			case SerialType.CHAR:
				sb.append(Arrays.toString(charData));
				break;
			case SerialType.INTEGER:
				sb.append(Arrays.toString(intData));
				break;
			case SerialType.LONG:
				sb.append(Arrays.toString(longData));
				break;
			case SerialType.FLOAT:
				sb.append(Arrays.toString(floatData));
				break;
			case SerialType.DOUBLE:
				sb.append(Arrays.toString(doubleData));
				break;
			case SerialType.BOOLEAN:
				sb.append(Arrays.toString(booleanData));
				break;
			case SerialType.STRING:
				sb.append(Arrays.toString(stringData));
				break;
		}
		sb.append("]");
		return sb.toString();
	}

}

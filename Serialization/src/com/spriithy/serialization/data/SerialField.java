/**
 * The MIT License (MIT)
 * Copyright (c) 2015 | Theophile Dano, Spriithy
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.spriithy.serialization.data;

import static com.spriithy.serialization.SerialWriter.*;

/**
 * @author Theophile Dano, Spriithy 2015
 */
public class SerialField {

	public static final byte	CONTAINER_TYPE	= SerialContainerType.FIELD;

	public short				nameLength;
	public byte[]				name;
	public byte					type;
	public byte[]				data;

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

	public void setName(String name) {
		assert name.length() < Short.MAX_VALUE : "Field name is too long";
		nameLength = (short) name.length();
		this.name = name.getBytes();
	}

	public int getBytes(byte[] dst, int ptr) {
		assert dst.length > ptr + getSize() : "Overflow !";
		ptr = writeBytes(dst, ptr, CONTAINER_TYPE);
		ptr = writeBytes(dst, ptr, nameLength);
		ptr = writeBytes(dst, ptr, name);
		ptr = writeBytes(dst, ptr, type);
		ptr = writeBytes(dst, ptr, data);
		return ptr;
	}

	public int getSize() {
		assert SerialType.getSize(type) == data.length : "Corrupted data !";
		return 1 + 2 + name.length + 1 + data.length;
	}

}

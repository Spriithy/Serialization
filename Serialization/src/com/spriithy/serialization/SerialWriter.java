/**
 * The MIT License (MIT)
 * Copyright (c) 2015 | Théophile Dano, Spriithy
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
package com.spriithy.serialization;

import com.spriithy.serialization.data.SerialType;

/**
 * @author Théophile Dano, Spriithy 2015
 */
public final class SerialWriter {

	public static final byte[]	HEADER	= "SDB".getBytes();
	public static final short	VERSION	= 0x0101;			// 1.1

	private SerialWriter() {}

	public static final int writeBytes(byte[] dst, int ptr, byte val) {
		assert dst.length > ptr + SerialType.getSize(SerialType.BYTE) : "Array overflow !";
		dst[ptr++] = val;
		return ptr;
	}

	public static final int writeBytes(byte[] dst, int ptr, byte[] src) {
		assert dst.length > ptr + SerialType.getSize(SerialType.BYTE) * src.length : "Array overflow !";
		for (byte b : src)
			ptr = writeBytes(dst, ptr, b);
		return ptr;
	}

	public static final int writeBytes(byte[] dst, int ptr, short val) {
		assert dst.length > ptr + SerialType.getSize(SerialType.SHORT) : "Array overflow !";
		dst[ptr++] = (byte) ((val >> 8) & 0xff);
		dst[ptr++] = (byte) ((val >> 0) & 0xff);
		return ptr;
	}

	public static final int writeBytes(byte[] dst, int ptr, short[] src) {
		assert dst.length > ptr + SerialType.getSize(SerialType.SHORT) * src.length : "Array overflow !";
		for (short s : src)
			ptr = writeBytes(dst, ptr, s);
		return ptr;
	}

	public static final int writeBytes(byte[] dst, int ptr, char val) {
		assert dst.length > ptr + SerialType.getSize(SerialType.CHAR) : "Array overflow !";
		dst[ptr++] = (byte) ((val >> 8) & 0xff);
		dst[ptr++] = (byte) ((val >> 0) & 0xff);
		return ptr;
	}

	public static final int writeBytes(byte[] dst, int ptr, char[] src) {
		assert dst.length > ptr + SerialType.getSize(SerialType.CHAR) * src.length : "Array overflow !";
		for (char c : src)
			ptr = writeBytes(dst, ptr, c);
		return ptr;
	}

	public static final int writeBytes(byte[] dst, int ptr, int val) {
		assert dst.length > ptr + SerialType.getSize(SerialType.INTEGER) : "Array overflow !";
		dst[ptr++] = (byte) ((val >> 24) & 0xff);
		dst[ptr++] = (byte) ((val >> 16) & 0xff);
		dst[ptr++] = (byte) ((val >> 8) & 0xff);
		dst[ptr++] = (byte) ((val >> 0) & 0xff);
		return ptr;
	}

	public static final int writeBytes(byte[] dst, int ptr, int[] src) {
		assert dst.length > ptr + SerialType.getSize(SerialType.INTEGER) * src.length : "Array overflow !";
		for (int i : src)
			ptr = writeBytes(dst, ptr, i);
		return ptr;
	}

	public static final int writeBytes(byte[] dst, int ptr, long val) {
		assert dst.length > ptr + SerialType.getSize(SerialType.LONG) : "Array overflow !";
		dst[ptr++] = (byte) ((val >> 56) & 0xff);
		dst[ptr++] = (byte) ((val >> 48) & 0xff);
		dst[ptr++] = (byte) ((val >> 40) & 0xff);
		dst[ptr++] = (byte) ((val >> 32) & 0xff);
		dst[ptr++] = (byte) ((val >> 24) & 0xff);
		dst[ptr++] = (byte) ((val >> 16) & 0xff);
		dst[ptr++] = (byte) ((val >> 8) & 0xff);
		dst[ptr++] = (byte) ((val >> 0) & 0xff);
		return ptr;
	}

	public static final int writeBytes(byte[] dst, int ptr, long[] src) {
		assert dst.length > ptr + SerialType.getSize(SerialType.LONG) * src.length : "Array overflow !";
		for (long l : src)
			ptr = writeBytes(dst, ptr, l);
		return ptr;
	}

	public static final int writeBytes(byte[] dst, int ptr, float val) {
		assert dst.length > ptr + SerialType.getSize(SerialType.FLOAT) : "Array overflow !";
		int bits = Float.floatToIntBits(val);
		return writeBytes(dst, ptr, bits);
	}

	public static final int writeBytes(byte[] dst, int ptr, float[] src) {
		assert dst.length > ptr + SerialType.getSize(SerialType.FLOAT) * src.length : "Array overflow !";
		for (float f : src)
			ptr = writeBytes(dst, ptr, f);
		return ptr;
	}

	public static final int writeBytes(byte[] dst, int ptr, double val) {
		assert dst.length > ptr + SerialType.getSize(SerialType.DOUBLE) : "Array overflow !";
		long bits = Double.doubleToLongBits(val);
		return writeBytes(dst, ptr, bits);
	}

	public static final int writeBytes(byte[] dst, int ptr, double[] src) {
		assert dst.length > ptr + SerialType.getSize(SerialType.DOUBLE) * src.length : "Array overflow !";
		for (double d : src)
			ptr = writeBytes(dst, ptr, d);
		return ptr;
	}

	public static final int writeBytes(byte[] dst, int ptr, boolean val) {
		assert dst.length > ptr + SerialType.getSize(SerialType.BOOLEAN) : "Array overflow !";
		dst[ptr++] = (byte) (val ? 1 : 0);
		return ptr;
	}

	public static final int writeBytes(byte[] dst, int ptr, boolean[] src) {
		assert dst.length > ptr + SerialType.getSize(SerialType.BOOLEAN) * src.length : "Array overflow !";
		for (boolean b : src)
			ptr = writeBytes(dst, ptr, b);
		return ptr;
	}

	public static final int writeBytes(byte[] dst, int ptr, String val) {
		assert dst.length > ptr + val.length() + 2 : "Array overflow !";
		ptr = writeBytes(dst, ptr, (short) val.length());
		return writeBytes(dst, ptr, val.getBytes());
	}

	public static final int writeBytes(byte[] dst, int ptr, String[] src) {
		int total = 0;
		for (String string : src)
			total += string.length() + 2;
		assert dst.length > ptr + total : "Array overflow !";
		for (String str : src)
			ptr = writeBytes(dst, ptr, str);
		return ptr;
	}

}

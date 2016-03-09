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

/**
 * @author Théophile Dano, Spriithy 2015
 */
public final class SerialWriter {

	public static final byte[]	HEADER	= "GRK".getBytes();
	public static final short	VERSION	= 0x0101;			// 1.1

	private SerialWriter() {}

	public static final int writeBytes(byte[] dst, int ptr, byte[] src) {
		for (byte b : src)
			ptr = writeBytes(dst, ptr, b);
		return ptr;
	}

	public static final int writeBytes(byte[] dst, int ptr, boolean val) {
		dst[ptr++] = (byte) (val ? 1 : 0);
		return ptr;
	}

	public static final int writeBytes(byte[] dst, int ptr, byte val) {
		dst[ptr++] = val;
		return ptr;
	}

	public static final int writeBytes(byte[] dst, int ptr, short val) {
		dst[ptr++] = (byte) ((val >> 8) & 0xff);
		dst[ptr++] = (byte) ((val >> 0) & 0xff);
		return ptr;
	}

	public static final int writeBytes(byte[] dst, int ptr, char val) {
		dst[ptr++] = (byte) ((val >> 8) & 0xff);
		dst[ptr++] = (byte) ((val >> 0) & 0xff);
		return ptr;
	}

	public static final int writeBytes(byte[] dst, int ptr, int val) {
		dst[ptr++] = (byte) ((val >> 24) & 0xff);
		dst[ptr++] = (byte) ((val >> 16) & 0xff);
		dst[ptr++] = (byte) ((val >> 8) & 0xff);
		dst[ptr++] = (byte) ((val >> 0) & 0xff);
		return ptr;
	}

	public static final int writeBytes(byte[] dst, int ptr, long val) {
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

	public static final int writeBytes(byte[] dst, int ptr, float val) {
		int bits = Float.floatToIntBits(val);
		return writeBytes(dst, ptr, bits);
	}

	public static final int writeBytes(byte[] dst, int ptr, double val) {
		long bits = Double.doubleToLongBits(val);
		return writeBytes(dst, ptr, bits);
	}

	public static final int writeBytes(byte[] dst, int ptr, String val) {
		ptr = writeBytes(dst, ptr, (short) val.length());
		return writeBytes(dst, ptr, val.getBytes());
	}

}

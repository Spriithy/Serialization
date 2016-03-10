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
public final class SerialReader {

	private SerialReader() {}

	public static final byte readByte(byte[] src, int ptr) {
		return src[ptr];
	}

	public static final short readShort(byte[] src, int ptr) {
		return (short) ((src[ptr] << 8) | (src[ptr + 1]));
	}

	public static final char readChar(byte[] src, int ptr) {
		return (char) (src[ptr]);
	}

	public static final int readInt(byte[] src, int ptr) {
		return (int) ((src[ptr] << 24) | (src[ptr + 1] << 16) | (src[ptr + 2] << 8) | (src[ptr + 3]));
	}

	public static final long readLong(byte[] src, int ptr) {
		return (int) ((src[ptr] << 56) | (src[ptr + 1] << 48) | (src[ptr + 2] << 40) | (src[ptr + 3] << 32) | (src[ptr + 4] << 24) | (src[ptr + 5] << 16) | (src[ptr + 6] << 8) | (src[ptr + 7]));
	}

	public static final float readFloat(byte[] src, int ptr) {
		return Float.intBitsToFloat(readInt(src, ptr));
	}

	public static final double readDouble(byte[] src, int ptr) {
		return Double.longBitsToDouble(readInt(src, ptr));
	}

	public static final boolean readBoolean(byte[] src, int ptr) {
		assert src[ptr] == 0 || src[ptr] == 1 : "Can only convert 1 or 0 to boolean";
		return src[ptr] != 0;
	}

	public static final String readString(byte[] src, int ptr) {
		short length = readShort(src, ptr++);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++)
			sb.append(readChar(src, ++ptr));
		return sb.toString();
	}

}

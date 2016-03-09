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
package com.spriithy.utils;

/**
 * @author Théophile Dano, Spriithy 2015
 */
public final class ArrayUtils<T> {

	private ArrayUtils() {}

	public static final void print(byte[] src) {
		if (src == null) System.out.println("[]");
		else {
			System.out.print("[");
			for (int i = 0; i < src.length; i++)
				System.out.print(src[i] + ((i + 1 != src.length) ? ", " : ""));
			System.out.println("]");
		}
	}

	public static final int count(byte[] src, byte val) {
		int count = 0;
		for (byte b : src)
			if (b == val) count++;
		return count;
	}

	public static final void copy(byte[] dst, int at, byte[] src, int from, int count) {
		for (int i = from; i < from + count; i++)
			put(dst, i - from + at, src[i]);
	}

	public static final byte[] extend(byte[] src, int size) {
		byte[] dst = new byte[src.length + size];
		copy(dst, 0, src, 0, src.length);
		return dst;
	}

	public static final byte[] shorten(byte[] src, int size) {
		byte[] dst = new byte[src.length - size];
		copy(dst, 0, src, 0, src.length - size);
		return dst;
	}

	public static final byte[] reverse(byte[] src) {
		return slice(src, src.length - 1, 0);
	}

	public static final byte[] slice(byte[] src, int start, int end) {
		Validator.ifFalse(start <= src.length || end <= src.length, "Out of bounds");
		byte[] dst = new byte[0];
		if (end - start != 0) {
			for (int i = 0; i <= Math.abs(end - start); i++) {
				if (end - start >= 0) dst = append(dst, src[start + i]);
				else dst = append(dst, src[start - i]);
			}
		} else return new byte[] {};
		return dst;
	}

	public static final byte[] append(byte[] src, byte val) {
		byte[] dst = extend(src, 1);
		dst[src.length] = val;
		return dst;
	}

	public static final byte[] delete(byte[] src, int at) {
		byte[] dst = new byte[0];
		int i = 0;
		for (byte b : src)
			if (i++ != at) dst = append(dst, b);
		return dst;
	}

	public static final byte[] put(byte[] src, int at, byte val) {
		if (at >= src.length) src = append(src, val);
		else src[at] = val;
		return src;
	}

}

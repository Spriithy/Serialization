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
package com.spriithy.utils;

/**
 * @author Theophile Dano, Spriithy 2015
 */
public final class ArrayUtils {

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

	public static final void print(int[] src) {
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

	public static final int count(int[] src, int val) {
		int count = 0;
		for (int i : src)
			if (i == val) count++;
		return count;
	}

	public static final void copy(byte[] dst, int at, byte[] src, int from, int count) {
		for (int i = from; i < from + count; i++)
			put(dst, i - from + at, src[i]);
	}

	public static final void copy(int[] dst, int at, int[] src, int from, int count) {
		for (int i = from; i < from + count; i++)
			put(dst, i - from + at, src[i]);
	}

	public static final int[] join(int[]... arrays) {
		int[] dst;
		int size = 0;
		int s = 0;
		for (int[] array : arrays)
			size += array.length;
		dst = new int[size];
		for (int[] array : arrays) {
			copy(dst, s, array, 0, array.length);
			s += array.length;
		}
		return dst;
	}

	public static final byte[] join(byte[]... arrays) {
		byte[] dst;
		int size = 0;
		int s = 0;
		for (byte[] array : arrays)
			size += array.length;
		dst = new byte[size];
		for (byte[] array : arrays) {
			copy(dst, s, array, 0, array.length);
			s += array.length;
		}
		return dst;
	}

	public static final byte[] extend(byte[] src, int size) {
		byte[] dst = new byte[src.length + size];
		copy(dst, 0, src, 0, src.length);
		return dst;
	}

	public static final int[] extend(int[] src, int size) {
		int[] dst = new int[src.length + size];
		copy(dst, 0, src, 0, src.length);
		return dst;
	}

	public static final byte[] shorten(byte[] src, int size) {
		return extend(src, -size);
	}

	public static final int[] shorten(int[] src, int size) {
		return extend(src, -size);
	}

	public static final byte[] reverse(byte[] src) {
		return slice(src, src.length - 1, 0);
	}

	public static final int[] reverse(int[] src) {
		return slice(src, src.length - 1, 0);
	}

	public static final byte[] slice(byte[] src, int start, int end) {
		assert (start <= src.length && end <= src.length) : "Out of bounds";
		byte[] dst = new byte[0];
		if (end - start != 0) {
			for (int i = 0; i <= Math.abs(end - start); i++) {
				if (end - start >= 0) dst = append(dst, src[start + i]);
				else dst = append(dst, src[start - i]);
			}
		} else return new byte[] {};
		return dst;
	}

	public static final int[] slice(int[] src, int start, int end) {
		assert (start <= src.length && end <= src.length) : "Out of bounds";
		int[] dst = new int[0];
		if (end - start != 0) {
			for (int i = 0; i <= Math.abs(end - start); i++) {
				if (end - start >= 0) dst = append(dst, src[start + i]);
				else dst = append(dst, src[start - i]);
			}
		} else return new int[] {};
		return dst;
	}

	public static final byte[] append(byte[] src, byte val) {
		byte[] dst = extend(src, 1);
		dst[src.length] = val;
		return dst;
	}

	public static final int[] append(int[] src, int val) {
		int[] dst = extend(src, 1);
		dst[src.length] = val;
		return dst;
	}

	public static final int[] insert(int[] src, int val, int at) {
		assert at <= src.length && at >= 0 : "Out of bounds";
		int[] dst = new int[src.length + 1];
		copy(dst, 0, src, 0, at);
		put(dst, at, val);
		copy(dst, at + 1, src, at, src.length - at);
		return dst;
	}

	public static final byte[] delete(byte[] src, int at) {
		byte[] dst = new byte[0];
		int i = 0;
		for (byte b : src)
			if (i++ != at) dst = append(dst, b);
		return dst;
	}

	public static final int[] delete(int[] src, int at) {
		int[] dst = new int[0];
		int i = 0;
		for (int v : src)
			if (i++ != at) dst = append(dst, v);
		return dst;
	}

	public static final int firstIndexOf(byte[] src, byte val) {
		for (int i = 0; i < src.length; i++)
			if (src[i] == val) return i;
		return -1;
	}

	public static final int lastIndexOf(byte[] src, byte val) {
		for (int i = src.length; i > 0; i--)
			if (src[i] == val) return i;
		return -1;
	}

	public static final int[] indexesOf(byte[] src, byte val) {
		int[] idxs = new int[0];
		for (int i = 0; i < src.length; i++)
			if (src[i] == val) idxs = append(idxs, i);
		return idxs;
	}

	public static final int firstIndexOf(int[] src, int val) {
		for (int i = 0; i < src.length; i++)
			if (src[i] == val) return i;
		return -1;
	}

	public static final int lastIndexOf(int[] src, int val) {
		for (int i = src.length; i > 0; i--)
			if (src[i] == val) return i;
		return -1;
	}

	public static final int[] indexesOf(int[] src, int val) {
		int[] idxs = new int[0];
		for (int i = 0; i < src.length; i++)
			if (src[i] == val) idxs = append(idxs, i);
		return idxs;
	}

	public static final byte[] put(byte[] src, int at, byte val) {
		if (at >= src.length) src = append(src, val);
		else src[at] = val;
		return src;
	}

	public static final int[] put(int[] src, int at, int val) {
		if (at >= src.length) src = append(src, val);
		else src[at] = val;
		return src;
	}

}

package com.spriithy.utils;

/**
 * Contains several array utilities such as appending, deleting, copying,
 * counting etc
 * 
 * @author Theophile Dano, Spriithy 2015
 */
public class ArrayUtils {

	/**
	 * Ensures that ArrayUtils will not be instanciated
	 */
	private ArrayUtils() {}

	/**
	 * Appends a value to to the given array. Copies the array into a
	 * (length + 1)-long array and sets last value to be equal to the
	 * value wanted
	 * 
	 * @param src
	 *            The source array
	 * @param val
	 *            The value to append
	 * @return A new array with the value appended
	 */
	public static boolean[] append(boolean[] src, boolean val) {
		boolean[] dst = extend(src, 1);
		dst[src.length] = val;
		return dst;
	}

	/**
	 * Appends a value to to the given array. Copies the array into a
	 * (length + 1)-long array and sets last value to be equal to the
	 * value wanted
	 * 
	 * @param src
	 *            The source array
	 * @param val
	 *            The value to append
	 * @return A new array with the value appended
	 */
	public static byte[] append(byte[] src, byte val) {
		byte[] dst = extend(src, 1);
		dst[src.length] = val;
		return dst;
	}

	/**
	 * Appends a value to to the given array. Copies the array into a
	 * (length + 1)-long array and sets last value to be equal to the
	 * value wanted
	 * 
	 * @param src
	 *            The source array
	 * @param val
	 *            The value to append
	 * @return A new array with the value appended
	 */
	public static char[] append(char[] src, char val) {
		char[] dst = extend(src, 1);
		dst[src.length] = val;
		return dst;
	}

	/**
	 * Appends a value to to the given array. Copies the array into a
	 * (length + 1)-long array and sets last value to be equal to the
	 * value wanted
	 * 
	 * @param src
	 *            The source array
	 * @param val
	 *            The value to append
	 * @return A new array with the value appended
	 */
	public static double[] append(double[] src, double val) {
		double[] dst = extend(src, 1);
		dst[src.length] = val;
		return dst;
	}

	/**
	 * Appends a value to to the given array. Copies the array into a
	 * (length + 1)-long array and sets last value to be equal to the
	 * value wanted
	 * 
	 * @param src
	 *            The source array
	 * @param val
	 *            The value to append
	 * @return A new array with the value appended
	 */
	public static float[] append(float[] src, float val) {
		float[] dst = extend(src, 1);
		dst[src.length] = val;
		return dst;
	}

	/**
	 * Appends a value to to the given array. Copies the array into a
	 * (length + 1)-long array and sets last value to be equal to the
	 * value wanted
	 * 
	 * @param src
	 *            The source array
	 * @param val
	 *            The value to append
	 * @return A new array with the value appended
	 */
	public static int[] append(int[] src, int val) {
		int[] dst = extend(src, 1);
		dst[src.length] = val;
		return dst;
	}

	/**
	 * Appends a value to to the given array. Copies the array into a
	 * (length + 1)-long array and sets last value to be equal to the
	 * value wanted
	 * 
	 * @param src
	 *            The source array
	 * @param val
	 *            The value to append
	 * @return A new array with the value appended
	 */
	public static long[] append(long[] src, long val) {
		long[] dst = extend(src, 1);
		dst[src.length] = val;
		return dst;
	}

	/**
	 * Appends a value to to the given array. Copies the array into a
	 * (length + 1)-long array and sets last value to be equal to the
	 * value wanted
	 * 
	 * @param src
	 *            The source array
	 * @param val
	 *            The value to append
	 * @return A new array with the value appended
	 */
	public static short[] append(short[] src, short val) {
		short[] dst = extend(src, 1);
		dst[src.length] = val;
		return dst;
	}

	/**
	 * Copies the source array into the destination array from a given point for
	 * a certain amount of elements.
	 * 
	 * @param dst
	 *            The destination array
	 * @param at
	 *            The starting point to copy to in the destination array
	 * @param src
	 *            The source array (the one to copies value from)
	 * @param from
	 *            The starting point to copy from in the source array
	 * @param count
	 *            The count of elements to copy
	 */
	public static void copy(boolean[] dst, int at, boolean[] src, int from, int count) {
		for (int i = from; i < from + count; i++)
			dst[i - from + at] = src[i];
	}

	/**
	 * Copies the source array into the destination array from a given point for
	 * a certain amount of elements.
	 * 
	 * @param dst
	 *            The destination array
	 * @param at
	 *            The starting point to copy to in the destination array
	 * @param src
	 *            The source array (the one to copies value from)
	 * @param from
	 *            The starting point to copy from in the source array
	 * @param count
	 *            The count of elements to copy
	 */
	public static void copy(byte[] dst, int at, byte[] src, int from, int count) {
		for (int i = from; i < from + count; i++)
			dst[i - from + at] = src[i];
	}

	/**
	 * Copies the source array into the destination array from a given point for
	 * a certain amount of elements.
	 * 
	 * @param dst
	 *            The destination array
	 * @param at
	 *            The starting point to copy to in the destination array
	 * @param src
	 *            The source array (the one to copies value from)
	 * @param from
	 *            The starting point to copy from in the source array
	 * @param count
	 *            The count of elements to copy
	 */
	public static void copy(char[] dst, int at, char[] src, int from, int count) {
		for (int i = from; i < from + count; i++)
			dst[i - from + at] = src[i];
	}

	/**
	 * Copies the source array into the destination array from a given point for
	 * a certain amount of elements.
	 * 
	 * @param dst
	 *            The destination array
	 * @param at
	 *            The starting point to copy to in the destination array
	 * @param src
	 *            The source array (the one to copies value from)
	 * @param from
	 *            The starting point to copy from in the source array
	 * @param count
	 *            The count of elements to copy
	 */
	public static void copy(double[] dst, int at, double[] src, int from, int count) {
		for (int i = from; i < from + count; i++)
			dst[i - from + at] = src[i];
	}

	/**
	 * Copies the source array into the destination array from a given point for
	 * a certain amount of elements.
	 * 
	 * @param dst
	 *            The destination array
	 * @param at
	 *            The starting point to copy to in the destination array
	 * @param src
	 *            The source array (the one to copies value from)
	 * @param from
	 *            The starting point to copy from in the source array
	 * @param count
	 *            The count of elements to copy
	 */
	public static void copy(float[] dst, int at, float[] src, int from, int count) {
		for (int i = from; i < from + count; i++)
			dst[i - from + at] = src[i];
	}

	/**
	 * Copies the source array into the destination array from a given point for
	 * a certain amount of elements.
	 * 
	 * @param dst
	 *            The destination array
	 * @param at
	 *            The starting point to copy to in the destination array
	 * @param src
	 *            The source array (the one to copies value from)
	 * @param from
	 *            The starting point to copy from in the source array
	 * @param count
	 *            The count of elements to copy
	 */
	public static void copy(int[] dst, int at, int[] src, int from, int count) {
		for (int i = from; i < from + count; i++)
			dst[i - from + at] = src[i];
	}

	/**
	 * Copies the source array into the destination array from a given point for
	 * a certain amount of elements.
	 * 
	 * @param dst
	 *            The destination array
	 * @param at
	 *            The starting point to copy to in the destination array
	 * @param src
	 *            The source array (the one to copies value from)
	 * @param from
	 *            The starting point to copy from in the source array
	 * @param count
	 *            The count of elements to copy
	 */
	public static void copy(long[] dst, int at, long[] src, int from, int count) {
		for (int i = from; i < from + count; i++)
			dst[i - from + at] = src[i];
	}

	/**
	 * Copies the source array into the destination array from a given point for
	 * a certain amount of elements.
	 * 
	 * @param dst
	 *            The destination array
	 * @param at
	 *            The starting point to copy to in the destination array
	 * @param src
	 *            The source array (the one to copies value from)
	 * @param from
	 *            The starting point to copy from in the source array
	 * @param count
	 *            The count of elements to copy
	 */
	public static void copy(short[] dst, int at, short[] src, int from, int count) {
		for (int i = from; i < from + count; i++)
			dst[i - from + at] = src[i];
	}

	/**
	 * Copies the source array into the destination array from a given point for
	 * a certain amount of elements.
	 * 
	 * @param dst
	 *            The destination array
	 * @param at
	 *            The starting point to copy to in the destination array
	 * @param src
	 *            The source array (the one to copies value from)
	 * @param from
	 *            The starting point to copy from in the source array
	 * @param count
	 *            The count of elements to copy
	 */
	public static <T> void copy(T[] dst, int at, T[] src, int from, int count) {
		for (int i = from; i < from + count; i++)
			dst[i - from + at] = src[i];
	}

	/**
	 * Determines the amount of elements in the source array that are equal to
	 * the given value
	 * 
	 * @param src
	 *            The source array to look into
	 * @param val
	 *            The value to count
	 * @return The count of val in src
	 */
	public static int count(byte[] src, byte val) {
		int count = 0;
		for (byte b : src)
			if (b == val) count++;
		return count;
	}

	/**
	 * Determines the amount of elements in the source array that are equal to
	 * the given value
	 * 
	 * @param src
	 *            The source array to look into
	 * @param val
	 *            The value to count
	 * @return The count of val in src
	 */
	public static int count(char[] src, char val) {
		int count = 0;
		for (char c : src)
			if (c == val) count++;
		return count;
	}

	/**
	 * Determines the amount of elements in the source array that are equal to
	 * the given value
	 * 
	 * @param src
	 *            The source array to look into
	 * @param val
	 *            The value to count
	 * @return The count of val in src
	 */
	public static int count(double[] src, double val) {
		int count = 0;
		for (double d : src)
			if (d == val) count++;
		return count;
	}

	/**
	 * Determines the amount of elements in the source array that are equal to
	 * the given value
	 * 
	 * @param src
	 *            The source array to look into
	 * @param val
	 *            The value to count
	 * @return The count of val in src
	 */
	public static int count(float[] src, float val) {
		int count = 0;
		for (float f : src)
			if (f == val) count++;
		return count;
	}

	/**
	 * Determines the amount of elements in the source array that are equal to
	 * the given value
	 * 
	 * @param src
	 *            The source array to look into
	 * @param val
	 *            The value to count
	 * @return The count of val in src
	 */
	public static int count(int[] src, int val) {
		int count = 0;
		for (int i : src)
			if (i == val) count++;
		return count;
	}

	/**
	 * Determines the amount of elements in the source array that are equal to
	 * the given value
	 * 
	 * @param src
	 *            The source array to look into
	 * @param val
	 *            The value to count
	 * @return The count of val in src
	 */
	public static int count(long[] src, long val) {
		int count = 0;
		for (long l : src)
			if (l == val) count++;
		return count;
	}

	/**
	 * Determines the amount of elements in the source array that are equal to
	 * the given value
	 * 
	 * @param src
	 *            The source array to look into
	 * @param val
	 *            The value to count
	 * @return The count of val in src
	 */
	public static int count(short[] src, short val) {
		int count = 0;
		for (short s : src)
			if (s == val) count++;
		return count;
	}

	/**
	 * Determines the amount of elements in the source array that are equal to
	 * the given value
	 * 
	 * @param src
	 *            The source array to look into
	 * @param val
	 *            The value to count
	 * @return The count of val in src
	 */
	public static <T> int count(T[] src, T val) {
		int count = 0;
		for (T t : src)
			if (t == val || t.equals(val)) count++;
		return count;
	}

	/**
	 * Removes an element in the source array at the 'at' position
	 * 
	 * @param src
	 *            The source array to remove an element from
	 * @param at
	 *            The position of the element to delete
	 * @return The new array
	 */
	public static boolean[] delete(boolean[] src, int at) {
		boolean[] dst = new boolean[0];
		int i = 0;
		for (boolean v : src)
			if (i++ != at) dst = append(dst, v);
		return dst;
	}

	/**
	 * Removes an element in the source array at the 'at' position
	 * 
	 * @param src
	 *            The source array to remove an element from
	 * @param at
	 *            The position of the element to delete
	 * @return The new array
	 */
	public static byte[] delete(byte[] src, int at) {
		byte[] dst = new byte[0];
		int i = 0;
		for (byte b : src)
			if (i++ != at) dst = append(dst, b);
		return dst;
	}

	/**
	 * Removes an element in the source array at the 'at' position
	 * 
	 * @param src
	 *            The source array to remove an element from
	 * @param at
	 *            The position of the element to delete
	 * @return The new array
	 */
	public static char[] delete(char[] src, int at) {
		char[] dst = new char[0];
		int i = 0;
		for (char v : src)
			if (i++ != at) dst = append(dst, v);
		return dst;
	}

	/**
	 * Removes an element in the source array at the 'at' position
	 * 
	 * @param src
	 *            The source array to remove an element from
	 * @param at
	 *            The position of the element to delete
	 * @return The new array
	 */
	public static double[] delete(double[] src, int at) {
		double[] dst = new double[0];
		int i = 0;
		for (double v : src)
			if (i++ != at) dst = append(dst, v);
		return dst;
	}

	/**
	 * Removes an element in the source array at the 'at' position
	 * 
	 * @param src
	 *            The source array to remove an element from
	 * @param at
	 *            The position of the element to delete
	 * @return The new array
	 */
	public static float[] delete(float[] src, int at) {
		float[] dst = new float[0];
		int i = 0;
		for (float v : src)
			if (i++ != at) dst = append(dst, v);
		return dst;
	}

	/**
	 * Removes an element in the source array at the 'at' position
	 * 
	 * @param src
	 *            The source array to remove an element from
	 * @param at
	 *            The position of the element to delete
	 * @return The new array
	 */
	public static int[] delete(int[] src, int at) {
		int[] dst = new int[0];
		int i = 0;
		for (int v : src)
			if (i++ != at) dst = append(dst, v);
		return dst;
	}

	/**
	 * Removes an element in the source array at the 'at' position
	 * 
	 * @param src
	 *            The source array to remove an element from
	 * @param at
	 *            The position of the element to delete
	 * @return The new array
	 */
	public static long[] delete(long[] src, int at) {
		long[] dst = new long[0];
		int i = 0;
		for (long v : src)
			if (i++ != at) dst = append(dst, v);
		return dst;
	}

	/**
	 * Removes an element in the source array at the 'at' position
	 * 
	 * @param src
	 *            The source array to remove an element from
	 * @param at
	 *            The position of the element to delete
	 * @return The new array
	 */
	public static short[] delete(short[] src, int at) {
		short[] dst = new short[0];
		int i = 0;
		for (short v : src)
			if (i++ != at) dst = append(dst, v);
		return dst;
	}

	/**
	 * Extends the given array to be size-longer
	 * 
	 * @param src
	 *            The source array to extend
	 * @param size
	 *            The size of the extension
	 * @return The extended array
	 */
	public static boolean[] extend(boolean[] src, int size) {
		boolean[] dst = new boolean[src.length + size];
		copy(dst, 0, src, 0, src.length);
		return dst;
	}

	/**
	 * Extends the given array to be size-longer
	 * 
	 * @param src
	 *            The source array to extend
	 * @param size
	 *            The size of the extension
	 * @return The extended array
	 */
	public static byte[] extend(byte[] src, int size) {
		byte[] dst = new byte[src.length + size];
		copy(dst, 0, src, 0, src.length);
		return dst;
	}

	/**
	 * Extends the given array to be size-longer
	 * 
	 * @param src
	 *            The source array to extend
	 * @param size
	 *            The size of the extension
	 * @return The extended array
	 */
	public static char[] extend(char[] src, int size) {
		char[] dst = new char[src.length + size];
		copy(dst, 0, src, 0, src.length);
		return dst;
	}

	/**
	 * Extends the given array to be size-longer
	 * 
	 * @param src
	 *            The source array to extend
	 * @param size
	 *            The size of the extension
	 * @return The extended array
	 */
	public static double[] extend(double[] src, int size) {
		double[] dst = new double[src.length + size];
		copy(dst, 0, src, 0, src.length);
		return dst;
	}

	/**
	 * Extends the given array to be size-longer
	 * 
	 * @param src
	 *            The source array to extend
	 * @param size
	 *            The size of the extension
	 * @return The extended array
	 */
	public static float[] extend(float[] src, int size) {
		float[] dst = new float[src.length + size];
		copy(dst, 0, src, 0, src.length);
		return dst;
	}

	/**
	 * Extends the given array to be size-longer
	 * 
	 * @param src
	 *            The source array to extend
	 * @param size
	 *            The size of the extension
	 * @return The extended array
	 */
	public static int[] extend(int[] src, int size) {
		int[] dst = new int[src.length + size];
		copy(dst, 0, src, 0, src.length);
		return dst;
	}

	/**
	 * Extends the given array to be size-longer
	 * 
	 * @param src
	 *            The source array to extend
	 * @param size
	 *            The size of the extension
	 * @return The extended array
	 */
	public static long[] extend(long[] src, int size) {
		long[] dst = new long[src.length + size];
		copy(dst, 0, src, 0, src.length);
		return dst;
	}

	/**
	 * Extends the given array to be size-longer
	 * 
	 * @param src
	 *            The source array to extend
	 * @param size
	 *            The size of the extension
	 * @return The extended array
	 */
	public static short[] extend(short[] src, int size) {
		short[] dst = new short[src.length + size];
		copy(dst, 0, src, 0, src.length);
		return dst;
	}

	/**
	 * Builds up a String of the given source array. String given is formatted
	 * as follows :
	 * 
	 * <pre>
	 * [e1, e2, ..., en]
	 * </pre>
	 * 
	 * @param src
	 *            The source array to get string from
	 * @return The String associated to the array
	 */
	public static String getString(boolean[] src) {
		StringBuilder sb = new StringBuilder();
		if (src == null) sb.append("[]");
		else {
			sb.append("[");
			for (int i = 0; i < src.length; i++)
				sb.append(src[i] + ((i + 1 != src.length) ? ", " : ""));
			sb.append("]");
		}
		return sb.toString();
	}

	/**
	 * Builds up a String of the given source array. String given is formatted
	 * as follows :
	 * 
	 * <pre>
	 * [e1, e2, ..., en]
	 * </pre>
	 * 
	 * @param src
	 *            The source array to get string from
	 * @return The String associated to the array
	 */
	public static String getString(byte[] src) {
		StringBuilder sb = new StringBuilder();
		if (src == null) sb.append("[]");
		else {
			sb.append("[");
			for (int i = 0; i < src.length; i++)
				sb.append(src[i] + ((i + 1 != src.length) ? ", " : ""));
			sb.append("]");
		}
		return sb.toString();
	}

	/**
	 * Builds up a String of the given source array. String given is formatted
	 * as follows :
	 * 
	 * <pre>
	 * [e1, e2, ..., en]
	 * </pre>
	 * 
	 * @param src
	 *            The source array to get string from
	 * @return The String associated to the array
	 */
	public static String getString(char[] src) {
		StringBuilder sb = new StringBuilder();
		if (src == null) sb.append("[]");
		else {
			sb.append("[");
			for (int i = 0; i < src.length; i++)
				sb.append(src[i] + ((i + 1 != src.length) ? ", " : ""));
			sb.append("]");
		}
		return sb.toString();
	}

	/**
	 * Builds up a String of the given source array. String given is formatted
	 * as follows :
	 * 
	 * <pre>
	 * [e1, e2, ..., en]
	 * </pre>
	 * 
	 * @param src
	 *            The source array to get string from
	 * @return The String associated to the array
	 */
	public static String getString(double[] src) {
		StringBuilder sb = new StringBuilder();
		if (src == null) sb.append("[]");
		else {
			sb.append("[");
			for (int i = 0; i < src.length; i++)
				sb.append(src[i] + ((i + 1 != src.length) ? ", " : ""));
			sb.append("]");
		}
		return sb.toString();
	}

	/**
	 * Builds up a String of the given source array. String given is formatted
	 * as follows :
	 * 
	 * <pre>
	 * [e1, e2, ..., en]
	 * </pre>
	 * 
	 * @param src
	 *            The source array to get string from
	 * @return The String associated to the array
	 */
	public static String getString(float[] src) {
		StringBuilder sb = new StringBuilder();
		if (src == null) sb.append("[]");
		else {
			sb.append("[");
			for (int i = 0; i < src.length; i++)
				sb.append(src[i] + ((i + 1 != src.length) ? ", " : ""));
			sb.append("]");
		}
		return sb.toString();
	}

	/**
	 * Builds up a String of the given source array. String given is formatted
	 * as follows :
	 * 
	 * <pre>
	 * [e1, e2, ..., en]
	 * </pre>
	 * 
	 * @param src
	 *            The source array to get string from
	 * @return The String associated to the array
	 */
	public static String getString(int[] src) {
		StringBuilder sb = new StringBuilder();
		if (src == null) sb.append("[]");
		else {
			sb.append("[");
			for (int i = 0; i < src.length; i++)
				sb.append(src[i] + ((i + 1 != src.length) ? ", " : ""));
			sb.append("]");
		}
		return sb.toString();
	}

	/**
	 * Builds up a String of the given source array. String given is formatted
	 * as follows :
	 * 
	 * <pre>
	 * [e1, e2, ..., en]
	 * </pre>
	 * 
	 * @param src
	 *            The source array to get string from
	 * @return The String associated to the array
	 */
	public static String getString(long[] src) {
		StringBuilder sb = new StringBuilder();
		if (src == null) sb.append("[]");
		else {
			sb.append("[");
			for (int i = 0; i < src.length; i++)
				sb.append(src[i] + ((i + 1 != src.length) ? ", " : ""));
			sb.append("]");
		}
		return sb.toString();
	}

	/**
	 * Builds up a String of the given source array. String given is formatted
	 * as follows :
	 * 
	 * <pre>
	 * [e1, e2, ..., en]
	 * </pre>
	 * 
	 * @param src
	 *            The source array to get string from
	 * @return The String associated to the array
	 */
	public static String getString(short[] src) {
		StringBuilder sb = new StringBuilder();
		if (src == null) sb.append("[]");
		else {
			sb.append("[");
			for (int i = 0; i < src.length; i++)
				sb.append(src[i] + ((i + 1 != src.length) ? ", " : ""));
			sb.append("]");
		}
		return sb.toString();
	}

	/**
	 * Builds up a String of the given source array. String given is formatted
	 * as follows :
	 * 
	 * <pre>
	 * [e1, e2, ..., en]
	 * </pre>
	 * 
	 * @param src
	 *            The source array to get string from
	 * @return The String associated to the array
	 */
	public static <T> String getString(T[] src) {
		StringBuilder sb = new StringBuilder();
		if (src == null) sb.append("[]");
		else {
			sb.append("[");
			for (int i = 0; i < src.length; i++)
				sb.append(src[i].toString() + ((i + 1 != src.length) ? ", " : ""));
			sb.append("]");
		}
		return sb.toString();
	}

	/**
	 * Inserts a value at the given position in the source array
	 * 
	 * @param src
	 *            The source array to insert into
	 * @param at
	 *            The position of the new element to insert
	 * @param val
	 *            The value to insert
	 * @return The source array with the value inserted
	 */
	public static boolean[] insert(boolean[] src, int at, boolean val) {
		assert at <= src.length && at >= 0 : "Out of bounds";
		boolean[] dst = new boolean[src.length + 1];
		copy(dst, 0, src, 0, at);
		dst[at] = val;
		copy(dst, at + 1, src, at, src.length - at);
		return dst;
	}

	/**
	 * Inserts a value at the given position in the source array
	 * 
	 * @param src
	 *            The source array to insert into
	 * @param at
	 *            The position of the new element to insert
	 * @param val
	 *            The value to insert
	 * @return The source array with the value inserted
	 */
	public static byte[] insert(byte[] src, int at, byte val) {
		assert at <= src.length && at >= 0 : "Out of bounds";
		byte[] dst = new byte[src.length + 1];
		copy(dst, 0, src, 0, at);
		dst[at] = val;
		copy(dst, at + 1, src, at, src.length - at);
		return dst;
	}

	/**
	 * Inserts a value at the given position in the source array
	 * 
	 * @param src
	 *            The source array to insert into
	 * @param at
	 *            The position of the new element to insert
	 * @param val
	 *            The value to insert
	 * @return The source array with the value inserted
	 */
	public static char[] insert(char[] src, int at, char val) {
		assert at <= src.length && at >= 0 : "Out of bounds";
		char[] dst = new char[src.length + 1];
		copy(dst, 0, src, 0, at);
		dst[at] = val;
		copy(dst, at + 1, src, at, src.length - at);
		return dst;
	}

	/**
	 * Inserts a value at the given position in the source array
	 * 
	 * @param src
	 *            The source array to insert into
	 * @param at
	 *            The position of the new element to insert
	 * @param val
	 *            The value to insert
	 * @return The source array with the value inserted
	 */
	public static double[] insert(double[] src, int at, double val) {
		assert at <= src.length && at >= 0 : "Out of bounds";
		double[] dst = new double[src.length + 1];
		copy(dst, 0, src, 0, at);
		dst[at] = val;
		copy(dst, at + 1, src, at, src.length - at);
		return dst;
	}

	/**
	 * Inserts a value at the given position in the source array
	 * 
	 * @param src
	 *            The source array to insert into
	 * @param at
	 *            The position of the new element to insert
	 * @param val
	 *            The value to insert
	 * @return The source array with the value inserted
	 */
	public static float[] insert(float[] src, int at, float val) {
		assert at <= src.length && at >= 0 : "Out of bounds";
		float[] dst = new float[src.length + 1];
		copy(dst, 0, src, 0, at);
		dst[at] = val;
		copy(dst, at + 1, src, at, src.length - at);
		return dst;
	}

	/**
	 * Inserts a value at the given position in the source array
	 * 
	 * @param src
	 *            The source array to insert into
	 * @param at
	 *            The position of the new element to insert
	 * @param val
	 *            The value to insert
	 * @return The source array with the value inserted
	 */
	public static int[] insert(int[] src, int at, int val) {
		assert at <= src.length && at >= 0 : "Out of bounds";
		int[] dst = new int[src.length + 1];
		copy(dst, 0, src, 0, at);
		dst[at] = val;
		copy(dst, at + 1, src, at, src.length - at);
		return dst;
	}

	/**
	 * Inserts a value at the given position in the source array
	 * 
	 * @param src
	 *            The source array to insert into
	 * @param at
	 *            The position of the new element to insert
	 * @param val
	 *            The value to insert
	 * @return The source array with the value inserted
	 */
	public static long[] insert(long[] src, int at, long val) {
		assert at <= src.length && at >= 0 : "Out of bounds";
		long[] dst = new long[src.length + 1];
		copy(dst, 0, src, 0, at);
		dst[at] = val;
		copy(dst, at + 1, src, at, src.length - at);
		return dst;
	}

	/**
	 * Inserts a value at the given position in the source array
	 * 
	 * @param src
	 *            The source array to insert into
	 * @param at
	 *            The position of the new element to insert
	 * @param val
	 *            The value to insert
	 * @return The source array with the value inserted
	 */
	public static short[] insert(short[] src, int at, short val) {
		assert at <= src.length && at >= 0 : "Out of bounds";
		short[] dst = new short[src.length + 1];
		copy(dst, 0, src, 0, at);
		dst[at] = val;
		copy(dst, at + 1, src, at, src.length - at);
		return dst;
	}

	/**
	 * Merges as many arrays as given into one
	 * 
	 * @param arrays
	 *            The list of arrays to merge
	 * @return The joined arrays
	 */
	public static boolean[] join(boolean[]... arrays) {
		boolean[] dst;
		int size = 0;
		int s = 0;
		for (boolean[] array : arrays)
			size += array.length;
		dst = new boolean[size];
		for (boolean[] array : arrays) {
			copy(dst, s, array, 0, array.length);
			s += array.length;
		}
		return dst;
	}

	/**
	 * Merges as many arrays as given into one
	 * 
	 * @param arrays
	 *            The list of arrays to merge
	 * @return The joined arrays
	 */
	public static byte[] join(byte[]... arrays) {
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

	/**
	 * Merges as many arrays as given into one
	 * 
	 * @param arrays
	 *            The list of arrays to merge
	 * @return The joined arrays
	 */
	public static char[] join(char[]... arrays) {
		char[] dst;
		int size = 0;
		int s = 0;
		for (char[] array : arrays)
			size += array.length;
		dst = new char[size];
		for (char[] array : arrays) {
			copy(dst, s, array, 0, array.length);
			s += array.length;
		}
		return dst;
	}

	/**
	 * Merges as many arrays as given into one
	 * 
	 * @param arrays
	 *            The list of arrays to merge
	 * @return The joined arrays
	 */
	public static double[] join(double[]... arrays) {
		double[] dst;
		int size = 0;
		int s = 0;
		for (double[] array : arrays)
			size += array.length;
		dst = new double[size];
		for (double[] array : arrays) {
			copy(dst, s, array, 0, array.length);
			s += array.length;
		}
		return dst;
	}

	/**
	 * Merges as many arrays as given into one
	 * 
	 * @param arrays
	 *            The list of arrays to merge
	 * @return The joined arrays
	 */
	public static float[] join(float[]... arrays) {
		float[] dst;
		int size = 0;
		int s = 0;
		for (float[] array : arrays)
			size += array.length;
		dst = new float[size];
		for (float[] array : arrays) {
			copy(dst, s, array, 0, array.length);
			s += array.length;
		}
		return dst;
	}

	/**
	 * Merges as many arrays as given into one
	 * 
	 * @param arrays
	 *            The list of arrays to merge
	 * @return The joined arrays
	 */
	public static int[] join(int[]... arrays) {
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

	/**
	 * Merges as many arrays as given into one
	 * 
	 * @param arrays
	 *            The list of arrays to merge
	 * @return The joined arrays
	 */
	public static long[] join(long[]... arrays) {
		long[] dst;
		int size = 0;
		int s = 0;
		for (long[] array : arrays)
			size += array.length;
		dst = new long[size];
		for (long[] array : arrays) {
			copy(dst, s, array, 0, array.length);
			s += array.length;
		}
		return dst;
	}

	/**
	 * Merges as many arrays as given into one
	 * 
	 * @param arrays
	 *            The list of arrays to merge
	 * @return The joined arrays
	 */
	public static short[] join(short[]... arrays) {
		short[] dst;
		int size = 0;
		int s = 0;
		for (short[] array : arrays)
			size += array.length;
		dst = new short[size];
		for (short[] array : arrays) {
			copy(dst, s, array, 0, array.length);
			s += array.length;
		}
		return dst;
	}

	/**
	 * Reverse the elements position in the source array
	 * 
	 * @param src
	 *            The source array to reverse
	 * @return The reversed array
	 */
	public static boolean[] reverse(boolean[] src) {
		return slice(src, src.length - 1, 0);
	}

	/**
	 * Reverse the elements position in the source array
	 * 
	 * @param src
	 *            The source array to reverse
	 * @return The reversed array
	 */
	public static byte[] reverse(byte[] src) {
		return slice(src, src.length - 1, 0);
	}

	/**
	 * Reverse the elements position in the source array
	 * 
	 * @param src
	 *            The source array to reverse
	 * @return The reversed array
	 */
	public static char[] reverse(char[] src) {
		return slice(src, src.length - 1, 0);
	}

	/**
	 * Reverse the elements position in the source array
	 * 
	 * @param src
	 *            The source array to reverse
	 * @return The reversed array
	 */
	public static double[] reverse(double[] src) {
		return slice(src, src.length - 1, 0);
	}

	/**
	 * Reverse the elements position in the source array
	 * 
	 * @param src
	 *            The source array to reverse
	 * @return The reversed array
	 */
	public static float[] reverse(float[] src) {
		return slice(src, src.length - 1, 0);
	}

	/**
	 * Reverse the elements position in the source array
	 * 
	 * @param src
	 *            The source array to reverse
	 * @return The reversed array
	 */
	public static int[] reverse(int[] src) {
		return slice(src, src.length - 1, 0);
	}

	/**
	 * Reverse the elements position in the source array
	 * 
	 * @param src
	 *            The source array to reverse
	 * @return The reversed array
	 */
	public static long[] reverse(long[] src) {
		return slice(src, src.length - 1, 0);
	}

	/**
	 * Reverse the elements position in the source array
	 * 
	 * @param src
	 *            The source array to reverse
	 * @return The reversed array
	 */
	public static short[] reverse(short[] src) {
		return slice(src, src.length - 1, 0);
	}

	/**
	 * Shortens the array by size elements from the end
	 * 
	 * @param src
	 *            The source array to shorten
	 * @param size
	 *            The count of elements to remove
	 * @return The shortened array
	 */
	public static boolean[] shorten(boolean[] src, int size) {
		return extend(src, -size);
	}

	/**
	 * Shortens the array by size elements from the end
	 * 
	 * @param src
	 *            The source array to shorten
	 * @param size
	 *            The count of elements to remove
	 * @return The shortened array
	 */
	public static byte[] shorten(byte[] src, int size) {
		return extend(src, -size);
	}

	/**
	 * Shortens the array by size elements from the end
	 * 
	 * @param src
	 *            The source array to shorten
	 * @param size
	 *            The count of elements to remove
	 * @return The shortened array
	 */
	public static char[] shorten(char[] src, int size) {
		return extend(src, -size);
	}

	/**
	 * Shortens the array by size elements from the end
	 * 
	 * @param src
	 *            The source array to shorten
	 * @param size
	 *            The count of elements to remove
	 * @return The shortened array
	 */
	public static double[] shorten(double[] src, int size) {
		return extend(src, -size);
	}

	/**
	 * Shortens the array by size elements from the end
	 * 
	 * @param src
	 *            The source array to shorten
	 * @param size
	 *            The count of elements to remove
	 * @return The shortened array
	 */
	public static float[] shorten(float[] src, int size) {
		return extend(src, -size);
	}

	/**
	 * Shortens the array by size elements from the end
	 * 
	 * @param src
	 *            The source array to shorten
	 * @param size
	 *            The count of elements to remove
	 * @return The shortened array
	 */
	public static int[] shorten(int[] src, int size) {
		return extend(src, -size);
	}

	/**
	 * Shortens the array by size elements from the end
	 * 
	 * @param src
	 *            The source array to shorten
	 * @param size
	 *            The count of elements to remove
	 * @return The shortened array
	 */
	public static long[] shorten(long[] src, int size) {
		return extend(src, -size);
	}

	/**
	 * Shortens the array by size elements from the end
	 * 
	 * @param src
	 *            The source array to shorten
	 * @param size
	 *            The count of elements to remove
	 * @return The shortened array
	 */
	public static short[] shorten(short[] src, int size) {
		return extend(src, -size);
	}

	/**
	 * Creates a sliced version of the array between the two given indexes. This
	 * algorithm has 3 different behaviors :
	 * <ul>
	 * <li>
	 * <code>start < end</code> :<br>
	 * This is the most standard case. The method will behave as expected, that
	 * is to say, it will return an array of the elements bewteen
	 * <code>src[start]</code> and <code>src[end]</code>
	 * </li>
	 * <li>
	 * <code>start = end</code> :<br>
	 * The method returns an empty array.
	 * </li>
	 * <li>
	 * <code>start > end</code> :<br>
	 * The method will now return the elements between the two given indexes,
	 * but in the reversed order
	 * </li>
	 * </ul>
	 * 
	 * @param src
	 *            The source array to slice
	 * @param start
	 *            The starting index
	 * @param end
	 *            The ending index
	 * @return The sliced array
	 */
	public static boolean[] slice(boolean[] src, int start, int end) {
		assert (start <= src.length && end <= src.length) : "Out of bounds";
		boolean[] dst = new boolean[0];
		if (end - start != 0) {
			for (int i = 0; i <= Math.abs(end - start); i++) {
				if (end - start >= 0) dst = append(dst, src[start + i]);
				else dst = append(dst, src[start - i]);
			}
		} else return new boolean[] {};
		return dst;
	}

	/**
	 * Creates a sliced version of the array between the two given indexes. This
	 * algorithm has 3 different behaviors :
	 * <ul>
	 * <li>
	 * <code>start < end</code> :<br>
	 * This is the most standard case. The method will behave as expected, that
	 * is to say, it will return an array of the elements bewteen
	 * <code>src[start]</code> and <code>src[end]</code>
	 * </li>
	 * <li>
	 * <code>start = end</code> :<br>
	 * The method returns an empty array.
	 * </li>
	 * <li>
	 * <code>start > end</code> :<br>
	 * The method will now return the elements between the two given indexes,
	 * but in the reversed order
	 * </li>
	 * </ul>
	 * 
	 * @param src
	 *            The source array to slice
	 * @param start
	 *            The starting index
	 * @param end
	 *            The ending index
	 * @return The sliced array
	 */
	public static byte[] slice(byte[] src, int start, int end) {
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

	/**
	 * Creates a sliced version of the array between the two given indexes. This
	 * algorithm has 3 different behaviors :
	 * <ul>
	 * <li>
	 * <code>start < end</code> :<br>
	 * This is the most standard case. The method will behave as expected, that
	 * is to say, it will return an array of the elements bewteen
	 * <code>src[start]</code> and <code>src[end]</code>
	 * </li>
	 * <li>
	 * <code>start = end</code> :<br>
	 * The method returns an empty array.
	 * </li>
	 * <li>
	 * <code>start > end</code> :<br>
	 * The method will now return the elements between the two given indexes,
	 * but in the reversed order
	 * </li>
	 * </ul>
	 * 
	 * @param src
	 *            The source array to slice
	 * @param start
	 *            The starting index
	 * @param end
	 *            The ending index
	 * @return The sliced array
	 */
	public static char[] slice(char[] src, int start, int end) {
		assert (start <= src.length && end <= src.length) : "Out of bounds";
		char[] dst = new char[0];
		if (end - start != 0) {
			for (int i = 0; i <= Math.abs(end - start); i++) {
				if (end - start >= 0) dst = append(dst, src[start + i]);
				else dst = append(dst, src[start - i]);
			}
		} else return new char[] {};
		return dst;
	}

	/**
	 * Creates a sliced version of the array between the two given indexes. This
	 * algorithm has 3 different behaviors :
	 * <ul>
	 * <li>
	 * <code>start < end</code> :<br>
	 * This is the most standard case. The method will behave as expected, that
	 * is to say, it will return an array of the elements bewteen
	 * <code>src[start]</code> and <code>src[end]</code>
	 * </li>
	 * <li>
	 * <code>start = end</code> :<br>
	 * The method returns an empty array.
	 * </li>
	 * <li>
	 * <code>start > end</code> :<br>
	 * The method will now return the elements between the two given indexes,
	 * but in the reversed order
	 * </li>
	 * </ul>
	 * 
	 * @param src
	 *            The source array to slice
	 * @param start
	 *            The starting index
	 * @param end
	 *            The ending index
	 * @return The sliced array
	 */
	public static double[] slice(double[] src, int start, int end) {
		assert (start <= src.length && end <= src.length) : "Out of bounds";
		double[] dst = new double[0];
		if (end - start != 0) {
			for (int i = 0; i <= Math.abs(end - start); i++) {
				if (end - start >= 0) dst = append(dst, src[start + i]);
				else dst = append(dst, src[start - i]);
			}
		} else return new double[] {};
		return dst;
	}

	/**
	 * Creates a sliced version of the array between the two given indexes. This
	 * algorithm has 3 different behaviors :
	 * <ul>
	 * <li>
	 * <code>start < end</code> :<br>
	 * This is the most standard case. The method will behave as expected, that
	 * is to say, it will return an array of the elements bewteen
	 * <code>src[start]</code> and <code>src[end]</code>
	 * </li>
	 * <li>
	 * <code>start = end</code> :<br>
	 * The method returns an empty array.
	 * </li>
	 * <li>
	 * <code>start > end</code> :<br>
	 * The method will now return the elements between the two given indexes,
	 * but in the reversed order
	 * </li>
	 * </ul>
	 * 
	 * @param src
	 *            The source array to slice
	 * @param start
	 *            The starting index
	 * @param end
	 *            The ending index
	 * @return The sliced array
	 */
	public static float[] slice(float[] src, int start, int end) {
		assert (start <= src.length && end <= src.length) : "Out of bounds";
		float[] dst = new float[0];
		if (end - start != 0) {
			for (int i = 0; i <= Math.abs(end - start); i++) {
				if (end - start >= 0) dst = append(dst, src[start + i]);
				else dst = append(dst, src[start - i]);
			}
		} else return new float[] {};
		return dst;
	}

	/**
	 * Creates a sliced version of the array between the two given indexes. This
	 * algorithm has 3 different behaviors :
	 * <ul>
	 * <li>
	 * <code>start < end</code> :<br>
	 * This is the most standard case. The method will behave as expected, that
	 * is to say, it will return an array of the elements bewteen
	 * <code>src[start]</code> and <code>src[end]</code>
	 * </li>
	 * <li>
	 * <code>start = end</code> :<br>
	 * The method returns an empty array.
	 * </li>
	 * <li>
	 * <code>start > end</code> :<br>
	 * The method will now return the elements between the two given indexes,
	 * but in the reversed order
	 * </li>
	 * </ul>
	 * 
	 * @param src
	 *            The source array to slice
	 * @param start
	 *            The starting index
	 * @param end
	 *            The ending index
	 * @return The sliced array
	 */
	public static int[] slice(int[] src, int start, int end) {
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

	/**
	 * Creates a sliced version of the array between the two given indexes. This
	 * algorithm has 3 different behaviors :
	 * <ul>
	 * <li>
	 * <code>start < end</code> :<br>
	 * This is the most standard case. The method will behave as expected, that
	 * is to say, it will return an array of the elements bewteen
	 * <code>src[start]</code> and <code>src[end]</code>
	 * </li>
	 * <li>
	 * <code>start = end</code> :<br>
	 * The method returns an empty array.
	 * </li>
	 * <li>
	 * <code>start > end</code> :<br>
	 * The method will now return the elements between the two given indexes,
	 * but in the reversed order
	 * </li>
	 * </ul>
	 * 
	 * @param src
	 *            The source array to slice
	 * @param start
	 *            The starting index
	 * @param end
	 *            The ending index
	 * @return The sliced array
	 */
	public static long[] slice(long[] src, int start, int end) {
		assert (start <= src.length && end <= src.length) : "Out of bounds";
		long[] dst = new long[0];
		if (end - start != 0) {
			for (int i = 0; i <= Math.abs(end - start); i++) {
				if (end - start >= 0) dst = append(dst, src[start + i]);
				else dst = append(dst, src[start - i]);
			}
		} else return new long[] {};
		return dst;
	}

	/**
	 * Creates a sliced version of the array between the two given indexes. This
	 * algorithm has 3 different behaviors :
	 * <ul>
	 * <li>
	 * <code>start < end</code> :<br>
	 * This is the most standard case. The method will behave as expected, that
	 * is to say, it will return an array of the elements bewteen
	 * <code>src[start]</code> and <code>src[end]</code>
	 * </li>
	 * <li>
	 * <code>start = end</code> :<br>
	 * The method returns an empty array.
	 * </li>
	 * <li>
	 * <code>start > end</code> :<br>
	 * The method will now return the elements between the two given indexes,
	 * but in the reversed order
	 * </li>
	 * </ul>
	 * 
	 * @param src
	 *            The source array to slice
	 * @param start
	 *            The starting index
	 * @param end
	 *            The ending index
	 * @return The sliced array
	 */
	public static short[] slice(short[] src, int start, int end) {
		assert (start <= src.length && end <= src.length) : "Out of bounds";
		short[] dst = new short[0];
		if (end - start != 0) {
			for (int i = 0; i <= Math.abs(end - start); i++) {
				if (end - start >= 0) dst = append(dst, src[start + i]);
				else dst = append(dst, src[start - i]);
			}
		} else return new short[] {};
		return dst;
	}

	/**
	 * Creates a string from letter codes stored in an array
	 * 
	 * @param data
	 *            The source array to convert into a String
	 * @return The interpreted String
	 */
	public static String stringOf(byte[] data) {
		StringBuilder sb = new StringBuilder();
		for (byte b : data)
			sb.append((char) b);
		return sb.toString();
	}

	/**
	 * Creates a string from letter codes stored in an array
	 * 
	 * @param data
	 *            The source array to convert into a String
	 * @return The interpreted String
	 */
	public static String stringOf(char[] data) {
		StringBuilder sb = new StringBuilder();
		for (char c : data)
			sb.append(c);
		return sb.toString();
	}

	/**
	 * Creates a string from letter codes stored in an array
	 * 
	 * @param data
	 *            The source array to convert into a String
	 * @return The interpreted String
	 */
	public static String stringOf(int[] data) {
		StringBuilder sb = new StringBuilder();
		for (int i : data)
			sb.append((char) i);
		return sb.toString();
	}

	/**
	 * Creates a string from letter codes stored in an array
	 * 
	 * @param data
	 *            The source array to convert into a String
	 * @return The interpreted String
	 */
	public static String stringOf(long[] data) {
		StringBuilder sb = new StringBuilder();
		for (long l : data)
			sb.append((char) l);
		return sb.toString();
	}

	/**
	 * Creates a string from letter codes stored in an array
	 * 
	 * @param data
	 *            The source array to convert into a String
	 * @return The interpreted String
	 */
	public static String stringOf(short[] data) {
		StringBuilder sb = new StringBuilder();
		for (short s : data)
			sb.append((char) s);
		return sb.toString();
	}

}

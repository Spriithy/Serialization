package com.spriithy.serialization;

/**
 * @author Theophile Dano, Spriithy 2015
 */
public class SerialWriter {

	public static byte[]	HEADER	= "SDB".getBytes();
	public static short		VERSION	= 0x0101;			// 1.1

	private SerialWriter() {}

	public static int writeBytes(byte[] dst, int ptr, byte val) {
		dst[ptr++] = val;
		return ptr;
	}

	public static int writeBytes(byte[] dst, int ptr, byte[] src) {
		for (byte b : src)
			ptr = writeBytes(dst, ptr, b);
		return ptr;
	}

	public static int writeBytes(byte[] dst, int ptr, short val) {
		dst[ptr++] = (byte) ((val >> 8) & 0xff);
		dst[ptr++] = (byte) ((val >> 0) & 0xff);
		return ptr;
	}

	public static int writeBytes(byte[] dst, int ptr, short[] src) {
		for (short s : src)
			ptr = writeBytes(dst, ptr, s);
		return ptr;
	}

	public static int writeBytes(byte[] dst, int ptr, char val) {
		dst[ptr++] = (byte) ((val >> 8) & 0xff);
		dst[ptr++] = (byte) ((val >> 0) & 0xff);
		return ptr;
	}

	public static int writeBytes(byte[] dst, int ptr, char[] src) {
		for (char c : src)
			ptr = writeBytes(dst, ptr, c);
		return ptr;
	}

	public static int writeBytes(byte[] dst, int ptr, int val) {
		dst[ptr++] = (byte) ((val >> 24) & 0xff);
		dst[ptr++] = (byte) ((val >> 16) & 0xff);
		dst[ptr++] = (byte) ((val >> 8) & 0xff);
		dst[ptr++] = (byte) ((val >> 0) & 0xff);
		return ptr;
	}

	public static int writeBytes(byte[] dst, int ptr, int[] src) {
		for (int i : src)
			ptr = writeBytes(dst, ptr, i);
		return ptr;
	}

	public static int writeBytes(byte[] dst, int ptr, long val) {
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

	public static int writeBytes(byte[] dst, int ptr, long[] src) {
		for (long l : src)
			ptr = writeBytes(dst, ptr, l);
		return ptr;
	}

	public static int writeBytes(byte[] dst, int ptr, float val) {
		int bits = Float.floatToIntBits(val);
		return writeBytes(dst, ptr, bits);
	}

	public static int writeBytes(byte[] dst, int ptr, float[] src) {
		for (float f : src)
			ptr = writeBytes(dst, ptr, f);
		return ptr;
	}

	public static int writeBytes(byte[] dst, int ptr, double val) {
		long bits = Double.doubleToLongBits(val);
		return writeBytes(dst, ptr, bits);
	}

	public static int writeBytes(byte[] dst, int ptr, double[] src) {
		for (double d : src)
			ptr = writeBytes(dst, ptr, d);
		return ptr;
	}

	public static int writeBytes(byte[] dst, int ptr, boolean val) {
		dst[ptr++] = (byte) (val ? 1 : 0);
		return ptr;
	}

	public static int writeBytes(byte[] dst, int ptr, boolean[] src) {
		for (boolean b : src)
			ptr = writeBytes(dst, ptr, b);
		return ptr;
	}

	public static int writeBytes(byte[] dst, int ptr, String val) {
		ptr = writeBytes(dst, ptr, (short) val.length());
		return writeBytes(dst, ptr, val.getBytes());
	}

	public static int writeBytes(byte[] dst, int ptr, String[] src) {
		for (String str : src)
			ptr = writeBytes(dst, ptr, str);
		return ptr;
	}

}

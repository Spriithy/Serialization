package com.spriithy.serialization;

/**
 * @author Theophile Dano, Spriithy 2015
 */
public class SerialReader {

	private SerialReader() {}

	public static byte readByte(byte[] src, int ptr) {
		return src[ptr];
	}

	public static short readShort(byte[] src, int ptr) {
		return (short) ((src[ptr] << 8) | (src[ptr + 1]));
	}

	public static char readChar(byte[] src, int ptr) {
		return (char) (src[ptr]);
	}

	public static int readInt(byte[] src, int ptr) {
		return (int) ((src[ptr] << 24) | (src[ptr + 1] << 16) | (src[ptr + 2] << 8) | (src[ptr + 3]));
	}

	public static long readLong(byte[] src, int ptr) {
		return (int) ((src[ptr] << 56) | (src[ptr + 1] << 48) | (src[ptr + 2] << 40) | (src[ptr + 3] << 32) | (src[ptr + 4] << 24) | (src[ptr + 5] << 16) | (src[ptr + 6] << 8) | (src[ptr + 7]));
	}

	public static float readFloat(byte[] src, int ptr) {
		return Float.intBitsToFloat(readInt(src, ptr));
	}

	public static double readDouble(byte[] src, int ptr) {
		return Double.longBitsToDouble(readInt(src, ptr));
	}

	public static boolean readBoolean(byte[] src, int ptr) {
		assert src[ptr] == 0 || src[ptr] == 1 : "Can only convert 1 or 0 to boolean";
		return src[ptr] != 0;
	}

	public static String readString(byte[] src, int ptr) {
		short length = readShort(src, ptr++);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++)
			sb.append(readChar(src, ++ptr));
		return sb.toString();
	}

}

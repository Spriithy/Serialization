package com.spriithy.utils;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public final class FileUtils {

	public static final int	VALUE_MODE	= 0x0;
	public static final int	BINARY_MODE	= 0x1;

	private FileUtils() {}

	public static void saveToFile(String path, byte[] data, int mode) {
		try {
			switch (mode) {
			case VALUE_MODE:
				PrintWriter writer = new PrintWriter(path, "UTF-8");
				for (byte b : data)
					writer.print(b + " ");
				writer.close();
				break;
			case BINARY_MODE:
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(path));
				stream.write(data);
				stream.close();
				break;
			default:
				assert false;
				break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

package com.spriithy.utils;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public final class FileUtils {

	private FileUtils() {}

	public static void saveToFile(String path, byte[] data) {
		try {
			BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(path));
			stream.write(data);
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

import java.util.Random;

import javax.activation.UnsupportedDataTypeException;

import com.spriithy.serialization.data.SerialField;
import com.spriithy.utils.BinaryUtils;
import com.spriithy.utils.FileUtils;

/**
 * @author Theophile Dano, Spriithy 2016
 */
public class Main {

	static Random random = new Random();

	public static void main(String[] args) {
		SerialField f2 = SerialField.Integer("Child2", Integer.MAX_VALUE);
		byte[] arr = new byte[f2.getSize()];
		f2.getBytes(arr, 0);
		BinaryUtils.printHex(arr);
		SerialField f1 = SerialField.Generic("Child1", f2);
		SerialField field = SerialField.Generic("Parent1", f1);

		byte[] stream = new byte[field.getSize()];
		field.getBytes(stream, 0);
		BinaryUtils.printHex(stream);

		try {
			SerialField dt = SerialField.Deserialize(stream, 0);
			System.out.println(dt);
		} catch (UnsupportedDataTypeException e) {
			e.printStackTrace();
		}

		FileUtils.saveToFile("test.sdb", stream, FileUtils.BINARY_MODE);
	}

}

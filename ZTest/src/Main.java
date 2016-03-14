import java.util.Random;

import com.spriithy.serialization.data.SerialArray;
import com.spriithy.serialization.data.SerialField;
import com.spriithy.serialization.data.SerialObject;
import com.spriithy.utils.FileUtils;

/**
 * @author Theophile Dano, Spriithy 2015
 */
public class Main {

	static Random random = new Random();

	public static void main(String[] args) {
		int[] data = new int[10];
		for (int i = 0; i < data.length; i++)
			data[i] = random.nextInt();
		SerialArray array = SerialArray.Integer("RandomNumbers", data);
		SerialField field = SerialField.String("str", "FooBarBaz");
		SerialObject object = new SerialObject("Entity");
		object.addField(field);
		object.addArray(array);
		SerialField gField = SerialField.Generic("GenericBoy", field);
		byte[] dt = new byte[gField.getSize()];
		gField.getBytes(dt, 0);
		
		try {
			SerialField read = SerialField.Deserialize(dt, 0);
			System.out.println(read);
		} catch (Exception e) {
			e.printStackTrace();
		}

		byte[] stream = new byte[object.getSize()];
		object.getBytes(stream, 0);
		FileUtils.saveToFile("test.sdb", stream, FileUtils.BINARY_MODE);
	}

}

import com.spriithy.serialization.SerialField;
import com.spriithy.serialization.fields.SerialIntField;
import com.spriithy.utils.ArrayUtils;

import static com.spriithy.utils.BinaryUtils.*;

/**
 * @author Theophile Dano, Spriithy 2015
 */
public class Main {

	public static void main(String[] args) {

		int[] data = {9,9,2,3,4,4,1,3,2,9};
		ArrayUtils.print(ArrayUtils.join(data, new int[] { 1 }, new int[] {10, 27} ));

	}

}

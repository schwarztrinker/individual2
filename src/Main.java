import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {


		Baggage baggage1, baggage2, baggage3,baggage4;
		baggage1 = new Baggage("01", "clothes", 23.3, BaggageType.Normal, "LH380");
		baggage2 = new Baggage("02", "clothes", 20.7, BaggageType.Normal, "LH680");
		baggage3 = new Baggage("03", "weapon", 24.4, BaggageType.Bulky, "LH380");
		baggage4 = new Baggage("04", "clothes", 18.0, BaggageType.Normal, "LH580");

		ArrayList<Baggage> array = new ArrayList<Baggage>();
		array.add(baggage1);
		array.add(baggage2);
		array.add(baggage3);
		array.add(baggage4);

		Airport airport = new Airport("FFM", array);

		HashMap<String,ArrayList<Baggage>> sortedarray = new HashMap<>();


	}

}

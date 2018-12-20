import java.util.ArrayList;
import java.util.HashMap;

public interface IBaggageSortingUnit {
	public HashMap<BaggageType, ArrayList<Baggage>> sortBaggageType(ArrayList<Baggage> baggageArray);
	public HashMap<String, ArrayList<Baggage>> sortBaggageFlightNumber(ArrayList<Baggage> baggageArray);
}

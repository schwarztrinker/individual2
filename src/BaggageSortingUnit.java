import java.util.ArrayList;
import java.util.HashMap;

public class BaggageSortingUnit implements IBaggageSortingUnit{
	int id;
	ArrayList<Baggage> baggageArray; 
	ArrayList<Baggage> sortedBaggageArrayType;

	public HashMap<BaggageType, ArrayList<Baggage>> sortBaggageType(ArrayList<Baggage> baggageArray){
		HashMap<BaggageType, ArrayList<Baggage>> result = new HashMap<BaggageType, ArrayList<Baggage>>();
		
		for(Baggage baggage : baggageArray){
			BaggageType type = baggage.getBaggageType();
			
			if(!result.containsKey(type)) {
				ArrayList<Baggage> sortedList = new ArrayList<Baggage>();
				result.put(type, sortedList);
			}
			
			ArrayList<Baggage> sortedList = result.get(type);
			
			sortedList.add(baggage);
			result.put(type, sortedList);
		}
		
		return result;
	}
	
	public HashMap<String, ArrayList<Baggage>> sortBaggageFlightNumber(ArrayList<Baggage> baggageArray){
		HashMap<String, ArrayList<Baggage>> result = new HashMap<String, ArrayList<Baggage>>();
		
		for(Baggage baggage : baggageArray){
			String flightNumber = baggage.getBaggageFlightNumber();
			
			if(!result.containsKey(flightNumber)) {
				ArrayList<Baggage> sortedList = new ArrayList<Baggage>();
				result.put(flightNumber, sortedList);
			}
			
			ArrayList<Baggage> sortedList = result.get(flightNumber);
			
			sortedList.add(baggage);
			result.put(flightNumber, sortedList);
		}
		
		return result;
	}
}

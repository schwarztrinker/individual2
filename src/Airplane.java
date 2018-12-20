import java.util.ArrayList;
import java.util.HashMap;

public class Airplane {
	public String flightNumber;
	public HashMap<BaggageType, ArrayList<Baggage>> baggages;
	
	public Airplane(String flightNumber,HashMap<BaggageType, ArrayList<Baggage>> baggages) {
		this.flightNumber = flightNumber;
		this.baggages = baggages;
	}
}

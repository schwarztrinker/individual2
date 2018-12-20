import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.Test;


class BaggageSortingUnitTest {

	@Test
	void test() {
		
		
		Baggage baggage1 = new Baggage("1", "test", 0.4, null, "LH 380");
		ArrayList<Baggage> baggageArray = new ArrayList<Baggage>();
		
		
		baggageArray.add(baggage1);
		
		
		BaggageSortingUnit baggageSortingUnit = new BaggageSortingUnit();
		
		baggageSortingUnit.sortBaggageType(baggageArray);
		baggageSortingUnit.sortBaggageFlightNumber(baggageArray);
		
	}



}

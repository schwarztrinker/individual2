



import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class AirportTest {

	@Test
	void ConstructorTest() {
		ArrayList<Baggage> baggages = null;
		
		Airport airport = new Airport("FFM", baggages);
	}

}

import java.util.ArrayList;

public class Airport {
	String name;
	BaggageSortingUnit baggageSortingUnit;
	ArrayList<Airplane> airplanes;
	ArrayList<Baggage> baggages;
	
	public Airport(String name, int amountBaggageSortingUnit, ArrayList<Baggage> baggages){
		this.name = name;
		BaggageSortingUnit baggageSortingUnit = new BaggageSortingUnit();	
		airplanes = new ArrayList<Airplane>();
	}
	
	public void addAirplane(Airplane airplane){
		airplanes.add(airplane);		
	}
	
	public void setAirplanes(ArrayList<Airplane> airplanes){
		this.airplanes = airplanes;
	}
	

	
	
}

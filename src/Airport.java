import java.util.ArrayList;
import java.util.HashMap;

public class Airport {
	String name;
	BaggageSortingUnit baggageSortingUnit;
	ArrayList<Airplane> airplanes;
	ArrayList<Baggage> baggages;
	
	public Airport(String name, ArrayList<Baggage> baggages){
		this.name = name;
		baggageSortingUnit = new BaggageSortingUnit();
		airplanes = new ArrayList<Airplane>();
		this.baggages = new ArrayList<Baggage>();
	}
	
	public void addAirplane(Airplane airplane){
		airplanes.add(airplane);		
	}
	
	public void setAirplanes(ArrayList<Airplane> airplanes){
		this.airplanes = airplanes;
	}
	

	
	
}

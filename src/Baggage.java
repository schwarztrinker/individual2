public class Baggage {
	public String uuid;
	public String content;
	public double weight;
	public BaggageType baggageType;
	public String flightNumber;

//Constructor
public Baggage(String uuid, String content, double weight, BaggageType baggageType, String flightNumber) {
	this.uuid = uuid;
	this.content = content;
	this.weight = weight;
	this.baggageType = baggageType;
	this.flightNumber = flightNumber;
}

//Getter and setter
public String getUuid() {
	return uuid;
}

public void setUuid(String uuid) {
	this.uuid = uuid;
}

public String getContent() {
	return content;
}

public void setContent(String content) {
	this.content = content;
}

public double getWeight() {
	return weight;
}

public void setWeight(double weight) {
	this.weight = weight;
}

public BaggageType getBaggageType() {
	return baggageType;
}

public void setBaggageType(BaggageType baggageType) {
	this.baggageType = baggageType;
}

public String getBaggageFlightNumber(){
	return flightNumber;
}

} 


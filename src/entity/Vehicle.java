package entity;

public class Vehicle {
	
    private String VehicleNumber;
    private int ClientID;
    private String Type;
    private String Color;
    private String Size;
    private double WeightKg;
	
	public String getVehicleNumber() {
		return VehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		VehicleNumber = vehicleNumber;
	}
	public int getClientID() {
		return ClientID;
	}
	public void setClientID(int clientID) {
		ClientID = clientID;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public String getSize() {
		return Size;
	}
	public void setSize(String size) {
		Size = size;
	}
	public double getWeightKg() {
		return WeightKg;
	}
	public void setWeightKg(double weightKg) {
		WeightKg = weightKg;
	}
    
    
	
}

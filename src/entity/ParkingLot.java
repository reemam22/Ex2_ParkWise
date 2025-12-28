package entity;

public class ParkingLot {
	
	private int LotID;
    private String LotName;
    private String Address;
    private String City;
    private int AvailableSpaces;
	
	public int getLotID() {
		return LotID;
	}
	public void setLotID(int lotID) {
		LotID = lotID;
	}
	public String getLotName() {
		return LotName;
	}
	public void setLotName(String lotName) {
		LotName = lotName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getAvailableSpaces() {
		return AvailableSpaces;
	}
	public void setAvailableSpaces(int availableSpaces) {
		AvailableSpaces = availableSpaces;
	}
    
    
	
   

}

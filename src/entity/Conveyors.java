package entity;

public class Conveyors {
    private int ConveyorID;
    private int LotID;
    private float maxWeightkG;
    private int CurrentLocationFloor;
    private float currentLocationX;
    private float currentLocationY;
	public int getConveyorID() {
		return ConveyorID;
	}
	public void setConveyorID(int conveyorID) {
		ConveyorID = conveyorID;
	}
	public int getLotID() {
		return LotID;
	}
	public void setLotID(int lotID) {
		LotID = lotID;
	}
	public float getMaxWeightkG() {
		return maxWeightkG;
	}
	public void setMaxWeightkG(float maxWeightkG) {
		this.maxWeightkG = maxWeightkG;
	}
	public int getCurrentLocationFloor() {
		return CurrentLocationFloor;
	}
	public void setCurrentLocationFloor(int currentLocationFloor) {
		CurrentLocationFloor = currentLocationFloor;
	}
	public float getCurrentLocationX() {
		return currentLocationX;
	}
	public void setCurrentLocationX(float currentLocationX) {
		this.currentLocationX = currentLocationX;
	}
	public float getCurrentLocationY() {
		return currentLocationY;
	}
	public void setCurrentLocationY(float currentLocationY) {
		this.currentLocationY = currentLocationY;
	}
    
    

}

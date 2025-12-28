package entity;

import java.util.Date;

public class ParkingLotPriceHistory {
    private int PLPH_ID;
    private int ParkingLotID;
    private int PriceListID;
    private Date EffectiveFrom;
    private Date EffectiveTo;
	
	public int getPLPH_ID() {
		return PLPH_ID;
	}
	public void setPLPH_ID(int pLPH_ID) {
		PLPH_ID = pLPH_ID;
	}
	public int getParkingLotID() {
		return ParkingLotID;
	}
	public void setParkingLotID(int parkingLotID) {
		ParkingLotID = parkingLotID;
	}
	public int getPriceListID() {
		return PriceListID;
	}
	public void setPriceListID(int priceListID) {
		PriceListID = priceListID;
	}
	public Date getEffectiveFrom() {
		return EffectiveFrom;
	}
	public void setEffectiveFrom(Date effectiveFrom) {
		EffectiveFrom = effectiveFrom;
	}
	public Date getEffectiveTo() {
		return EffectiveTo;
	}
	public void setEffectiveTo(Date effectiveTo) {
		EffectiveTo = effectiveTo;
	}
	
   

    
}

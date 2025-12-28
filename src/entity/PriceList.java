package entity;

public class PriceList {
	
	private int PriceList;
	private String Source;
	private int Year;
	private double PriceFirstHour;
	private double PriceAdditionalHour;
	private double PriceFullDay;
	private String IRS_JSON;
	
	public int getPriceList() {
		return PriceList;
	}
	public void setPriceList(int priceList) {
		PriceList = priceList;
	}
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		Source = source;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	public double getPriceFirstHour() {
		return PriceFirstHour;
	}
	public void setPriceFirstHour(double priceFirstHour) {
		PriceFirstHour = priceFirstHour;
	}
	public double getPriceAdditionalHour() {
		return PriceAdditionalHour;
	}
	public void setPriceAdditionalHour(double priceAdditionalHour) {
		PriceAdditionalHour = priceAdditionalHour;
	}
	public double getPriceFullDay() {
		return PriceFullDay;
	}
	public void setPriceFullDay(double priceFullDay) {
		PriceFullDay = priceFullDay;
	}
	public String getIRS_JSON() {
		return IRS_JSON;
	}
	public void setIRS_JSON(String iRS_JSON) {
		IRS_JSON = iRS_JSON;
	}
	
	

}

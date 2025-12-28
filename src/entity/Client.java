package entity;

public class Client {
	
	private int ClientID;
    private String FirstName;
    private String LastName;
    private String MobileNumber;
    private Boolean IsClubMember;
	public Client(int clientID, String firstName, String lastName, String mobileNumber, Boolean isClubMember) {
		super();
		ClientID = clientID;
		FirstName = firstName;
		LastName = lastName;
		MobileNumber = mobileNumber;
		IsClubMember = isClubMember;
	}
	public int getClientID() {
		return ClientID;
	}
	public void setClientID(int clientID) {
		ClientID = clientID;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public Boolean getIsClubMember() {
		return IsClubMember;
	}
	public void setIsClubMember(Boolean isClubMember) {
		IsClubMember = isClubMember;
	}
	
    
    
    

}


//package converter; // NetBeans IDE

/**
 * Donor. Organizes the attributes into their respective donors.
 * @author Phillip N, Emilio E, Kai W
 */
public class Donor 
{

	private int donationID, donorID, zipCode, quantity;
	private double weight, value;
	private String companyName, firstName, middleName, lastName, emailAddress, spouseName, greeting, streetAddress, apartment, city, state, donorType, donationType, donationSource, donatedOn, foodCategory, foodName, quantityType, memo;
	public Donor(String[] arr)
	{
		this.donationID = Integer.parseInt(arr[0]);
		this.donorID = Integer.parseInt(arr[1]);
		this.companyName = arr[2];
		this.firstName = arr[3];
		this.middleName = arr[4];
		this.lastName = arr[5];
		this.emailAddress = arr[6];
		this.spouseName = arr[7];
		this.greeting = arr[8];
		this.streetAddress = arr[9];
		this.apartment = arr[10];
		this.city = arr[11];
		this.state = arr[12];
		this.zipCode = Integer.parseInt(arr[13]);
		this.donorType = arr[14];
		this.donationType = arr[15];
		this.donationSource = arr[16];
		this.donatedOn = arr[17];
		this.foodCategory = arr[18];
		this.foodName = arr[19];
		this.quantity = Integer.parseInt(arr[20]);
		this.quantityType = arr[21];
		this.weight = Double.parseDouble(arr[21]);
		this.value = Double.parseDouble(arr[22]);
		this.memo = arr[24];
	}

	public int getDonationID()
	{
		return donationID;
	}
	
	public int getDonorID()
	{
		return donorID;
	}
	
	public String getCompanyName()
	{
		return companyName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getMiddleName()
	{
		return middleName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getEmailAddress()
	{
		return emailAddress;
	}
	
	public String getSpouseName()
	{
		return spouseName;
	}
	
	public String getGreeting()
	{
		return greeting;
	}
	
	public String getStreetAddress()
	{
		return streetAddress;
	}
	
	public String getApartment()
	{
		return apartment;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public String getState()
	{
		return state;
	}
	
	public int getZipCode()
	{
		return zipCode;
	}
	
	public String getDonorType()
	{
		return donorType;
	}
	
	public String getDonationType()
	{
		return donationType;
	}
	
	public String getDonationSource()
	{
		return donationSource;
	}
	
	public String getDonatedOn()
	{
		return donatedOn;
	}
	
	public String getFoodCategory()
	{
		return foodCategory;
	}
	
	public String getFoodName()
	{
		return foodName;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	public String getQuantityType()
	{
		return quantityType;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public double getValue()
	{
		return value;
	}
	
	public String getMemo()
	{
		return memo;
	}
  
}
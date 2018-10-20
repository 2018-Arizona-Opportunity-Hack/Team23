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
	
    public Donor(String[] attributeArr)
    {
           
	      this.donationID = Integer.parseInt(attributeArr[0]);
	      this.donorID = donorID;
	      this.companyName = companyName;
	      this.firstName = firstName;
	      this.middleName = middleName;
	      this.lastName = lastName;
	      this.emailAddress = emailAddress;
	      this.spouseName = spouseName;
	      this.greeting = greeting;
	      this.streetAddress = streetAddress;
	      this.apartment = apartment;
	      this.city = city;
	      this.state = state;
	      this.zipCode = zipCode;
	      this.donorType = donorType;
	      this.donationType = donationType;
	      this.donationSource = donationSource;
	      this.donatedOn = donatedOn;
	      this.foodCategory = foodCategory;
	      this.foodName = foodName;
	      this.quantity = quantity;
	      this.quantityType = quantityType;
	      this.weight = weight;
	      this.value = value;
	      this.memo = memo;
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
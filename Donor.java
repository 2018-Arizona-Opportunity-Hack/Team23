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
    
}

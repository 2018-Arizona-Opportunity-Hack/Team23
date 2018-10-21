//package converter; // NetBeans IDE

/**
 * Donor. Organizes the attributes into their respective donors.
 * @author Kai W, Phillip N, Emilio E.
 * @version 21.October.2018
 */
public class Donor 
{

    final private int donationID, donorID;
    final private double weight, value, quantity;
    final private String zipCode, companyName, firstName, middleName, lastName, emailAddress, spouseName, greeting, streetAddress, apartment, city, state, donorType, donationType, donationSource, donatedOn, foodCategory, foodName, quantityType, memo;
    
    public Donor(String[] arr)
    {

        donationID = Integer.parseInt(arr[0]);
	donorID = Integer.parseInt(arr[1]);
	companyName = arr[2];
	firstName = arr[3];
	middleName = arr[4];
	lastName = arr[5];
	emailAddress = arr[6];
	spouseName = arr[7];
	greeting = arr[8];
	streetAddress = arr[9];
	apartment = arr[10];
	city = arr[11];
	state = arr[12];
        zipCode = arr[13];
	donorType = arr[14];
	donationType = arr[15];
	donationSource = arr[16];
	donatedOn = arr[17];
	foodCategory = arr[18];
	foodName = arr[19];
	quantity = Double.parseDouble(arr[20]);
	quantityType = arr[21];
	weight = Double.parseDouble(arr[22]);
	value = Double.parseDouble(arr[23]);
	memo = arr[24];

    }

    /**
     * 
     * @return donationID
     */
    public int getDonationID()
    {
	return donationID;
    }
	
    /**
     * 
     * @return donorID the donor ID
     */
    public int getDonorID()
    {
        return donorID;
    }

    /**
     * 
     * @return companyName
     */
    public String getCompanyName()
    {
        return companyName;
    }

    /**
     * 
     * @return firstName
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * 
     * @return middleName
     */
    public String getMiddleName()
    {
        return middleName;
    }

    /**
     * 
     * @return lastName
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * 
     * @return emailAddress
     */
    public String getEmailAddress()
    {
        return emailAddress;
    }

    /**
     * 
     * @return spouseName
     */
    public String getSpouseName()
    {
        return spouseName;
    }

    /**
     * 
     * @return greeting
     */
    public String getGreeting()
    {
        return greeting;
    }

    /**
     * 
     * @return streetAddress
     */
    public String getStreetAddress()
    {
        return streetAddress;
    }

    /**
     * 
     * @return apartment
     */
    public String getApartment()
    {
        return apartment;
    }

    /**
     * 
     * @return city
     */
    public String getCity()
    {
        return city;
    }

    /**
     * 
     * @return state
     */
    public String getState()
    {
        return state;
    }

    /**
     * 
     * @return zipCode
     */
    public String getZipCode()
    {
        return zipCode;
    }

    /**
     * 
     * @return donorType
     */
    public String getDonorType()
    {
        return donorType;
    }

    /**
     * 
     * @return 
     */
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

    /**
     * getMonthYear. provides the monthyear for the file name of the new txt file
     * @return monthYear
     */
    public String getMonthYear()
    {
        String[] date = donatedOn.split("-");
        String month = "";
        String monthYear;
        String year = date[0];
        switch (date[1])
        {
            case"01":
                month = "January";
                break;
            case"02":
                month = "Febreuary";
                break;
            case"03":
                month = "March";
                break;
            case"04":
                month = "April";
                break;
            case"05":
                month = "May";
                break;
            case"06":
                month = "June";
                break;
            case"07":
                month = "July";
                break;
            case"08":
                month = "August";
                break;
            case"09":
                month = "September";
                break;
            case"10":
                month = "October";
                break;
            case"11":
                month = "November";
                break;
            case"12":
                month = "December";
                break;
            default:
                System.out.println("Out of Bounds Month");
        }
        monthYear = month + year;
        return monthYear;
    }
    
    /**
     * getMonthYear. provides the file name for the potential previous month txt file
     * @param prev unused boolean value used to signify searching of prev txt file
     * @return monthYear
     */
    public String getMonthYear(boolean prev)
    {
        String[] date = donatedOn.split("-");
        String month = "";
        String monthYear;
        String year = date[0];
        switch (Integer.parseInt(date[1]) - 1)
        {
            case 1:
                month = "January";
                break;
            case 2:
                month = "Febreuary";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 0:
                month = "December";
                year = Integer.toString(Integer.parseInt(year) - 1);
                break;
            default:
                System.out.println("Out of Bounds Month");
        }
        monthYear = month + year;
        return monthYear;
    }
    
    /**
     * 
     * @return foorCategory
     */
    public String getFoodCategory()
    {
        return foodCategory;
    }

    /**
     * 
     * @return foodName
     */
    public String getFoodName()
    {
        return foodName;
    }

    /**
     * 
     * @return quantity
     */
    public double getQuantity()
    {
        return quantity;
    }

    /**
     * 
     * @return quanitityType
     */
    public String getQuantityType()
    {
        return quantityType;
    }

    /**
     * 
     * @return weight
     */
    public double getWeight()
    {
        return weight;
    }

    /**
     * 
     * @return value
     */
    public double getValue()
    {
        return value;
    }

    /**
     * 
     * @return memo
     */
    public String getMemo()
    {
        return memo;
    }
}

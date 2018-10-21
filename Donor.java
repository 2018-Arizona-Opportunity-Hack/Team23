//package converter; // NetBeans IDE

/**
 * Donor. Organizes the attributes into their respective donors.
 * @author Kai W, Phillip N, Emilio E.
 * @version 21.October.2018
 */
public class Donor 
{

    final private int donationID, donorID, zipCode;
    final private double weight, value, quantity;
    final private String companyName, firstName, middleName, lastName, emailAddress, spouseName, greeting, streetAddress, apartment, city, state, donorType, donationType, donationSource, donatedOn, foodCategory, foodName, quantityType, memo;
    
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
        if(!arr[13].equals(""))
        {
            zipCode = Integer.parseInt(arr[13]);
        }
        else
        {
            
            zipCode = -1;
            
        }
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
     * getDonationID. Returns donation ID
     * @return donationID the donation ID
     */
    public int getDonationID()
    {
	return donationID;
    }
	
    /**
     * getDonorID. Returns donor ID
     * @return donorID the donor ID
     */
    public int getDonorID()
    {
        return donorID;
    }

    /**
     * getCompanyName. Returns the company name
     * @return companyName the company name
     */
    public String getCompanyName()
    {
        return companyName;
    }

    /**
     * getFirstName. Returns the first name
     * @return firstName the first name
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * getMiddleName. Provides the middle name
     * @return middleName the name in between first and last
     */
    public String getMiddleName()
    {
        return middleName;
    }

    /**
     * getLastName. Gets the name after middle name
     * @return lastName the name that has an equal magnitude in index to first name with middle name as the origin
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * getEmailAddress. Fetches the address from the ether mail
     * @return emailAddress the mail address of the web
     */
    public String getEmailAddress()
    {
        return emailAddress;
    }

    /**
     * getSpouseName. Spouse name get
     * @return spouseName the name of someone who pretends to love you unconditionally
     */
    public String getSpouseName()
    {
        return spouseName;
    }

    /**
     * getGreeting. Greetings gets does
     * @return greeting the greeting
     */
    public String getGreeting()
    {
        return greeting;
    }

    /**
     * getStreetAddress. Returns the street address
     * @return streetAddress the street address
     */
    public String getStreetAddress()
    {
        return streetAddress;
    }

    /**
     * getAparment. Returns the aparment
     * @return aparment the aprment
     */
    public String getApartment()
    {
        return apartment;
    }

    /**
     * getCity. Returns the city
     * @return city the city
     */
    public String getCity()
    {
        return city;
    }

    /**
     * getState. Returns the area the city lies within
     * @return state a synonym for country in foreign lands
     */
    public String getState()
    {
        return state;
    }

    /**
     * getZipCode. Returns the code which closes
     * @return zipCode helps close your jacket
     */
    public int getZipCode()
    {
        return zipCode;
    }

    /**
     * getDonorType. Returns blood type
     * @return donorType p
     */
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

    /**
     * getMonthYear. provides the monthyear for the file name of the new txt file
     * @return something
     */
    public String getMonthYear()
    {
        String[] date = donatedOn.split("/");
        String month = "";
        String monthYear;
        String year = date[2];
        switch (date[0])
        {
            case"1":
                month = "January";
                break;
            case"2":
                month = "Febreuary";
                break;
            case"3":
                month = "March";
                break;
            case"4":
                month = "April";
                break;
            case"5":
                month = "May";
                break;
            case"6":
                month = "June";
                break;
            case"7":
                month = "July";
                break;
            case"8":
                month = "August";
                break;
            case"9":
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
     * @param prev
     * @return something
     */
    public String getMonthYear(boolean prev)
    {
        String[] date = donatedOn.split("/");
        String month = "";
        String monthYear;
        String year = date[2];
        switch (Integer.parseInt(date[0]) - 1)
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
    
    public String getFoodCategory()
    {
        return foodCategory;
    }

    public String getFoodName()
    {
        return foodName;
    }

    public double getQuantity()
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

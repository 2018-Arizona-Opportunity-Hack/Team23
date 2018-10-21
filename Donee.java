//package converter; // NetBeans IDE

/**
 * Donee. Donee composed of Donee attributes.
 * @author Kai W, Emilio E, Phillip N
 * @version 20.October.2018
 */
public class Donee
{
    
    // TODO Private intilialization of all other attributes
    private final String[] visitDate, creationDate;
    private final int houseHoldTotal;
    
    private boolean newClient;
    
    /**
     * Donee. Constructor for Donee.
     * @param attributeArr array of Donee attributes
     */
    public Donee(String[] attributeArr) 
    {
        // TODO Every other attributes
        visitDate = attributeArr[0].split(" ");
        houseHoldTotal = Integer.parseInt(attributeArr[1]);
        creationDate = attributeArr[11].split(" ");
        
        if(visitDate[0].equals(creationDate[0]))
        {
            newClient = true;
        }
        else
        {
            newClient = false;
        }
        
    }
    
    /**
     * 
     * @return newClient
     */
    public boolean getNewClient()
    {
        return newClient;
    }
    
    /**
     * 
     * @return visistDate 
     */
    public String[] getVisitDate()
    {
        return visitDate;
    }
    
    /**
     *
     * @return housHoldTotal
     */
    public int getHouseHoldTotal()
    {
        return houseHoldTotal;
    }
    
    /**
     * 
     * @return creationDate
     */
    public String[] getCreationDate()
    {
        return creationDate;
    }
    
    // TODO Get method for every other attributes
    
}

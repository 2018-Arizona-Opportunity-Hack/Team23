//package converter; // NetBeans IDE

/**
 * Donee. Donee composed of Donee attributes.
 * @author Kai W, Emilio E, Phillip N
 * @version 20.October.2018
 */
public class Donee
{
    
    // TODO Private intilialization of all other attributes
    private final int houseHoldTotal;
    
    /**
     * Donee. Constructor for Donee.
     * @param attributeArr array of Donee attributes
     */
    public Donee(String[] attributeArr) 
    {
        // TODO Every other attributes
        houseHoldTotal = Integer.parseInt(attributeArr[1]);
        
    }
    
    /**
     * getHouseHoldTotal. Returns house hold total.
     * @return housHoldTotal the total amount in a house hold
     */
    public int getHouseHoldTotal()
    {
        return houseHoldTotal;
    }
    
    // TODO Get method for every other attributes
    
}

//package converter; // NetBeans IDE

/**
 *
 * @author Kai W, Emilio E, Phillip N
 * @version 20.October.2018
 */
public class Donee
{
    
    private final int houseHoldTotal;
    
    public Donee(String[] attributeArr) 
    {
        
        houseHoldTotal = Integer.parseInt(attributeArr[1]);
        
    }
    
    public int getHouseHoldTotal()
    {
        return houseHoldTotal;
    }
    
}

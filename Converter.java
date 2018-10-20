//package converter; // NetBeans IDE

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Converter. Converts CSV files to automatically organized output.
 * @author Phillip N, Emilio E, Kai W
 */
public class Converter
{

    /**
     * main. Entry point into the program.
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
        // TODO access default folder, and create default folder if not existent
        
        // TODO access uploaded CSV file
        String fileName = "C:\\Users\\phill\\Desktop\\AAHackathon\\Sept.csv";
        File file = new File(fileName);
        
        String[] attributeArr = new String[25];
        ArrayList<Donor> donorList = new ArrayList<>();
        int index = 0;
        
        try
        {
         
            Scanner inputStream = new Scanner(file);
            inputStream.useDelimiter(",");
            
            // while data exists to be read
            while(inputStream.hasNext())
            {
                
                // cycles through all 25 attributes
                while(index < 25)
                {
                    
                    String data = inputStream.next();
                
                    // gets rid of quotes
                    data = data.replace("\"", "");
                    
                    attributeArr[index] = data;
                
                }
                
                donorList.add(new Donor(attributeArr));
                
            }
            
            inputStream.close();
            
        }
        catch (FileNotFoundException e)
        {
                    
            System.out.println("File not found.");
            //e.printStackTrace();
        
        }
        
    }
    
}

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
        //String fileName = "";
        File file = new File(fileName);
        
        ArrayList<String> dataList = new ArrayList<>();
      
        try
        {
         
            Scanner inputStream = new Scanner(file);
            inputStream.useDelimiter(",");
            
            while(inputStream.hasNext())
            {
                
                String data = inputStream.next();
                
                data = data.replace("\"", "");
                
                if(!data.equals(""))
                    System.out.print(data + ", ");// store data
                else
                    System.out.print("Unspecified, ");// store unspecified data
                
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


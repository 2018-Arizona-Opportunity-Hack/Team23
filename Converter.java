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
        
        //
        final String home = System.getProperty("user.home");
        
        final String folderLocation = home + File.separator + "Documents" + File.separator + "NEWPEK";
        
        File newFold = new File(folderLocation);
        newFold.mkdir();
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter name of file: ");
        
        String fileName = input.nextLine();
        
        final String fileLocation = folderLocation + File.separator + fileName + ".csv";

        File file = new File(fileLocation);
        
        String[] attributeArr = new String[25];
        ArrayList<Donor> donorList = new ArrayList<>();
        int index = 0;
        
        System.out.println(fileLocation);
        
        try
        {
         
            Scanner inputStream = new Scanner(file);
            inputStream.useDelimiter("\\n");
            
            inputStream.next();
            
            inputStream.useDelimiter(",|\\n");
            
            // while data exists to be read
            while(inputStream.hasNext())
            {
                
                String data = inputStream.next();
            
                // gets rid of quotes
                data = data.replace("\"", "");
                
                //System.out.println("Index: " + index + "\nData: " + data);
                
                System.out.print(data);
                
                attributeArr[index] = data;
                
                index++;
                
                if(index > 24)
                {
                    
                    //donorList.add(new Donor(attributeArr));
                    index = 0;
                    
                }
                
            }
            
            inputStream.close();
            
        }
        catch (FileNotFoundException e)
        {
                    
            System.out.println("File not found.");
            //e.printStackTrace();
        
        }
        finally
        {
            
            for(int i = 0 ; i < donorList.size() ; i++)
            {

                //System.out.println((donorList.get(i)).toString());

            }
        
        }
    
    }
    
    public String sort(ArrayList<Donor> donorList) {
        
        String sortedString = "";
        
        
        
        return sortedString;
        
    }
    
}

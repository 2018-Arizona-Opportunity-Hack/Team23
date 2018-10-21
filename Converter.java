//package converter; // NetBeans IDE

//package converter; // NetBeans IDE

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Converter. Converts CSV files to automatically organized output.
 * @author Phillip N, Emilio E, Kai W
 */
public class Converter extends JPanel
{
    /**
     * main. Entry point into the program.
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
        // Allows us to run on any OS
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
        
        System.out.println(fileLocation);
        
        try
        {
         
            Scanner inputStream = new Scanner(file);
            inputStream.useDelimiter("\\n");
            
            inputStream.next();
            
            // while data exists to be read
            while(inputStream.hasNext())
            {
                
                List<String> data = parseLine(inputStream.next());
                
                //System.out.println("Index: " + index + "\nData: " + data);
                
                for(int i = 0 ; i < attributeArr.length ; i++)
                {
                    
                    attributeArr[i] = (data.get(i)).replace("\"","");
                    
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
        finally
        {
            
            ArrayList<Donee> doneeList = new ArrayList<>();
            
            txtMaker textFile = new txtMaker(donorList, doneeList);
            
            textFile.saveTXT(folderLocation);
            
            Color[]color = {Color.yellow,Color.blue, Color.red, Color.green};
            Rectangle a = new Rectangle(0, 0, 1000, 1000);
            double[] percent = {20, 5, 35, 8};
            String[] name = {"bob", "fred", "hi", "bye"};
            
           
            
            BufferedImage bImage = new BufferedImage(1000,1000,BufferedImage.TYPE_INT_RGB);
            Graphics2D g = bImage.createGraphics();
            
            PieChartMaker pCM = new PieChartMaker();
            PieChart[] chart = pCM.createChart(color.length, color, percent, name);
            pCM.drawChart(g, a, chart);
            RenderedImage rImage = bImage;
            File imageFile = new File("PieChart.jpg");
            //File imageFile = new File("PieChart " + month + ", " + year + ".jpg");
            try 
            {
				ImageIO.write(rImage, "jpg", imageFile);
			} 
            catch (IOException e) 
            {
				e.printStackTrace();
			}
            
        }

    
    }

    public String sort(ArrayList<Donor> donorList) {
        
        String sortedString = "";
        
        
        
        return sortedString;
        
    }
    
    /**
     * parseLine. Unedited source code taken from 
     * https://www.mkyong.com/java/how-to-read-and-parse-csv-file-in-java/
     * 
     * @param inputLine, a row of elements from an CSV file.
     * @return result, a list composed of elements, where an element are the
     * group of characters within the '"' symbol.
     */
    public static List<String> parseLine(String inputLine) {

        final char DEFAULT_QUOTE = '"', DEFAULT_SEPARATOR = ',';
        List<String> result = new ArrayList<>();

        //if empty, return empty
        if (inputLine == null && inputLine.isEmpty()) {
            return result;
        }

        StringBuffer curVal = new StringBuffer();
        boolean inQuotes = false;
        boolean startCollectChar = false;
        boolean doubleQuotesInColumn = false;

        char[] chars = inputLine.toCharArray();

        OUTER:
        for (char ch : chars) {
            if (inQuotes) {
                startCollectChar = true;
                if (ch == DEFAULT_QUOTE) {
                    inQuotes = false;
                    doubleQuotesInColumn = false;
                } else {

                    //Fixed : allow "" in custom quote enclosed
                    if (ch == '\"') {
                        if (!doubleQuotesInColumn) {
                            curVal.append(ch);
                            doubleQuotesInColumn = true;
                        }
                    } else {
                        curVal.append(ch);
                    }

                }
            } else {
                switch (ch) {
                    case DEFAULT_QUOTE:
                        inQuotes = true;
                        //Fixed : allow "" in empty quote enclosed
                        if (chars[0] != '"' && DEFAULT_QUOTE == '\"') {
                            curVal.append('"');
                        }   //double quotes in column will hit this!
                        if (startCollectChar) {
                            curVal.append('"');
                        }   break;
                    case DEFAULT_SEPARATOR:
                        result.add(curVal.toString());
                        curVal = new StringBuffer();
                        startCollectChar = false;
                        break;
                //ignore LF characters
                    case '\r':
                        break;
                    case '\n':
                        //the end, break!
                        break OUTER;
                    default:
                        curVal.append(ch);
                        break;
                }
            }
        }

        result.add(curVal.toString());

        return result;
    }
    
}

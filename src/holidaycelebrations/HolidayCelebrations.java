/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holidaycelebrations;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cristy
 */
public class HolidayCelebrations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ArrayList<Celebratable> myFamilyTraditions = createTraditions();
        celebrateHolidays(myFamilyTraditions);
        
        
    }
    
    public static ArrayList<Celebratable> createTraditions() throws IOException
    {
       //Create an ArrayList that will hold objects of grandParents, parents, and children
        
        File aFile = new File("holidays.txt");
        Scanner inFile = new Scanner(aFile);
        
        GrandparentsTradition aGrandParent;
        ParentsTradition aParent;
        ChildrenTradition aChild;
        
        String typeRecord;
        
        String holidayName;
        String holidaySeason;
        String timeOfDayCelebration;      
        String mainDishName;    
        int numberOfSideDishes;
        String locationOfGathering;      
        double costOfMeal;
        String mealSource; 
        
        int numberInvited = 0;
        String traditionalDessert = "";
        String traditionalDrink = "";
        double costPerDessert = 0;
        double costPerDrink = 0;
        
        String holidayGame = "";
        String holidayStorybook = "";
        String holidayMovie = "";
        double costOfMovie = 0;
        
        while (inFile.hasNext())
        {
            //read the file and create the appropriate object (GrandparentsTradition, ParentsTradition, and ChildrenTradition)
            //Remember to use an if-statement to check the first letter of the record and determine what object to create
            //instantiate the corresponding object:  aGrandParent, aParent, or aChild
            //add the object created to the arrayList
            
        }
        
        inFile.close();
        
       //return the arrayList created and populated.
    }
    
    
    
  
    public static void celebrateHolidays(ArrayList<Celebratable> myFamilyTraditions)
    {
         //code the celebrateHolidays method to iterate through the arrayList of objects
        // calls the "celebrate" and "tabulate" polymorphic methods. 
    }
    
    
   
    
}

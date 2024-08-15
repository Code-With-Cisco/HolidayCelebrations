/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holidaycelebrations;

import java.text.DecimalFormat;

/**
 *
 * @author Cristy
 */
public class GrandparentsTradition implements Celebratable {
    
    private String holidayName;
    private String holidaySeason;
    private String timeOfDayCelebration;      
    private String mainDishName;    
    private int numberOfSideDishes;
    private String locationOfGathering;      
    private double costOfMeal;
    private String mealSource;               

    public GrandparentsTradition(String holidayName, String holidaySeason, String timeOfDayCelebration, String mainDishName, int numberOfSideDishes, String locationOfGathering, double costOfMeal, String mealSource) {
        this.holidayName = holidayName;
        this.holidaySeason = holidaySeason;
        this.timeOfDayCelebration = timeOfDayCelebration;
        this.mainDishName = mainDishName;
        this.numberOfSideDishes = numberOfSideDishes;
        this.locationOfGathering = locationOfGathering;
        this.costOfMeal = costOfMeal;
        this.mealSource = mealSource;
    }

    public String getHolidayName() {
        return holidayName;
    }

    public void setHolidayName(String holidayName) {
        this.holidayName = holidayName;
    }

    public String getHolidaySeason() {
        return holidaySeason;
    }

    public void setHolidaySeason(String holidaySeason) {
        this.holidaySeason = holidaySeason;
    }

    public String getTimeOfDayCelebration() {
        return timeOfDayCelebration;
    }

    public void setTimeOfDayCelebration(String timeOfDayCelebration) {
        this.timeOfDayCelebration = timeOfDayCelebration;
    }

    public String getMainDishName() {
        return mainDishName;
    }

    public void setMainDishName(String mainDishName) {
        this.mainDishName = mainDishName;
    }

    public int getNumberOfSideDishes() {
        return numberOfSideDishes;
    }

    public void setNumberOfSideDishes(int numberOfSideDishes) {
        this.numberOfSideDishes = numberOfSideDishes;
    }

    public String getLocationOfGathering() {
        return locationOfGathering;
    }

    public void setLocationOfGathering(String locationOfGathering) {
        this.locationOfGathering = locationOfGathering;
    }

    public double getCostPerServing() {
        return costOfMeal;
    }

    public void setCostPerServing(double costOfMeal) {
        this.costOfMeal = costOfMeal;
    }

    public String getMealSource() {
        return mealSource;
    }

    public void setMealSource(String mealSource) {
        this.mealSource = mealSource;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("##0.00");
        return holidayName + " during the " +  holidaySeason + " holiday season at the " + 
                timeOfDayCelebration + ".  \nWe eat " + mainDishName + " as the main dish, with " + numberOfSideDishes + " side dishes." 
                + "\nWe like to eat in the " + locationOfGathering + ". \nThe food is from a " + mealSource + " source. \nThe cost per serving is about $" + df.format(costOfMeal); 
    
    }
    
     public String celebrate()
    {
        return "\nWe grandparents like to celebrate the holidays like " + toString();
    }
    
     public String tabulateCosts()
     {
         DecimalFormat df = new DecimalFormat("##0.00");
         return "\nFor a typical gathering of 10, we will spend " + df.format(costOfMeal * 10);
     }
    
}

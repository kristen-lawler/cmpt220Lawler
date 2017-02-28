/* *
   * file: Lab_average.java
   * author: Kristen Lawler
   * course: CMPT 220
   * assignment: Lab 4
   * due date: February 28, 2017
   * version: 1.8
   * 
   * This file contains two conversion methods. One converts from
   * Celcius to Fahrenheit, and the other from Fahrenheit to Celcius.
   */
public class Conversion{

  //Creating the method to convert from Celcius to Fahrenheit
  public static double celciusToFahrenheit(double celcius){
    double fahr = celcius * (9.0 / 5) + 32;
    return fahr;
  }

  //Creating the mthod to convert from Fahrenheit to Celcius
  public static double fahrenheitToCelcius(double fahrenheit){
    double celc = (fahrenheit - 32) * (5.0 / 9);
    return celc;
  }

  public static void main(String[] args){
    //The header for the first set of conversions
    System.out.println("Celcius     Fahrenheit    |    Fahrenheit     Celcius");
    System.out.println("_____________________________________________________");
    //For loop for all conversions
    for(double i = 40.0, j=120.0 ; i + j> 59 ; i--,j = j - 10){
      double iConversion = celciusToFahrenheit(i);
      double jConversion = fahrenheitToCelcius(j);
      System.out.printf("%3.1f %12.1f  %17.1f %13.2f\n" , i , iConversion , j,
          jConversion);
    }
  }
}
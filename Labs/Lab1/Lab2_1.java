/* *
   * file: Lab2_1.java
   * author: Kristen Lawler
   * course: CMPT 220
   * assignment: Lab 1
   * due date: January 31, 2017
   * version: 1.8
   * 
   * This file determines the average of a student based on
   * grade inputs for exams, labs and homeworks, and proejects
   */
import java.util.Scanner;

public class Lab2_1{
  public static void main(String[] args){
  	//Directions for input of degrees Celcius
  	System.out.println("Please enter in degrees Celcius:");

    //Creating the scanner
    Scanner input = new Scanner(System.in);

    //Entering degrees in Celcius
    double celcius = input.nextDouble();

    //Declaration and conversion to Fahrenheit
    double fahrenheit = (9.0 / 5.0) * celcius + 32.0;

    //Print out the converted temperature in degrees Fahrenheit
    System.out.println(celcius + " degrees Celcius is " + fahrenheit + 
        " degrees Fahrenheit.");
  }
}
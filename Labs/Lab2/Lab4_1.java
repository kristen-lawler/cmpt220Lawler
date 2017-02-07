/* *
   * file: Lab_average.java
   * author: Kristen Lawler
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 7, 2017
   * version: 1.8
   * 
   * This file asks the user to input the distance from the center of a 
   * pentagon to its vertex. It then outputs the area of the pentagon.
   */
import java.util.Scanner;

public class Lab4_1{
  public static void main(String[] args){
    //Creating the scanner
    Scanner input = new Scanner(System.in);

    //Getting distance from center to vertex
    System.out.println("Input the distance from the center of the" + 
     " pentagon to a vertex:");
    double r = input.nextDouble();

    //Calculating s (the length of one side)
    double s = 2.0 * r * Math.sin(Math.PI/5.0);
    
    //Calculating the area of the corresponding pentagon
    double Area = Math.round(100 * (((5.0 * Math.pow(s,2)) / 
    	(4.0 * Math.tan(Math.PI/5.0))))) / 100.0;

    //Output of the area of the pentagon
    System.out.println("The area of the pentagon is " + Area + ".");
  }
}
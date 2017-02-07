/* *
   * file: Lab_average.java
   * author: Kristen Lawler
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 7, 2017
   * version: 1.8
   * 
   * This code asks the user to input the length and number of sides
   * for a regular polygon. It then outputs the area.
   */
import java.util.Scanner;

public class Lab4_5{
  public static void main(String[] args){
    //Creating the scanner
    Scanner input = new Scanner(System.in);

    //Getting the user's input for the number and length of the sides
    System.out.println("Please enter the number of sides:");
    int n = input.nextInt();
    System.out.println("Please enter the length of the side:");
    double s = input.nextDouble();

    //Calculating the area of the associated regular polygon
    double Area = (n * Math.pow(s,2))/(4 * Math.tan(Math.PI / n));

    //Outputting the area
    System.out.println("The area of the polygon is " + Area + ".");

  }
}
 /* author: Kristen Lawler
   * course: CMPT 220
   * assignment: Lab 4
   * due date: February 28, 2017
   * version: 1.8
   * 
   * This file contains a method that outputs the minimum of an array
   */
import java.util.Scanner;
public class Lab7_9{
  public static double min(double[] array){
    //Finding an initial minimum by comparing the first 2 elements in the array
    double first = array[0];
    double second = array[1];
    double minimum;
    if(first < second){
      minimum = first;
    }
    else{
      minimum = second;
    }
    
    //Looping through the remaining elements and comparing to our first minimum
    for(int i = 2 ; i < array.length ; i++){
      double alternate = array[i];
      if(alternate < minimum){
        minimum = alternate;
      }
    }
    return minimum;
  }

  //Testing the method above
  public static void main(String[] args){
    //Initializing an array of doubles
    double[] x = new double[10];

    //Getting the users input to fill the array
    System.out.println("Please input 10 values to compare:");
    Scanner input = new Scanner(System.in);
    for(int i = 0 ; i < x.length ; i++){
      x[i] = input.nextDouble();
    }
    
    //Testing the min method
    double test = min(x);
    System.out.println("The minimum of your array was " + test + ".");
  }
}
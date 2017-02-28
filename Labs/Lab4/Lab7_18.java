/* author: Kristen Lawler
   * course: CMPT 220
   * assignment: Lab 4
   * due date: February 28, 2017
   * version: 1.8
   * 
   * This file contains a method that utilizes the Bubble sorting algorithm
   * to sort an array's elements from largest to smalled
   */
import java.util.Scanner;
public class Lab7_18{
  public static double[] Bubble(double[] array){
    
    //Outer most loop to ensure every number is compared
    for(int k = 0 ; k < array.length ; k++){
      //Inner loop to compare the first element to its neighbor and repeat
      for(int i = 0 ; i < (array.length - 1) ; i++ ){
    	  //Swtiching if the order is incorrect
    	  if(array[i] < array[i+1]){
          double temp = array[i];
          array[i] = array[i+1];
          array[i+1] = temp; 
    	  }
      }
    }  
    return array;
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
    double[] test = Bubble(x);
    System.out.println("Your array in descending order is " + test[0] + "," +
        test[1] + "," + test[2] + "," + test[3] + "," + test[4] + "," + 
        test[5] + "," + test[6] + "," + test[7] + "," + test[8] + "," + 
        test[9]);
  }

}
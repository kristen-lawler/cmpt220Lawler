/* *
   * file: Lab7_20.java
   * author: Kristen Lawler
   * course: CMPT 220
   * assignment: Lab 5
   * due date: March 28, 2017
   * version: 1.8
   * 
   * This program finds the largest number in the array and swaps it with
   * the last creating a sorting method.
   */
import java.util.Scanner;
public class Lab7_20{
  public static double[] LargestSort(double[] array){
    for(int i = array.length - 1; i > -1; i--){
      //find maximum
      double currentMax = array[i];
      int currentMaxIndex = i;

      for(int j = i - 1; j > -1; j--){
        if(currentMax < array[j]){
          currentMax = array[j];
          currentMaxIndex = j;
        }
      }
      //swap list[i] with list[currentMaxIndex] if need be
      if(currentMaxIndex !=i){
        array[currentMaxIndex] = array[i];
        array[i] = currentMax;
      }
    }
    return array;
  }

  //Test
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
   // System.out.println("Please enter the length of your array:");
   // int size = input.nextInt();
    int size = 10;
    
    //getting user input
    double[] inputArray = new double[10];
    System.out.println("Please enter 10 numbers:");
    for(int x = 0; x < 10 ; x++){
      inputArray[x] = input.nextDouble();   
    }
 
    //showing the solution
    double[] sortedArray = LargestSort(inputArray);
    for(int k = 0; k < size; k++){
      System.out.print(" " + sortedArray[k] + " ");
    }
  }
}
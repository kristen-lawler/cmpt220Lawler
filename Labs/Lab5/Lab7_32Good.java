/* *
   * file: Lab7_32.java
   * author: Kristen Lawler
   * course: CMPT 220
   * assignment: Lab 5
   * due date: March 28, 2017
   * version: 1.8
   * 
   * This program partitions a given list using the first element. This
   * is called a pivot.
   */
import java.util.Scanner;
public class Lab7_32Fix{
  public static int[] partition(int[] list){
    //parameters and useful initializations
    int length = list.length;
    int greaterEq = 0;
    int less = 0;
    int pivot = list[0];
    
    //number of elements before and after the pivot element
    for(int i = 1; i < length; i++){
      if(list[i] >= list[0]){
        greaterEq++;
      }
      else{
        less++;
      }
    }
    
    //index for where to place each element in the new array
    int greaterEqCount = less + 1;
    int lessCount = 0;
    
    //creating a blank array for our result
    int[] newList = new int[length];
    //inserting our pivot element at the appropriate location
    newList[less] = list[0];

    /*comparing and assigning locations for values from the input 
    array to the final array */
    for(int i = 1; i < length; i++){
      if(list[i] < pivot){
        newList[lessCount] = list[i];
        lessCount++;
      }
      else{
        newList[greaterEqCount] = list[i];
        greaterEqCount++;
      }
    }
    return newList;
  }


  //Test
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter the length of your list:");
    int l1 = input.nextInt();

    int[] list1 = new int[l1];
    System.out.println("Please enter " + l1 + " integers:");
    for(int x = 0; x < l1 ; x++){
      list1[x] = input.nextInt();   
    }
    int[] output = partition(list1);
    for(int k = 0; k < output.length; k++){
        System.out.print(" " + output[k] + " ");
    }
  }
}
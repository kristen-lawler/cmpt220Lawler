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
public class Lab7_32{
  public static int[] partition(int[] list){
    //parameters and useful initializations
    int length = list.length;
    int greater = 0;
    int less = 0;
    boolean same = false;

    //number of elements before and after the pivot
    for(int i = 1; i < length; i++){
      if(list[i] >= list[0]){
        greater++;
      }
      else{
        less ++;
      }
    }
    
    //creating a blank array for our result
    int[] newList = new int[length];
    //inserting our pivot element at the appropriate location
    newList[less] = list[0];
    
    //placing elements that are less in array
    for(int count = 0; count < less; ){    
      for(int j = 0; j < length; j++){
        if(list[j] < list[0]){
          newList[count] = list[j];
          count++;
        }
      }
    }


    //placing elements that are greater in array
    for(int count = 0; count < greater; ){    
      //inner loop to check each element
      for(int k = 0; k < length; k++){
        if(list[k] == list[0]){
          newList[less+1] = list[k];
          count++;
          same = true;
        }
        else if((list[k] > list[0]) && same){
          count++;
          newList[count + less] = list[k];
          count++;
        }
        else if((list[k] > list[0]) && !same){
          newList[count + less] = list[k];
          count++;
        }
      }  
    }
    return newList;
  }

 
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter the length of your list:");
    int l1 = input.nextInt();

    int[] list1 = new int[l1];
    System.out.println("Please enter " + l1 + " numbers:");
    for(int x = 0; x < l1 ; x++){
      list1[x] = input.nextInt();   
    }
    int[] output = partition(list1);
    for(int k = 0; k < output.length; k++){
        System.out.print(" " + output[k] + " ");
    }

  }
}
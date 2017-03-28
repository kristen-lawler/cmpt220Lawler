
/* *
   * file: 
   * author: Kristen Lawler
   * course: CMPT 220
   * assignment: Lab 5
   * due date: March 28, 2017
   * version: 1.8
   * 
   * This program contains a method that merges and sorts 2 already
   * sorted arrays in an efficient manner.
   */
import java.util.Scanner;
public class Lab7_31 {
  public static int[] merge(int[] list1, int[] list2){
    //place holder for our answer array
    int[] answer = new int[list1.length + list2.length];
  
    //place of element of list1 that is being compared and sorted
    int j = 0;
    //place of element of list2 that is being compared and sorted
    int k = 0;

    //outer loop to iterate through elements of answer array
    for(int i = 0; i < answer.length; i++){
      if((k < list2.length) && (j < list1.length) && (list1[j] > list2[k])){
        answer[i] = list2[k];
        k++;
      } 
      else if(j < list1.length){
        answer[i] = list1[j];
        j++;
      } 
      else if( (k < list2.length) && (j == list1.length)){
        answer[i] = list2[k];
        k++;
      }
    }
    return answer;
  }


  //Test
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    //user inputs for array 1
    System.out.print("Please enter the size of list 1:");
    int size1 = input.nextInt();
    int[] list1 = new int[size1];
    System.out.print("Please enter list 1:");
    for (int i = 0; i < list1.length; i++){
      list1[i] = input.nextInt();
    }
 
    //user inputs for array 2
    System.out.print("Please enter the size of list 2:");
    int size2 = input.nextInt();
    int[] list2 = new int[size2];
    System.out.print("Please enter list 2:");
    for (int i = 0; i < list2.length; i++){
     list2[i] = input.nextInt();
    }
 
    //solution 
    int[] solution = merge(list1, list2);
    System.out.print("The merged list is ");
    for (int i = 0; i < solution.length; i++){
      System.out.print(solution[i]+ " ");
    }
  }
}
/* *
   * file: Lab_average.java
   * author: Kristen Lawler
   * course: CMPT 220
   * assignment: Lab 3
   * due date: February 21, 2017
   * version: 1.8
   * 
   * This file 
   */
public class Lab5_7{
  public static void main(String[] args){
    
    //Assigning the appropriate tuition amount
    double tuition = 10000.0;

    for(int i = 1; i < 11; i++){
      tuition = tuition*1.05;
    }
    System.out.printf("After ten years, tuition is %f\n", tuition);

    /*Constructing a for loop to determing the tuition cost for each
     of the four years after the tenth year and summing these four yeras together*/
    double total1 = 0;
    for(int j = 1; j < 5; j++){
      tuition = tuition*1.05;
      total1 = total1 + tuition;
      
    }
    System.out.printf("After this time, it would cost %f to attend" +
        "a four-year university.\n", total1);
    
  }
}
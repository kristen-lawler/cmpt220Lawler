/* *
   * file: Lab10_17.java
   * author: Kristen Lawler
   * course: CMPT 220
   * assignment: Lab 7
   * due date: April 25, 2017
   * version: 1.8
   * 
   * This file finds that 10 smallest square numbers greater than
   * 9223372036854775807.
   */
import java.math.*;
public class Lab10_17{
  public static void main(String[] args){
    //finding the smallest square before this maximum value
    //dealing with a scaled down version to save time: 9,000,000 
    int scaled;
    int temp;
    for(int i = 1; ; i++){
      temp = 3000 + i;
      if(temp*temp > 9223372){
        scaled = temp;
        break;
      }
    }
    //fixing the scale and narrowing down our number
    String input = scaled + "000000";
    System.out.println(input);
    BigInteger squareBefore = new BigInteger(input);
    BigInteger b = new BigInteger("9223372036854775807");
    BigInteger c = new BigInteger("1");

    for(BigInteger i = new BigInteger("1"); ; i.add(c)){
      squareBefore = squareBefore.subtract(i);
      if( (squareBefore.multiply(squareBefore)).compareTo(b) == -1){
        break;
      }
    }
    
    //finding the next 10 squares after this maximum
    boolean square = false;
    BigInteger[] answer = new BigInteger[10];
    
    for(int i = 0; i < 10; i++){
      squareBefore = squareBefore.add(c);
      answer[i] = squareBefore.multiply(squareBefore);
    }

    //output the 10 square numbers
    for(int i=0; i<10; i++){
      System.out.println(answer[i]);
    } 
  }
}

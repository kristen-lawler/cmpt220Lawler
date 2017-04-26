/* *
   * file: Test.java
   * author: Kristen Lawler
   * course: CMPT 220
   * assignment: Lab 7
   * due date: April 25, 2017
   * version: 1.8
   * 
   * This file implements and tests the Queue object. 
   */
public class Test{
  public static void main(String[] args){
    //create an instance of Queue
    Queue test = new Queue();

    //adding elements 1 through 20 into the queue
    for(int i=1; i < 21; i++){
    	test.enqueue(i);
    }
    //removing and showing each element
    for(int i=0; i<20; i++){
    	System.out.println(test.dequeue());
    }
  }
}
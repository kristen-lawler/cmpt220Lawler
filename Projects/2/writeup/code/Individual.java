/* *
   * file: Individual.java
   * author: Kristen Lawler
   * course: CMPT 220
   * assignment: Project 2
   * due date: MAy 5, 2017
   * version: 1.8
   * 
   * This file creates the Individual class which will be used
   * to populate the proposers and deciders of the population in Prj2
   */
public class Individual{
  //attributes
  public int identity;
  public int matches1;
  public int[] rank; 
  public int onHold = -1;//no one's id and serves as check that all are paired
  public boolean paired;
  public int[] waitList;
  public boolean taken = false;//true when proposal accepted false if rejected
  public int numProps = 0; //number of proposals a proposer has made

  //constructors
  public Individual(int x, int m){
  	this.identity = x;
  	this.matches1 = m;
    this.rank = this.permutation( m );
  }
  //constructor to call when assign an object to the user
  public Individual(int x, int m, int[] p){
    this.identity = x;
    this.matches1 = m;
    this.rank = p;
  }

  //randomly permute numbers to develop a preference list
  public static int[] permutation( int matches1){
    int[] temp = new int[matches1];
    //initialize temp to -1
    for(int k = 0; k < matches1; k++){
      temp[k] = -1;
    }
    int j = 0;
    while(j < matches1 ){
      //generate number from 0 to matches1 - 1 for a suitors ID
      int number = (int)(Math.random()*matches1);
      //not even getting to here
      boolean repeat = false;
      //check to see if that number already occurs in array
      for(int i = 0; i < matches1 ; i++){
        if(temp[i] == number){
          repeat = true;
          break; 
        }
        else{
          repeat = false;
        }
      }

      //if number has not been used then input it, else repeat this process
      if(repeat == false){
        temp[j] = number;
    	  j++;
      }
    }
    return temp;
  }
}


/* *
   * file: Prj2.java
   * author: Kristen Lawler
   * course: CMPT 220
   * assignment: Project 2
   * due date: May 5, 2017
   * version: 1.8
   * 
   * This file uses the Individual object to create a population 
   * based on user input and appropriately match that population
   * to consider the preferences of all individuals.
   */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Prj2 extends Individual{
  public static void main(String[] args) {    
    //getting user input for number of mates and preference of them
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the number of matchings in your" + 
        " population:");
    int matches = input.nextInt();

    int[] userPreference = new int[matches];
    //getting user's rank of preference
    System.out.println("Please enter your suitor preference in order " + 
        "from first to last (starting with 0):");
   
    //for loop to input user's preference into an array
    for(int i = 0; i < matches; i++){
      userPreference[i] = input.nextInt();
    }

    //using user input to construct a mate object of the user
    Individual user = new Individual(0, matches, userPreference);

    //creating arrayList that holds all "decider" individuals
    ArrayList<Individual> deciders = new ArrayList<Individual>();
    deciders.add(0, user);
    for(int i=1; i<matches; i++){
      deciders.add ( i, new Individual(i,matches));  //create each individual
    }

    //creating array that holds all "proposer" objects
    ArrayList<Individual> proposers = new ArrayList<Individual>();
    //for loop to create matches many suitors by calling the constructor
    for(int j = 0; j < matches; j++){
      proposers.add(j, new Individual(j, matches));
      //each suitor is referenced by j
    }

    //for test, print all pref lists
    for(int g=0; g<matches; g++){
      System.out.printf("\nDecider " + g + " has preference of: \n");
      for(int l=0; l<matches; l++){
        System.out.print(deciders.get(g).rank[l]);
      }
      System.out.printf("\nProposer " + g + " has preference of: \n" );
      for(int l=0; l<matches; l++){
        System.out.print(proposers.get(g).rank[l]);
      }
    }

    //setting waitList of deciders to all -1's to start
    for(int k=0; k<matches; k++){
      deciders.get(k).waitList = new int[matches];
      for(int d=0; d<matches; d++){
        deciders.get(k).waitList[d] = -1;
      }
    }

    //ALGORITHM
    while(true){//outermost loop to go through all of proposals and acceptances
      
      for(int i =0; i < matches; i++){ //access proposer i
        if(proposers.get(i).taken == true){
          System.out.printf("\nProposer " + i + " is taken\n");
          continue;
        }
       
        int prop = proposers.get(i).numProps;
        int tempMate = proposers.get(i).rank[prop];
        proposers.get(i).numProps++;
        System.out.printf("\nProposer " + i + " offering to " + 
            tempMate + "\n");

        //adding this proposer to the preferential decider's waitList
        if(deciders.get(tempMate).onHold != -1)
          deciders.get(tempMate).waitList[0] = deciders.get(tempMate).onHold; 
        for(int k=0; k<matches; k++){ 
          if(deciders.get(tempMate).waitList[k] == -1){
            deciders.get(tempMate).waitList[k]= i;
            for(int p=0; p<matches; p++){
              System.out.println(deciders.get(tempMate).waitList[p]);
            }
            break;
          }
        }
      } //end proposal for this round

      //deciders must now select someone from waitList to put on hold (most preferential out of options) 
      for(int t=0; t<matches; t++){//to access each decider
        //if on hold let taken be false so that can propose next round if get dumped
        if(deciders.get(t).onHold != -1){
          int fling = deciders.get(t).onHold;
          proposers.get(fling).taken = false;
        }

        //find person on waitlist with lowest rank (most preferential candidate)
        for(int f=0; f<matches; f++){
          if(deciders.get(t).waitList[0] == -1){
            break;//leave onHold as -1 since didnt receive any proposals
          }
          //checking to see if the fth ranked person proposed in order of preference
          else{
            int check = deciders.get(t).rank[f]; 
            //iterate through the waitlist to see if "check" is on it
            boolean done = false; //as soon as find a match must terminate 'f' loop using this bool
            for(int z=0; z < matches; z++){
              if(deciders.get(t).waitList[z] == check){
                deciders.get(t).onHold = check;
                done = true;
                //the selected proposer is marked as taken for the following round (do this on line 151 too...)
                proposers.get(check).taken = true; 
                break;
              }
            }
            if(done)
              break;
          }
        }

        System.out.println("\nDecider " + t + " has on hold " + 
            deciders.get(t).onHold);
      }//conclude acceptances of proposals for this round

      //before enter next round, check to see if everyone happens to be matched
      boolean paired = true;
      for(int x = 0; x < matches; x++){
        if(deciders.get(x).onHold == -1){
          paired = false;
          break;
        }
      }
      //check if all individuals matched
      if(paired){
        break;
      } 
    }//end algorithm
    


    
    //outprint pairings
    for(int h=0; h<matches; h++){
      System.out.println("\nDecider " + h + " was paired with " + 
          deciders.get(h).onHold);
    }
  }
  public static int find(int[] array, int element){
    //initialized value larger than any other rank
    int index = array.length + 1;
    for(int y=0; y < array.length; y++){
      if(array[y] == element){
        index = y;
      }
    }
    return index;
  }  
}

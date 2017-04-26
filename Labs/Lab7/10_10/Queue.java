/* *
   * file: Queue.java
   * author: Kristen Lawler
   * course: CMPT 220
   * assignment: Lab 7
   * due date: April 25, 2017
   * version: 1.8
   * 
   * This file creates a Queue class that has attributes of size,
   * capacity and elements.
   */
public class Queue{
  //attributes
  private int[] elements;
  //number of integers currently in the queue  
  private int size;
  //capacity of the stack
  public int capacity;


  //constructor
  public Queue(){
    if(elements == null){
      this.capacity = 8;
    }
    else{
    	this.capacity = this.elements.length + 1;
    }
  }
 
  //methods
  //getting the size of the queue
  public int getSize(){
  	this.size = this.elements.length;
  	return size;
  }

  //setting the elements
  public void setElements(int[] x){
  	this.elements = x;
  	this.size = x.length;
  	if(size >= capacity){
  	  capacity = size;
  	}
  }
  //getting an element from a specified location
  public int getElement(int n){
  	return elements[n];
  }

  //adds v into the front of the queue
  public void enqueue(int v){
    Queue temp = new Queue();
    if(elements == null){
    	elements = new int[1];
    	elements[0] = v;
    }
    else{
      this.size = this.elements.length;
      if(this.size  >= this.capacity){
        this.capacity = capacity * 2;
      }
      temp.elements = this.elements;
      this.size = size + 1;
      this.elements = new int[size];
      this.elements[0] = v;
      for(int i = 1; i < this.size ; i++){
        this.elements[i] = temp.elements[i - 1];
      }
    }  
  } 

  //removes element from the back of the queue
  public int dequeue(){
  	this.size = this.elements.length;
    int removed = this.elements[(this.size - 1)];
    Queue temp = new Queue();
    temp.elements = this.elements;
    this.size = this.elements.length - 1;
    this.elements = new int[size];
    for(int i = temp.elements.length - 1; i > 0 ; i--){
      this.elements[i - 1] = temp.elements[i - 1];
    } 
    return removed;
  } 

  //returns true if the queue is empty and false otherwise
  public boolean empty(){
  	if(elements == null){
  		this.size = 0;
  	}
  	else{
  		this.size = this.elements.length;
  	}
  	boolean answer;
  	if(this.size == 0){
  		answer = true;
  	}
  	else{
  		answer = false;
  	}
  	return answer;
  }









}
/******************************************/
/*Nikolas Gordon ID: 0610330      */
/*                                */
/* COIS 2240 software modeling   */
/*                                */
/* Fibonacci number program: a    */
/* program that prints out a      */
/* a series of numbers consisting */
/* of a function n = (n-1) + (n-1)*/

package nikolasgordonjava1;

import java.util.Scanner;//used to scan user input
import java.time.*; //used

public class MainClass {//main class

	public static void main(String[] args) {//MAIN METHOD
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);//creates a new scanner for each use of reader
		long time = System.nanoTime();//inputs the use of nano seconds
		
		System.out.print("Please enter how many fibonacci numbers you want to load:" );
		int n = reader.nextInt();//prompts user to enter a number
		
		fiboSeriesRec(n, time);// calls recursion function with user input and time
		
		
	}
	public static void fiboSeriesRec ( int n, long time){//RECURSION METHOD
		
		time = System.nanoTime();
		int [] recuArray = new int[n];//creates an array
		long x = System.currentTimeMillis(); // runs in milliseconds*
		
		recuArray[0] = 0; //if n is 0, recuArray[0]= 0
        recuArray[1] = 1;
        for(int i=2; i < n; i++){ //for loop for fibonacci recusion
            recuArray[i] = recuArray[i-1]+ recuArray[i-2];
           x = System.currentTimeMillis();//calculates milliseconds in each loop
        }
		
        long timeNeeded = System.nanoTime()- time;//calculation of time
		fiboSeriesIte(recuArray, n, timeNeeded);// calls iteration method
	    
		
		}
	 public static void fiboSeriesIte (int [] recuArray, int n, long timeNeeded) {
	  //ITERATION METHOD
		 for(int i=0; i < n; i++){
                 System.out.print(recuArray[i] + " ");//prints the values
         }
		 
		 long timeNeeded2 = System.nanoTime() - time;
		 
		 System.out.println("\n The time needed is for recursion " + timeNeeded + " nanoseconds");
		 System.out.println("\n The time needed is for recursion " + timeNeeded2 + " nanoseconds");
		 //prints the time needed
	 }
	 

}
/* * i was trying to incorporate milliseconds but found nanoSeconds easier to implement*/
/* i also found that having the syste,currenttimemillis affects the actually timing*/
/* url for fibonacci https://stackoverflow.com/questions/8965006/java-recursive-fibonacci-sequence(I found it easier to not use a if statement for the array being 0 and 1)*/
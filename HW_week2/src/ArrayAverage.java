import java.util.Scanner;

public class ArrayAverage {

		public static void main(String[] args) {
			int total = 0;
			int ArraySize;
			
			/* 
			 I'm using:
			1- ArraySize = how many times it will ask for the number
			2- ints - how big my Array is.
			3- total - it's for average total = ints + 
			4- average - it's a result of Total / ArraySize
			my scanners name is "inputer"
			
			*/
			
		   	
		    	//Creating a scanner to read input from console
	Scanner inputer = new Scanner(System.in);
		System.out.print("Type How many ints to average? When done press \"Enter\" ");		   
	        ArraySize = inputer.nextInt();
	
			    // define an array
		    int[] ints = new int[ArraySize];
								
			    // for loop here to ask the user for input.
			 for (int i = 0; i < ArraySize; i++) {
				System.out.println();
				 
				//Creating a scanner to read input from console ArraySize times
		System.out.print("Please type your number #" + (i + 1) + " and press \"Enter\" ");
		    ints[i] = inputer.nextInt();
		    
		         // average across the array
		     total += ints[i]; 
		}
			 					
			double average = (double) total/ ArraySize;
			    System.out.println();
         System.out.println("The average of entered numbers is " + average);
  
	}
}




package Prime_Pkg;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			  int remainder;
			  boolean isPrime=true;
			// Enter the numberToCheckber you want to check for prime
			  Scanner user_data = new Scanner(System.in);
		      System.out.print("Enter a Value: ");
		      int numberToCheck = user_data.nextInt();
			 // int numberToCheck=17; 
			        
			  //Loop to che19ck whether the numberToCheckber is divisible any numberToCheckber other than 1 and itself
			  for(int i=2;i<=numberToCheck/2;i++)
			  {
			   //numberToCheckber is divided by itself
			            remainder=numberToCheck%i;
			            System.out.println(numberToCheck+" Divided by "+ i + " gives a remainder "+remainder);
			            
			       //if remainder is 0 than numberToCheck is not prime and break loop. Else continue the loop
			     if(remainder==0)
			     {
			        isPrime=false;
			        break;
			     }
			  }
			  // Check value true or false, if isprime is true then numberToCheckber is prime otherwise not prime
			  if(isPrime)
			     System.out.println(numberToCheck + " is a Prime number");
			  else
			     System.out.println(numberToCheck + " is not a Prime number");
			    }
			  	
		
	}



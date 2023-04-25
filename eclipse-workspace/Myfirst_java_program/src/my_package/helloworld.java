package my_package;

import java.util.Scanner;

public class helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 3-Methods to print 
		
		System.out.print("How to Print in Java! \n");
		
		System.out.println("Hello world of Java");
		
		System.out.printf("'%S' %n","Learning");
		
		
		
		Scanner reader_data = new Scanner(System.in);
        System.out.print("Enter a Value: ");
        int number_data = reader_data.nextInt();
        System.out.println("User entered: " + number_data);
        int add = number_data+number_data;
        System.out.println("Addition with itself: " + add);

	}

}

// Alex Fallah , Fallaha@wit.edu
package Java.util;

import java.util.Scanner;

public class Average3 {
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the first integer: ");
		int n1 = keyboard.nextInt();
		System.out.print("Enter the second integer: ");
		int n2 = keyboard.nextInt();
		System.out.print("Enter the third integer: ");
		int n3 = keyboard.nextInt();
		double AVG = ((n1+n2+n3)/3.0);
		System.out.print("The Average is "+ AVG);
		
	}
	
}
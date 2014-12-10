// Alex Fallah , Fallaha@wit.edu
package Java.util;



import java.util.Scanner;
public class FromBinary {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a 4-bit binary integer: ");
		String binary = keyboard.nextLine();
		String[] parts = binary.split("");
		String b0 = parts[0];
		String b1 = parts[1]; 
		String b2 = parts[2];
		String b3 = parts[3];
		int sum;
		if (b0.equals("1"))
		{
			sum+=8;
		}
		if (b1.equals("1"))
		{
			sum+=4;
		}
		if (b2.equals("1"))
		{
			sum+=2;
		}
		if (b3.equals("1"))
		{
			sum+=1;
		}
		System.out.print("The value of " +binary+ " is "+ sum);




	}
}

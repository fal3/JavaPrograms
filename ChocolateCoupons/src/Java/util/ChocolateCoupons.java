package Java.util;
//Alex Fallah , Fallaha@wit.edu, dalyc2@wit.edu
import java.util.Scanner;
public class ChocolateCoupons {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the amount of dollars you want to spend on chocolate bars: ");
		int dollars = keyboard.nextInt();
		int leftovers = 0;
		int choc = dollars;
		while (dollars>=0){
			dollars = dollars -6;
			leftovers++;
			dollars = dollars +leftovers;
		}
		System.out.println(leftovers + choc -1);
	}
	
}

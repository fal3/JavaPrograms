// Alex Fallah , Fallaha@wit.edu
package Java.util;

import java.util.Scanner;

public class SillySentence {
		public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter your favorite color: ");
		String COLOR = keyboard.next();
		System.out.print("Enter your favorite food: ");
		String FOOD = keyboard.next();
		System.out.print("Enter your favorite animal: ");
		String ANIMAL = keyboard.next();
		System.out.print("Enter the first name of a friend or relative: ");
		String NAME = keyboard.next();
		System.out.print("I had a dream that " + NAME + " ate a " +COLOR+" "
		+ ANIMAL+ " and said it tasted like " + FOOD + "!");
	}
}

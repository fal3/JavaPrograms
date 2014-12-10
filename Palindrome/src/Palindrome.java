import java.util.Scanner;


public class Palindrome {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter an integer to check if it is a palindrome  ");
		String orig = keyboard.nextLine(); //original number
		String[] parts = orig.split("");
        Boolean isit = pali(parts);
		if (isit==true) System.out.print(orig +" is a palindrome");
		if (isit==false)System.out.print(orig + " is not a palindrome"); //did I need the reverse string?
	}
	
	public static boolean pali(String[] parts){
		int n1=0;
		int n2=parts.length-1;
		String newparts[]=parts;
		
		while (n2>n1){
			if (newparts[n1] != newparts[n2]) return false;
			
			n1++;
			n2--;
		}
		return true;
	}

}
	
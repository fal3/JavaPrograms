import java.util.Scanner;

public class FirstProgram
{
	public static void main(String[] args){
		System.out.println("YOOO");
		System.out.println("Enter 2 numbers for the range");

		int n1, n2;

		Scanner keyboard = new Scanner(System.in);
		
		n1 = keyboard.nextInt();
		n2 = keyboard.nextInt();
		
		System.out.println("The range of those 2 numbers is");
		System.out.println(n1 - (n2+1) );
	}
}


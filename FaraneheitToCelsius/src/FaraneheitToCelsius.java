import java.util.Scanner;


public class FaraneheitToCelsius {
	public void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int dF;
		double dC;
		System.out.print("Enter degrees faranheit: ");
		dF = keyboard.nextInt();
		dC = (5* (double)dF - 32.0)/9.0;
		System.out.print(dF + " degrees Fahrenheit is " + dC + " Celcius " );
		
	}

}

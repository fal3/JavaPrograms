
//Alex Fallah , Fallaha@wit.edu
import java.util.Scanner;

public class Test
{
	
	public void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the dimensions of your 4 sided polygon: ");
		int l = keyboard.nextInt();
		int w = keyboard.nextInt();
	 
		if (l==w) {
			Rhombus test1 = new Rhombus(l);
		}
		else {
			Rhombus test1 = new Rhombus(l, w);
		}
		
	 	System.out.print("Enter the dimensions to another 4 sided polygon: ");
		l =keyboard.nextInt();
	 	w =keyboard.nextInt();
	 	
	 	Rhombus test2 = new Rhombus(l, w);
	 
	 	boolean result = test1.equals(test2);
	 	
	 	
	 	

	}

}

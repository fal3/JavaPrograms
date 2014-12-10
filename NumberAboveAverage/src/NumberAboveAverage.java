import java.util.Scanner;
public class NumberAboveAverage {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		double sum;
		sum=0;
		double average;
		double[] temperatures = new double[10];
		int count;
		count = 0;
		System.out.print("Enter the temperature for 10 days: ");
		for(int i = 0; i < 10; i++){
			temperatures[i] = keyboard.nextDouble();
			sum += temperatures[i];
		}
		average = sum / 10;
		for(int i = 0; i < temperatures.length; i++){
			if(temperatures[i] > average)count++;
		}
		System.out.print("The average temperature is: "+ average);
		System.out.print("The number of temperatures above average: " + count);
	}
}

import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.text.*;


class Rational extends DenominatorException {
	private int numerator;
	private int denominator;
	static Scanner keyboard = new Scanner(System.in);
	
	Rational(int numerator, int denominator){
		
	}
	public int getNumerator(){
		return numerator;
	}
	
	public int getDenominator(){
		return denominator;
	}
	public void setNumerator(int numerator){
		this.numerator = numerator;
	}
	public void setDenominator(int denominator){
		this.denominator = denominator;
	}
	public float calculate(){
		float n1 = numerator;
		float d1 = denominator;
		return n1/d1;
	}
	public static void main(String[] args){
		try{
			System.out.print("Enter the numerator: ");
			String Nu1 = keyboard.nextLine();
			System.out.print("Enter the Denominator: ");
			String Du1 = keyboard.nextLine();
			int Nu2 = Integer.parseInt(Nu1);
			int Du2 = Integer.parseInt(Du1);
			
			if(Du2 ==0)
				throw new DenominatorException();
			
			Rational ra = new Rational(Nu2,Du2);
			ra.setNumerator(Nu2);
			ra.setDenominator(Du2);
			System.out.println("The value from getNumerator is : " +ra.getNumerator());
			System.out.println("The value from getDenominator: " + ra.getDenominator());
			System.out.println("The rational number is " + ra.calculate());
		}
			catch(DenominatorException e){
				System.out.print(e.getMessage());
			}
	}
	


			
			
			
			
		
	}
	


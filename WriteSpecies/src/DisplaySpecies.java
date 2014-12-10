import java.io.*;
import java.util.Scanner;

public class DisplaySpecies{

	public static void main(String[] args){

		File inputStream = null;
		Scanner readSpecies = null;
		ObjectInputStream inputSpecies = null;
		inputSpecies = new ObjectInputStream(new FileInputStream(inputStream));

		try{
			inputSpecies = new File("speciesData");
			readSpecies = new Scanner(inputSpecies);
			System.out.println("File found");

		}
		catch (FileNotFoundException e) {
			System.out.println("File not found");  
			e.printStackTrace(); 
		}
		try{
			inputFile = new ObjectInputStream(new FileInputStream(inputSpecies));
		}
		catch(IOException e){
			System.out.println("Your file could not be opened, please ensure it is not corrupted");
		}

		String data = null;

		try 
		{
			while(readSpecies.hasNextLine() ){
				data= "Species.txt";
				System.out.println(data);	
			}
			inputStream.close();
		}
		catch(Exception e){
			System.out.print("Error!!");
		}
	}
}


import java.io.*;
import java.util.Scanner;

public class WriteSpeciesFile   {

	public static void main(String args[]) throws IOException{

		Scanner keyboard = new Scanner(System.in);
		String inputFile = "";
		File streamFile = null;
		try{
			System.out.println("Enter the species file");
			inputFile = keyboard.next();
			streamFile  = new File(inputFile);
		}
		catch (FileNotFoundException e) {
			System.out.println("Unable to find file");  
		}

		File tempFile = null;
		ObjectOutputStream outputStream = null;
		File outputFile = new File("Species.txt");
		
		try{
			outputStream = new ObjectOutputStream(new FileOutputStream(outputFile));

		}
		catch(IOException e)
		{
			System.out.println("Unable to open file");
		}

		try{
			while(true){
				tempFile = ((String) streamFile).nextLine();
			}
			
		}
		catch(Exception e){
			System.out.println("Error");
		}
		outputStream.close();
		outputStream.writeObject(tempFile);
	}
}
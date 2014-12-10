import java.io.*;
import java.lang.*;
import java.util.Scanner;

public class GettysburgAddress {
	public static void main(String args[])
	{
		try
		{
			FileOutputStream fileOut = new FileOutputStream("/Users/Alex/Desktop/JAVA/gettysburg_address2.txt");
			Scanner inputStream = new Scanner(new File("/Users/Alex/Desktop/JAVA/gettysburg_address.txt"));
			inputStream.useDelimiter(" ");
			String temp = inputStream.next();
			while(temp != "")
			{
				byte[] asBytes = temp.getBytes();
				for(int i=0;i<asBytes.length;i++)
				{
					
					fileOut.write(asBytes[i]);
				}
				byte[] newline = "\n".getBytes();
				for(int i=0;i<newline.length;i++)
				{
					fileOut.write(newline[i]);
				}
				if(!inputStream.hasNext())
					break;
				
				temp = inputStream.next();
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
			System.out.println("File not found!");
		}
		catch(IOException e)
		{
			System.out.println("Nope");
		}
	}

}

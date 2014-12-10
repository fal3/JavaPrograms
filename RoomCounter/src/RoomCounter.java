import java.util.Scanner;
import java.io.*;
import java.util.*;



public class RoomCounter {
	int addCount=0;
	int removeCount=0;
	int count=0;
	Scanner keyboard = new Scanner(System.in);
	
	public void addPerson(){
		try{
			System.out.print("How many people do you want to add? ");
			addCount = keyboard.nextInt();
			
			if(addCount<0){
				System.out.println("Enter a positive number ");
				throw new NegativeCounterException();
			}
		}
		catch(NegativeCounterException e)
			{
				System.out.print(e.getMessage());;
				System.exit(0);
			}
		}
	
	public void removePerson()
	{
		try
		{
			System.out.print("How many people do you want to remove? ");;
			removeCount = keyboard.nextInt();
			if(removeCount<0){
				System.out.print("Enter a postive number");
				throw new NegativeCounterException();
				
			}
		}
			catch(NegativeCounterException e)
			{
				System.out.print(e.getMessage());
				System.exit(0);
				
			}
		}
		
		public void getCount()
		{
			try
			{
				count = addCount-removeCount;
				System.out.println("There are " + count + " people in the room");
				if(count<0)
					throw new NegativeCounterException();
		
			}
			catch(NegativeCounterException e){
				System.out.print(e.getMessage());
			}
		}
		public static void main(String args[]){
			RoomCounter room = new RoomCounter();
			room.addPerson();
			room.removePerson();
			room.getCount();
		}

}

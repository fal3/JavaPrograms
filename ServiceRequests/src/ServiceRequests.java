import java.util.*;
import java.io.*;


class ServiceRequests {
	int size = 0;
	int count = 0;
	Scanner keyboard = new Scanner(System.in);
	ArrayList<String> names = new ArrayList<String>();
	
	public void addName(ArrayList Name){
		int i =0;
		try{
			do{
				System.out.println("Do you want to accept the receivers call? (yes/no)");
				if (keyboard.next().startsWith("yes"))
				{
					System.out.println("Enter the receiever name: ");
					names.add(keyboard.next());
					count++;
				}
				else
					break;
				
				boolean result = names.isEmpty();
				if(result==true)
					throw new EmptyArrayException();
			
			
			}
			while(true);
			System.out.println(names);
		}
		catch(EmptyArrayException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	public String removeName(String name)
	{
		try
		{
			System.out.println("Enter the name to remove");
			name = keyboard.nextLine();
			boolean res = names.contains(name);
			if(res==true)
				names.remove(name);
			else 
				throw new NoServiceRequestException();
			
		}
		catch(NoServiceRequestException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println(names);
		return name;
	}
	
	public int getName(int i)
	{
		System.out.println("Enter the position of name: ");
		int nameSpot=keyboard.nextInt();
		int length = names.size();
		if(nameSpot<length){
			String index = names.get(nameSpot);
			System.out.println(index);
		}
		else
			System.out.println("Invalid");
		return nameSpot;
	}
	
	

}

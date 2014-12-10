import java.util.ArrayList;
public class ArrayRecursion {
	public static void main(String[] args)
	{
		ArrayList<String>output=new ArrayList<String>();
		String[][] ex1={ {"A,B"},{"1,2"},{"XX","YY","ZZ"}};
		String[][] ex2={{"A"},{"1"},{"2"},{"XX","YY"}};
		String[][] ex3={{"A","B"}, {"1","2"}, {"XX","YY","ZZ"} };
		String[][] ex4={{"Hello","Hi"},{"Van","Alex"},{"Norst","Fallah"}};
		System.out.println("Example 1");
		printHash(ex1,0, output);
		System.out.println("Example 2");
		printHash(ex2,0, output);
		System.out.println("Example 3");
		printHash(ex3,0, output);
		System.out.println("Example 4");
		printHash(ex4,0, output);
		
		
		
	}
	
	public static void printHash(String array[][], int index, ArrayList<String> output)
	{
		if(index == array.length)
			System.out.println(output.toString());
		else
		{
			for(int i=0; i<array[index].length;i++)
			{
				output.add(array[index][i]);
				printHash(array,index+1,output);
				output.remove(output.size()-1);
			}
		}
	}

}

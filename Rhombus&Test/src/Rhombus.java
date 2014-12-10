import java.util.Scanner;

public class Rhombus{
	private int length;
	private int width;
	
	public Rhombus()
	{
		length = 0;
		width = 0;
	}
	public Rhombus(int side)
	{
		length = side;
		width = side;
	}
	public Rhombus(int len, int wid)
	{
		length = len;
		width = wid;
	}
	
	public int getLength()
	{
		return length;
	}
	public void setLength(int newLength)
	{
		length = newLength;
	}
	public int getWidth()
	{
		return width;
	}
	public void setWidth(int newWidth)
	{
		width = newWidth;
	}
	
	public boolean equals(Rhombus x)
	{
		
		double area= width*length;
		double secondArea=x.getWidth() * x.getLength();
		if(area != secondArea)
		{
			return false;
		}
		return true;
	}
	
	
	
}
//Robert Payne
//L02
//5/29/2012

public class Rectangle
{
	private double width, length;
	
	//Constructor Rectangle()//no arguments
	public Rectangle()
	{
	}
	//Constructor Rectangle(double, double) for sending length and width
	public Rectangle(double len, double w)
	{
		length = len;
		width = w;
	}
	
	public void setWidth(double w)
	{
		width = w;
	}
	
	public void setLength(double ln)
	{
		length = ln;
	}

	public double getWidth()	
	{
		return width;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public double area()
	{
		double a;
		a = length * width;
		return a;
	}
	
	public double perimeter()
	{
		double sides;
		sides = 2 * length + 2 * width;
		return sides;
	}
	
	
}//end of class

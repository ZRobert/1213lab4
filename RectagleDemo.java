//Robert Payne
//L02
//5/29/2012

public class RectagleDemo
{
	public static void main(String[] args)
	{
	
		Rectangle myRect = new Rectangle();
		double theArea, rectPerimeter;
		myRect.setLength(20);
		myRect.setWidth(15);
		
		theArea = myRect.area();
		rectPerimeter = myRect.perimeter();
		System.out.println("My rectangle has area " + theArea);
		System.out.println("My rectangle has a perimeter of " + rectPerimeter);
		
		//Calling class rectangle(double,double)
		myRect = new Rectangle(10.0 ,20.0);
		theArea = myRect.area();
		rectPerimeter = myRect.perimeter();
		System.out.println("My rectangle has area " + theArea);
		System.out.println("My rectangle has a perimeter of " + rectPerimeter);
	}
}//end of class RectangleDemo

/********************************************************************
Task 1 Exercise answers:
3. I predict that the values stored in width and height are going to
be garbage since nothing was ever assigned to these memory locations.
5. No, because the variables were initialized to 0.
7. Output: "My rectangle has area 6.6"
9. I get compile four compile messages saying that RectangleDemo.java
cannot access the data from Rectangle since they are only accessable
via private access.
*********************************************************************
Task 2 Exercise answers:
2. Output: "My rectangle has area 125.0"
3. Output: "My rectangle has area 125.0"
			  "My rectangle has a perimeter of 60.0"
4. Output: "My rectangle has area 300.0"
			  "My rectangle has a perimeter of 70.0"
*********************************************************************
Task 3 Exercise answers:
5. Output for the new rectangle: "My rectangle has area 200.0"
											"My rectangle has a perimeter of 60.0"
*/
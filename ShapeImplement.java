/*Write a java program to create an interface named shape with the following methods:
	
	1.Methods:
		. public  double area() This method should calculate and return the area of shape.
		. public double perimeter() This method should calculate and return the perimeter(or circumference) of the shape.
		
	create three classes that extend shape:
		1. Rectengle:
			* Implement constructors to initialize the dimensions(e.g., length and width).
			* Override area() and perimeter() methods to the area and perimeter of a rectengle.
		2. Triangle:
			* Implement constructure to initialize the dimensions(e.g., baase and height, or all three sides).
			* Override area() and perimeter() methods to compute the area and perimeter of a triangle.
		3. Circle:
			* Implement  a constructors to initialize the radius.
			* Override area() and perimeter() methods to compute the area() and perimeter(circumference) of a circle.
	Each class should provide its  own constructor(s) and properly implement  the area() and perimeter() methods from  the Shape interface.
	*/
	
import java.util.Scanner;
interface Shape
{

	
	double area();
	double perimeter();
}


class Rectangle implements Shape 
{
    int length, width;

    Rectangle(int length, int width) 
	{
        this.length = length;
        this.width = width;
    }
	
	public double area()
	{
		
		return length * width;
	}
	
	public double perimeter()
	{
		return 2 * (length + width);
		 
	}
	
}
class Triangle implements Shape
{
	double base;
	double height;
	double side1;
	double side2;
	double side3;
	Triangle(double base, double height,double side1, double side2, double side3)
	{
		this.base = base;
		this.height = height;
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double area()
	{
		
		return 0.5 * base * height;
	}
	
	public double perimeter()
	{ 
		return side1 + side2 + side3;
	}
}

class Circle implements Shape
{
	double radious;
	final double PI = 3.14;
	
	Circle(int radious)
	{
		this.radious = radious;
	}
    
	public double area()
	{
		return PI * radious * radious;
	}
	
	public double perimeter()
	{
		return  2 * PI * radious;
	}
}
 public class ShapeImplement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println();
		Rectangle r = new Rectangle(15,4);
		System.out.println("Rectengle Area is ..."+ r.area());
		System.out.println("Rectangle Perimeter is ..."+ r.perimeter());
		
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println();
		Triangle t = new Triangle(5,8,20,35,9);
		System.out.println("Triangle Area is ..."+ t.area());
		System.out.println("Triangle Perimeter is ..."+ t.perimeter());
		
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println();
		Circle c = new Circle(6);
		System.out.println("Circle Area is ..."+ c.area());
		System.out.println("Circle Perimeter is ..."+ c.perimeter());

		
	}
}
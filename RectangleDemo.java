//constructor
class Rectangle
{
	double w,h;
	int x,y;

	Rectangle()
	{
		x=y=0;
		w=h=1;
	}
	
	Rectangle(double w, double h)
	{
		x=y=0;
		this.w=w;
		this.h=h;
	}
	public double area()
	{
		return w*h;
	}
	public void draw()
	{
		System.out.println("Hi, I am Rectangle");
	}
}
class RectangleDemo
{
	public static void main(String args[])
	{
		Rectangle r = new Rectangle(10, 20);
		System.out.println(" " + r.area());
	}
}
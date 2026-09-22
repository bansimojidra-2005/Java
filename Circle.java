class Circle
{
    
    private int x;
    private int y;
    private double r;

    Circle() // default const.
    {
        x = 0;
        y = 0;
        r = 3;
    }

    Circle(int x, int y, double r)	// parameterized const.
    {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double area()
    {
        return 3.14 * r * r;
    }

    //  circumference
    public double circumference()
    {
        return 2 * 3.14 * r;
    }

    public static void main(String args[])
    {
        Circle c1 = new Circle();   //DEFAULT CONST. OBJECT

        System.out.println("Default Circle:");
        System.out.println("Area = " + c1.area());
        System.out.println("Circumference = " + c1.circumference());

    
        Circle c2 = new Circle(10, 20, 5);    //PARAMETERIZED CONST. OBJECT

        System.out.println("\nParameterized Circle:");
        System.out.println("Area = " + c2.area());
        System.out.println("Circumference = " + c2.circumference());
    }
}
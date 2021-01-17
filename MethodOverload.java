import java.io.*;
public class MethodOverload
{
    void area(float x, float y)
    {
        System.out.println("Area of the rectangle is "+x*y);
    }
    void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("Area of circle is "+z);
    }
}
class Overload 
{
     public static void main(String args[]) 
	{
	   MethodOverload ob = new MethodOverload();
	   ob.area(3,4);
	   ob.area(4);
        }
}
//Circle,Rectangle,Square Area
class Areaof
{
public static int area(int a)
{

int c=(a*a);

return c;

}
public static double area(double a,double b)
{

double c=(a*b);

return c;

}
public static float area(float a)
{

float c=(3.14f*(a*a));

return c;

}
public static void main(String args[])
{
	
System.out.println("Area of Square is "+Areaof.area(8));
System.out.println("Area of Rectangle is "+Areaof.area(8.8,9.8));
System.out.println("Area of Circle is"+Areaof.area(8.5f));


}
}
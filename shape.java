class comp
{

void area(int x)
{
int a=x;
System.out.println("Area of Square is "+a*a);
}
void area(int y,int z)
{
int l=y;
int b=z;
System.out.println("Area of rectangle is "+l *b);
}
void area(double i)
{
double r=i;
System.out.println("Area of circle is"+3.14*r*r);
}
}
class shape
{
public static void main(String args[]){  
comp c=new comp();
c.area(5);
c.area(2.2);
c.area(2,3);
}
}

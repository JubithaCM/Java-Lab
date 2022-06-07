interface ap
{
void area();
void para();
}
class rectangle implements ap
{
public void area()
{
int l=2;
int b=5;

int a=l*b;
System.out.println("Area of rectangle is"+a);
}
public void para()
{
int l=2;
int b=5;
int p=2*(l+b);
System.out.println("perimeter of rectangle is"+p);
}
}
class circle implements ap
{
public void area()
{
double r=3;

double  a=3.14*r*r;
System.out.println("Area of  area is"+a);
}
public void para()
{
int r=3;
 


double p=3.14*2*r;
System.out.println("parameter of area is"+p);
}
}

class inter
{
public static void main(String args[]){  
ap  in=new rectangle();
ap i=new circle();
in.area();
in.para();
i.area();
i.para();
}
}

import java.util.*;
class product
{
static int s=0;
int p_code;
int price;
String p_name;
product(int p,String n,int c)
{
s++;
p_code=p;
p_name=n;
price=c;
}
void display()
{
System.out.println("Product Code:"+p_code);
System.out.println("Product Name:"+p_name);
System.out.println("Price:"+price);

}
}
class Company
{

public static void main(String a[])

{
int min;
product p1=new product(01,"Bread",30);
p1.display();
product p2=new product(02,"Milk",20);
p2.display();
product p3=new product(03,"Jam",10);
p3.display();
if(p1.price<p2.price && p1.price<p3.price)
min=p1.price;
else if(p2.price<p3.price)
min=p2.price;
else
min=p3.price;
System.out.println("Minimum price is"+min);
System.out.println("No.of instance is"+
p1.s);


}
}


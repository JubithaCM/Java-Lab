class product
{
Static s=0;
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
class company()
{
public Static void main(Sring a[])
{
product p1=new product("01","Bread","30");
p1.display();
product p2=new product("02","Milk","20");
p2.display();
product p3=new product("01","Jam","10");
p3.display();
System.out.println("No.of instance=",+s);
}
}


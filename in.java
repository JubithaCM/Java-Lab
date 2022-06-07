class parent
{
void show()
{
int a=10;
System.out.println("value of a is"+a);
System.out.println("You are in parent Class");
}
}
class child extends parent
{
child()
{
System.out.println("You are in Child class");
}
}
class in
{
public static void main(String args[]){  
child c=new child();
c.show();
}
}
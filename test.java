import java.util.*;
class college
{
String cname;
String principal;
int syear;
void get()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter college name");
cname=s.nextLine();

System.out.println("Enter name of principal");
principal=s.nextLine();
System.out.println("Enter starting year");
syear=s.nextInt();
}
}
class department extends college
{
String dname,course;
int y;
void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter department name");
dname=sc.nextLine();
System.out.println("Enter course name");
course=sc.nextLine();
System.out.println("Enter Course year");
y=sc.nextInt();
}
void show()
{
System.out.println();
System.out.println("College name:"+cname);
System.out.println("Strarting year:"+syear);
System.out.println("Principal:"+principal);
System.out.println("Department name:"+dname);
System.out.println("Starting year:"+y);
System.out.println("Course name:"+course);
}
}
class test
{
public static void main (String arg[])
{
department d=new department();
d.get();
d.input();
d.show();
}
}
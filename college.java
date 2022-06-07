import java.util.*;
class student
{
int roll;
String name;
String course;
Scanner s=new Scanner(System.in);
void getdata()
{

System.out.print("Enter Name");
name=s.nextLine();
System.out.print("Enter Course");
course=s.nextLine();
System.out.print("Enetr Rollno");
roll=s.nextInt();
}
void display()
{
System.out.println("Student name:"+name);
System.out.println("Roll no:"+roll);
System.out.println("Course:"+course);
}
}
class College
{
public static void main(String a[])
{
student s=new student();
s.getdata();
s.display();
}
}  
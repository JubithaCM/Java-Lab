class person
{
person(int a,String n,String g,String ad)
{
int age=a;
String name=n;
String gender=g;
String add=ad;
}
}
class employe extends child {
employe(int a,String n,String g,String ad,int eid, String cname,String Q,int salary)
{
super(a,n,g,ad);
int i=eid;
String n=ename;
String q=Q;
int s=salary;
}
}
class teacher extends employe
{
teacher(int  a,String n,String g,String ad,int eid, String cname,String Q,int salary,String s,String dep,int tid)
{
super(a,n,g,ad,eid,ename,Q,salary);
String sub=s;
String d=dep;
int id=tid;
}
}
class final
{
 public static void main(String args[]){
 Scanner sc= new Scanner(System.in);
          System.out.print("Enter Subject: "); 
         a = sc.nextLine();
        System.out.print("Enter Department: "); 
        b = sc.nextLine();
       System.out.print("Enter teacher id : "); 
        c = Integer.parseInt(sc.nextLine());
     System.out.print("Enter emplooye id : "); 
        d= Integer.parseInt(sc.nextLine());
   System.out.print("Enter Employee name: "); 
        e= sc.nextLine();
   System.out.print("Enter Qualification: "); 
       f= sc.nextLine();
System.out.print("Enter Salary: "); 
        g= Integer.parseInt(sc.nextLine());
    System.out.print("Enter age : "); 
        h = Integer.parseInt(sc.nextLine());    
   System.out.print("Enter Name: "); 
        i= sc.nextLine(); 
   System.out.print("Enter gender: "); 
        j= sc.nextLine();
         System.out.print("Enter adress: "); 
        k= sc.nextLine();
teacher t=new teacher( h,i , j,k,  d,e, f, g, a, b, c);
}
}
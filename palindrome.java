class palindrome
{
 public static void main(String s[])
{
  
  pallindrome(s[0]);
  int b=Integer.parseInt(s[1]);
 palindrome ob=new palindrome();
 ob.calculate(b);
 ob.check(b);
}

 public  static void  pallindrome(String a)
{
 int l=a.length();
int f=0;
for(int i=0,j=l-1; i<j;i++,j--)
if(a.charAt(i)!=a.charAt(j))
{f=1;
  break;}

if(f==0)
System.out.println(a+"is pallindrome");
else
System.out.println(a+"is not pallindrome");
}

 void calculate(int c)
{
 int n,sum=0,x;
n=c;
while(n>0)
{
   x=n%10;
  sum=(sum*10)+x;
  n=n/10;
}
if(sum==c)
System.out.println(c+"is pallindrome");
else
System.out.println(c+"is not pallindrome");
}

 void check(int n)
{
  int x,sum=0,a;

while(n>0)
{
   x=n%10;
  sum=sum+x;
  n=n/10;
}
if(sum>9)
{ a=sum;
    check(a);
}
else
{
 System.out.println("sum =="+sum );
}
}

}
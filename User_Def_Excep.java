import java.util.Scanner;
import java.io.*;
class Voting_Right extends Exception
{
   Voting_Right(String s)
    {  //super(s);
super();
    }
}
class User_Def_Excep
{ 
  public static void main(String str[])
  { 
     
     try{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Password");

         String d=s.nextLine();
        Check(d);
       }catch(Voting_Right n)
         {System.out.println("Denied ...> " +n);
        }
  }
  static void Check(String x) throws Voting_Right{
      
     System.out.println(x);
      if(x=="hcn")
      {		
       throw new Voting_Right("Incorrect");
 }
      else{
      System.out.println("Success");
}
     
          
    }
}     
import java.util.*;
class calculator
{
   public static void main(String args[])
   {
     int n1,n2;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter First values");
     n1=sc.nextInt();
     System.out.println("Choose any operator for operations : add(+),sub(-),mul(*),div(/),mod(%)");
     int choice=sc.next().charAt(0);
     System.out.println("Enter Second values");		
     n2=sc.nextInt();
     switch(choice)
     {
      case '+': System.out.print(n1+n2); 
       break;
      case '-': System.out.print(n1-n2);
       break;
      case '*': System.out.print(n1*n2);
       break;
      case '/': System.out.print(n1/n2);
       break;
      case '%': System.out.print(n1%n2);
   
       default:System.out.print("Please check the values you entered");
      }
    }
}     
import java.util.Scanner;
import java.util.*;
 class Game
 {
   public static void main(String args[])
    {
      int i,k,n;
      Scanner sc=new Scanner(System.in);
      i = 1 + (int)(100 * Math.random());


      int count=0;

       while(true)
        {
	 System.out.println("Guess the number with in the range (1-100)");

     	 k=sc.nextInt();
         if(k==i)
	 {
            System.out.println("Congrats!! You Win The Game");
	    break;
         }
         else if(k<i)
         {
            System.out.println("less than");
         }
         else if(k>i)
         {
            System.out.println("greater than");
         }

         count=count+1;
      } 
     System.out.print(count);
      
    }
 }
      
      
      
      
      
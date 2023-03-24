package Task;
import java.util.Scanner; 
  // Write a program in Java to display n terms of natural numbers and their sum.
public class task6 {
	  
	  public static void main(String[] args)

	{
	   int i, n, sum=0;
	   {
	   Scanner sc = new Scanner(System.in);  
	        System.out.print("Input number: ");  
	         n = sc.nextInt();
	}
	  System.out.println("The first n natural numbers are : "+n);
	  
	 for(i=1;i<=n;i++)
	   {
	     System.out.println(i);
	     sum+=i;
	   }
	System.out.println("The Sum of Natural Number upto "+n+ " terms : " +sum);

	}
	}


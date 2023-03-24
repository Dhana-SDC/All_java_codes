package Task;
import java.util.Scanner;
public class task7 {
	// Write a program in Java to display the multiplication table of a given integer

	   public static void main(String[] args)

	{
	   int j,n;

	   System.out.print("Input the number(Table to be calculated): ");
	{
	   System.out.print("Input number of terms : ");
	    Scanner sc = new Scanner(System.in);
			    n = sc.nextInt();

	   System.out.println ("\n");
	   for(j=0;j<=n;j++)
	  
	     System.out.println(n+" X "+j+" = " +n*j);
	   }
	}
	}

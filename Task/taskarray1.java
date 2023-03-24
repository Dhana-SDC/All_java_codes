package Task;

public class taskarray1 {
//Write a Java program to find the maximum and minimum value of an array	
	  public static void main(String[] args)
	  {
	       
		int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
	       int min=array[0];
	       int max=array[0];
	       for(int i=0;i<=9;i++)
	       {
	    
	         if(array[i]<min)
	           {
	           min=array[i];
	           }
	         if(array[i]>max)
	         {
	           max=array[i];
	         }
	       }
	       System.out.println("Maximum element is "+max);
	       System.out.println("Minimum element is "+min);
	       
	       
	  }
	}


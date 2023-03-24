package Task;
// Write a Java program to find the duplicate values of an array of integer values
public class taskarray3 {
	
	  public static void main(String[] args) 

	    {      
	       
	        int [] a1 = new int [] {1, 2, 3, 7, 2, 7, 8, 8, 9};   
	       
	        System.out.println("Duplicate elements in given array: ");  

	       	        for(int i = 0; i < a1.length; i++) 

	        {  

	            for(int j = i + 1; j < a1.length; j++) 

	            {  

	                if(a1[i] == a1[j])  

	                    System.out.println(a1[j]);  

	            }  

	        }  

	    }  

	} 



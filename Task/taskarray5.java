package Task;

public class taskarray5 {

   public static void main(String[]args) {
	   int[]arr= {1,5,3,9,2,8};
	   int smallest=Integer.MAX_VALUE;
	   int secondsmallest=Integer.MIN_VALUE;
	   

	     for(int i=0;i<arr.length;i++) {
	    	 if(arr[i]<smallest) {
	    		 secondsmallest=smallest;
	    		 smallest=arr[i];
	    	 }else if (arr[i]<secondsmallest&&arr[i]!=smallest) {
	     }
	  }
 System.out.println("second smallest element:"+secondsmallest);
 
   }
 }

	     
	    
package Gdrive;

public class ExceptionHandling5 {
	 public static void main(String[] args){
	     square(6);
	 }
	 // user defined method
	 public static void square(Integer num){
	     // if condition
	     if(num<0){
	         // java throw exception inside method
	         throw new ArithmeticException("Number should not be negative!");
	     }
	     // else statement
	     else{
	         System.out.println("The square is: "+num*num);
	     }
	 }
}

package Generics;

public class task5 {
	 public static void main( String args[] ) {
	        Printer myPrinter = new Printer();
	        Integer[] intArray = { 1, 2, 3 };
	        String[] stringArray = {"Hello", "World"};
	        myPrinter.printArray(intArray);
	        myPrinter.printArray(stringArray);
	    }
}
	 class Printer
	 {
	    public <T> void printArray(T[] arr){
	        for(T obj:arr){
	            System.out.println(obj);
	        }
	    }
	 }
package Lambdas;

public class task1 {
	
	//Write a program to implement Runnable Functional interface using lambda expression

	    public static void main(String[] args) {

	        new Thread(new Runnable() {
	            
	            public void run() {
	                System.out.println("I just implemented the Runnable Functional Interface.");
	            }
	        }).start();
	    }
	}


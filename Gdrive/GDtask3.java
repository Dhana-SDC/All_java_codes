package Gdrive;
import java.io.File;
public class GDtask3 {
// Write a Java program to check if a file or directory specified by pathname exists or not.	
	       public static void main(String[] args) {
	        // Create a File object
	        File my_file_dir = new File("D:/game");
	         if (my_file_dir.exists()) 
	           {
	            System.out.println("The directory or file exists.\n");
	           } 
	         else
	          {
	            System.out.println("The directory or file does not exist.\n");
	          }
	       }
	  }


package Gdrive;
import java.io.File;
public class GDtask1 {
//: Write a Java program to get a list of all file/directory names from the 
	  //given specified folder.	
	     public static void main(String a[])
	     {
	        File file = new File("D:/");
	        String[] fileList = file.list();
	        for(String name:fileList){
	            System.out.println(name);
	        }
	    }
	}


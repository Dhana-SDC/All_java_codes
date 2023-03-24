package Gdrive;
import java.io.File;
import java.io.FilenameFilter;

//: Write a Java program to get specific files by extensions from a specified folder.
public class GDtask2 {
	       public static void main(String a[]){
	        File file = new File("D:/");
	           String[] list = file.list(new FilenameFilter() {
	           @Override
	            public boolean accept(File dir, String name) {
	             if(name.toLowerCase().endsWith(".exe")){
	                    return true;
	                } else {
	                    return false;
	                }
	            }
	        });
	        for(String f:list){
	            System.out.println(f);
	        }
	    }
	}


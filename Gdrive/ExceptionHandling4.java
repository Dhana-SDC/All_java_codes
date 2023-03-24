package Gdrive;
import java.io.*;
public class ExceptionHandling4 {
	public static void findFile() throws FileNotFoundException  {
	    // code that may produce IOException
	    File newFile=new File("d:/.txt");
	    FileInputStream stream=new FileInputStream(newFile);
	  }

	  public static void main(String[] args) {
	    try{
	      findFile();
	    } catch(IOException e){
	      System.out.println(e);
	    }
	  }
}

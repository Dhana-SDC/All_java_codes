package Generics;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class task2 {
	 public static void main(String[] args) {

	        Map<Integer,Integer> integerMap 
	        = new HashMap<Integer,Integer>();
	 
	     integerMap.put(1, 10);
	     integerMap.put(2, 11);

	     // iterate keys.
	     Iterator<Integer> integerIterator   = integerMap.keySet().iterator();

	     while(integerIterator.hasNext()) {
	    	 int key=integerIterator.next();
	        System.out.printf("Key :%d\n", key);
	        System.out.printf("Value :%d\n", integerMap.get(key));

	   }  
	 }
}

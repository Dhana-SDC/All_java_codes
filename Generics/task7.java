package Generics;

public class task7 {
	 
	public static <T> int count(T[] array, T item) {
	    int count = 0;
	 
	    if (item == null) {
	        for (T element : array) {
	            if (element == null) count++;
	        }
	    } else {
	        for (T element : array) {
	            if (item.equals(element)) {
	                count++;
	            }
	        }
	    }
	 
	    return count;
	 
	}
}

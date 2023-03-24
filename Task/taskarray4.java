package Task;

public class taskarray4 {
// Find the second largest element in an array	
	    static int findSecondLargest(int a[], int n) {

	        int first_largest = 0;
	        int second_largest = -1;

	        for (int i = 0; i < n; i++) {
	            if (a[i] > a[first_largest]) {
	                second_largest = first_largest;
	                first_largest = i;
	            } else if (a[i] < a[first_largest]) {
	                if (second_largest == -1 || a[second_largest] < a[i])
	                    second_largest = i;
	            }
	        }

	        return a[second_largest];
	    }

	    public static void main(String[] args) {
	        int a[] = { 12, 35, 1, 10, 34, 1 };
	        int n = a.length;

	        int answer = findSecondLargest(a, n);

	        System.out.println("The second largest element in the array is: " + answer);

	    }
	}


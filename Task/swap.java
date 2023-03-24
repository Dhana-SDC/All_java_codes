package Task;
import java.util.Scanner;
public class swap {
	public static void main(String[] args) {
		int a,b,temp;
		Scanner s =new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("old value of a ="+ a +" "+ "old value of b ="+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swap value of a ="+ a +" "+ "after swap value of b ="+b);
	}

}

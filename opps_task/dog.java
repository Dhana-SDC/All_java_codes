package opps_task;

public class dog {
	
		String breed;
		int age;
		String colour;

		public void bark() {
			System.out.println("barking");
		}

		public void sleep() {
			System.out.println("sleep");
		}
		public static void main (String[]args) {
			dog obj= new dog();
			obj.sleep();
			obj.bark();
		}
	}


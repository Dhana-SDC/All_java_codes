package opps_task;

public class Employee {

		private int id;
		private String name;
		private float salary =30000;
		
		public void raiseSalary(int percent){
			System.out.println(salary+salary/percent);
		}
		public static void main(String[]args) {
			Employee emp=new Employee();
			emp.raiseSalary(10);
		}
		

	}


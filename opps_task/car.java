package opps_task;

public class car {
		private int price;
		private String model;

		public void start() {
			System.out.println("Car Start");
		}

		public void stop() {
			System.out.println("Car stop");
		}

		public void move() {
			System.out.println("Car move");
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			System.out.println(price);
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			System.out.println(model);
		}


		public static void main(String[]args) {
			car obj=new car();
			Driver object=new Driver();
			obj.stop();
			obj.start();
			obj.move();
			obj.setPrice(2500000);
			obj.setModel("KIA");
			object.drive();
			object.setAge(25);
			object.setName("dhana");
		}
		 static class Driver {
				private String name;
				private int age;

				public void drive() {

					System.out.println("Driver drive car");
				}

				public String getName() {
					return name;
				}

				public void setName(String name) {
				System.out.println(name);
				}

				public int getAge() {
					return age;
				}

				public void setAge(int age) {
					System.out.println(age);
				}
			
		 }
}


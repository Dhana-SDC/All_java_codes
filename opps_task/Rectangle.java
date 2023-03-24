package opps_task;

public class Rectangle {
 
		private int length;
		private int width;
		
		public static void main (String[]args) {
			Rectangle r=new Rectangle();
			r.length=15;
			r.width=20;
			r.getArea();
		}
			
	public double getArea() {
		double area=length*width;
		System.out.println("Area of rectangle is :"+area);
		return area;
	}
}


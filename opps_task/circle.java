package opps_task;

public class circle {
  
		  
		   private double radius;
		   private String color;
		   public circle() {
			   System.out.println("this is default constructor");
		   }
		 
		    public circle(String c,double r) { 
		      radius = r;
		      color = c;
		   }
		   
		   
		   public double getRadius() {
			   System.out.println("radious of circle is:"+radius);
		     return radius; 
		   }
		   
		  
		   public double getArea() {
			   double area=radius*radius*Math.PI;
			   System.out.println("Area of circle:"+area);
		      return area;
		   }
		   public static void main(String[]args) {
			   circle c=new circle();
			   c.color="red";
			   c.radius=25;
			   c.getRadius();
			   c.getArea();
		}
}

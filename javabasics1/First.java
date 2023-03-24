package javabasics1;

public class First {
//instance variables
int StuId;
String name="bently";
double avg;
First(int id,string name,double d){
	this.StuId =id;
	this.name=name;
	this.avg=d;
}
void display(String name) {
	System.out.println(StuId+" "+name+" "+avg);
}
String Details() {
	return name+" scored "+avg;
}
public static void main(String ) 
}

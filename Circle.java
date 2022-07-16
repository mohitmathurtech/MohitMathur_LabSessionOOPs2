package learning;

public class Circle implements IShape{
	double radius;
	String color;
	
	public Circle(String color,double radius){
		this.color = color;
		this.radius = radius;
	}
	public double calculateArea(){
		return 3.14* radius * radius;
	}
	@Override
	public double calculatePerimeter() {
		return 2*3.14* radius;
	}
}
package learning;

public class Rectangle implements IShape{
	int width, length;
	String color;

	public Rectangle(String color, int width, int length){
		this.color = color;;
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double calculateArea(){
		return this.length*this.width;
	}
	
	@Override
	public double calculatePerimeter() {
		return 2*(this.length + this.width);
	}
	
	

}

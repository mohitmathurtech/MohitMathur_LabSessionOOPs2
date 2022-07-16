package learning;

public class Square extends Rectangle{
	public Square(String color, int length, int width) {
		super(color,length,width);
	}
	
	public double calculateArea() {
		System.out.println("Calculate area in square in called");
		return length*length;
	}
}


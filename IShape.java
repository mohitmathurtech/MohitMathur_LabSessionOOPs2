package learning;

public interface IShape {
//	double  area , perimeter;
	
	Renderer renderer = new Renderer();
	
	public double calculateArea();
	public double calculatePerimeter();
	//public void draw();
	//public void draw(String message);
	
	
}

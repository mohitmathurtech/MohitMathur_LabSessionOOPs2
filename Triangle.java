package learning;

class Triangle implements IShape{
	int height, base;
    String color;
	public Triangle (String color, int height, int base){
		this.color = color;	
		this.height =height;
		this.base = base;
	}
	
	@Override
	public double calculateArea(){
		return (base*height)/2;
	}
	
	@Override
	public double calculatePerimeter() {
		return this.height+this.base;
	}
	
}

package learning;

import java.util.Scanner;

public class MainShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Circle circle = new Circle("Red" , 14);
        Rectangle rectangle = new Rectangle("Blue",10,4);
        Square square = new Square("Black",8,4);
        Triangle triangle = new Triangle("Red", 14,7);
        

        
        
        System.out.println("Area of cirle " + circle.calculateArea());
        System.out.println("Perimeter of cirle " + circle.calculatePerimeter());
        circle.renderer.draw();
        circle.renderer.draw("This is main class");
        
        System.out.println("Area of cirle " + triangle.calculateArea());
        System.out.println("Perimeter of cirle " + triangle.calculatePerimeter());
        triangle.renderer.draw();
        triangle.renderer.draw("This is main class");
        
        
        System.out.println("Area of Rectangle is " + rectangle.calculateArea());
        System.out.println("Perimeter of Rectangle" + rectangle.calculatePerimeter());
        rectangle.renderer.draw();
        rectangle.renderer.draw("This is main class");	
        
        System.out.println("Area of Square " + square.calculateArea());
	}


}

package application;

import java.util.Locale;

import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Shape;
import model.enums.Color;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Shape s1 = new Circle(Color.BLUE, 3.5);
		Shape s2 = new Rectangle(Color.GREEN, 3.0, 4.0);
		
		System.out.println("Circle color: " + s1.getColor());
		System.out.println("Circle area: " + String.format("%.3f", s1.area()));
		System.out.println("Rectangle color: " + s2.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
	}
}
package geometricobject;

public class Circle implements GeometricObject {
	public double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public double getArea() {
		return Math.PI*radius*radius;
	}

	@Override
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	
	public static void main(String[] arg) {
		Circle c = new Circle(22.1);
		System.out.println(c.getArea());
		System.out.println(c.getPerimeter());
	}

}

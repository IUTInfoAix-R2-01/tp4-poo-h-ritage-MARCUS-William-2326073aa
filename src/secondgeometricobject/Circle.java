package secondgeometricobject;

public class Circle implements GeometricObject{
	protected double radius;
	
	public Circle(double radius) {
		this.radius=radius;
	}
	
	public String toString() {
		return "Circle[radius="+radius+"]";
	}

	@Override
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}

	@Override
	public double getArea() {
		return Math.PI*radius*radius;
	}
	public static void main(String[] args) {
		Circle c = new Circle(64);
		System.out.println(c);
		System.out.println(c.getPerimeter());
		System.out.println(c.getArea());
	}

}

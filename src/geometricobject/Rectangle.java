package geometricobject;

public class Rectangle implements GeometricObject{
	public double width;
	public double length;
	public Rectangle(double width, double length) {
		this.width=width;
		this.length=length;
	}
	@Override
	public double getArea() {
		return width*length;
	}

	@Override
	public double getPerimeter() {
		return (width+length)*2;
	}
	
	public static void main(String[] arg) {
		Rectangle r = new Rectangle(22.1,16.2);
		System.out.println(r.getArea());
		System.out.println(r.getPerimeter());
	}

}

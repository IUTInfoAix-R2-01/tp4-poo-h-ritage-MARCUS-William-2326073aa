package secondgeometricobject;

public class ResizableCircle extends Circle implements Resizable{
	
	public ResizableCircle(double radius) {
		super(radius);
	}
	
	public String toString() {
		return "ResizableCircle[Circle[radius="+radius+"]]";
	}
	
	@Override
	public void resize(int percent) {
		radius= radius*(percent/100.);
		
	}
	public static void main(String[] args) {
		ResizableCircle r = new ResizableCircle(64);
		System.out.println(r);
		r.resize(12);
		System.out.println(r);
	}

}

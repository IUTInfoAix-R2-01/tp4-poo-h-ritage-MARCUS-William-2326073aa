package secondanimals;

public class Cat extends Animal{
	public Cat(String name) {
		super(name);
	}
	public void greets() {
		System.out.println("Meow");
	}
	public static void main(String[] args) {
		Cat s = new Cat("black cat");
		s.greets();
	}
	

}

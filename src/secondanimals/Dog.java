package secondanimals;

public class Dog extends Animal{
	public Dog(String name) {
		super(name);
	}
	public void greets() {
		System.out.println("Woof");
	}
	public void greets(Dog oui) {
		System.out.println("Woooof");
	}
	public static void main(String[] args) {
		Dog s = new Dog("dogo");
		s.greets();
		s.greets(s);
	}

}

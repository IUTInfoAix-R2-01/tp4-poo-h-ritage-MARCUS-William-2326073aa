package secondanimals;

public class BigDog  extends Dog{
	public BigDog(String name) {
		super(name);
	}
	public void greets() {
		System.out.println("Wooow");
	}
	public void greets(Dog oui) {
		System.out.println("Wooooow");
	}
	public void greets(BigDog oui) {
		System.out.println("Woooooooow");
	}
	
	public static void main(String[] args) {
		BigDog s = new BigDog("considère l'envergure du dogo");
		s.greets();
		s.greets(s);
		Dog a = new Dog("dogo");
		s.greets(a);
	}

}

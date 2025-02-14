package animals;

public class Dog extends Mammal{
	
	public Dog(String name) {
		super(name);
	}
	public String toString() {
		return "Dog[Mamaml[Animal[name="+name+"]]]";
	}
	public void greets() {
		System.out.println("Woof");
	}
	public void greets(Dog oui) {
		System.out.println("Woooof");
	}
	public static void main(String[] args) {
		Dog a = new Dog("huge dogo");
		System.out.println(a.toString());
		a.greets();
		a.greets(a);
	}

}

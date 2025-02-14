package animals;

public class Cat extends Mammal{
	public Cat(String name) {
		super(name);
	}
	public String toString() {
		return "Cat[Mamaml[Animal[name="+name+"]]]";
	}
	public void greets() {
		System.out.println("Meow");
	}
	public static void main(String[] args) {
		Cat a = new Cat("black cat");
		System.out.println(a.toString());
		a.greets();
	}

}

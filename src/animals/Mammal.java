package animals;

public class Mammal extends Animal{
	public Mammal(String name) {
		super(name);
	}
	public String toString() {
		return "Mamaml[Animal[name="+name+"]]";
	}
	public static void main(String[] args) {
		Mammal a = new Mammal("pig");
		System.out.println(a.toString());
	}
	
}

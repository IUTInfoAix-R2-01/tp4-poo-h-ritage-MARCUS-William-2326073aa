package animals;

public class Animal {
	public String name;
	
	public Animal(String name) {
		this.name = name;
	}
	public String toString() {
		return "Animal[name="+name+"]";
	}
	public static void main(String[] args) {
		Animal a = new Animal("dog");
		System.out.println(a.toString());
	}

}

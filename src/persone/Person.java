package persone;

public class Person {
	public String name;
	public String address;
	
	public Person(String name, String address) {
		this.name = name;
		this.address=address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}
	public String toString() {
		return "Person[name="+name+","+address+"]";
	}
	
	public static void main(String[] args) {
		Person p = new Person("william", "la seyne sur mer");
		System.out.println(p.toString());
		p.setAddress("ouioui");
		System.out.println(p.getAddress());
	}

}

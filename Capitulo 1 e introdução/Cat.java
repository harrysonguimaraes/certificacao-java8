abstract class Animal {
	
	abstract void greet();
}

public abstract class Cat extends Animal {

	public void gritar(){
		System.out.println("Miau");
	}

	//public void greet() {
	//	System.out.println("Gritando");
	//}

	public static void main(String[] args) {
		// Cat cat = new Cat();
		// cat.greet();
		System.out.println("works");
	}
}
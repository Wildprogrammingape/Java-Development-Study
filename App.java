package static_demo;

public class App {

	public static void main(String[] args) {
		// Static method
		// Advantages: call the method without initialize an object
		// e.g: Math
		
		Prints.sayHello();
		
		System.out.println("My name is " + Prints.name);

	}

}

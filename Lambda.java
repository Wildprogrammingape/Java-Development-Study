package lambda;

// functional interface (only have one method)
interface Abc{
	void show();
}

public class Lambda {

	public static void main(String[] args) {
		
		// using lambda expression to define implementation of interface Abc (show method)
		Abc obj = () -> System.out.println("Java Lambda expression");
		
		obj.show();
		
	}

}

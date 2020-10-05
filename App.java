package generics;

public class App {

	public static void main(String[] args) {
		
		// Java generics ·ºÐÍ 
		// generic method ·ºÐÍº¯Êý    <T>
		// Advantage: avoid too many method overload
		
		//int[] intArray = new int[] {1,2,3,4};
		//char[] charArray = new char[] {'a','b','c','d'};
		
		// create data in this way if using genetic method
		Integer[] intArray = {1,2,3,4};
		Character[] charArray = {'a','b','c','d'};
		
		// print every element of two arrays
//		printMe(intArray);
//		printMe(charArray);
		
		// use generics 
		printAll(intArray);
		printAll(charArray);
		
	}
	
	// generic method
	public static <T> void printAll(T[] x) {
		for (T n : x) {
			System.out.printf("%s", n);
		}
		
		System.out.println();  // sysout  + control + space
	}
	
	
	
	// method overload
	public static void printMe(int[] intArray) {
		for (int n : intArray) {
			System.out.print(n);
		}
		System.out.println();
	}
	// method overload
	public static void printMe(char[] charArray) {
		for (char c : charArray) {
			System.out.printf("%s", c);
		}
	}
}

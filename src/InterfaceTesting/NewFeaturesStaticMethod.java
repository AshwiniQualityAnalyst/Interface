package InterfaceTesting;

interface in3 {
	final int a = 10;

	static void display() {
		System.out.println("hello");
	}
}

public class NewFeaturesStaticMethod implements in3 {

	public static void main(String[] args) {
		in3.display();

	}

}

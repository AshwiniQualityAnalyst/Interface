package InterfaceTesting;

interface in2 {
	final int a = 10;

	default void display() {
		System.out.println("hello");
	}
}

public class NewFeaturesDefaultMethod implements in2 {

	public static void main(String[] args) {
		NewFeaturesDefaultMethod t = new NewFeaturesDefaultMethod();
		t.display();
	}

}

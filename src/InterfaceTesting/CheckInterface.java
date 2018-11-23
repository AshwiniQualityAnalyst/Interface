package InterfaceTesting;

interface in1 {
	// public, static and final
	final int a = 10;

	// public and abstract
	void display();
}

class testClass implements in1 {

	public void display() {
		System.out.println("Interface Implemnted");
	}
}

public class CheckInterface {

	public static void main(String[] args) {

		testClass t = new testClass();
		t.display();
		System.out.println(t.a);

	}
}

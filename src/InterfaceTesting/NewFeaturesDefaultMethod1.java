package InterfaceTesting;

interface drawing {
	default void msg() {
		System.out.println("default method");
	}
}

class drawing1 implements drawing {
	public void draw() {
		System.out.println("Normal method");
	}
}

public class NewFeaturesDefaultMethod1 {

	public static void main(String[] args) {
		drawing1 d = new drawing1();
		d.draw();
		d.msg();

	}

}

package InterfaceTesting;

interface Printable1 {
	void print();
}

interface Showable1 extends Printable1 {
	void show();
}

public class InterfaceExtendsInterface implements Showable1 {

	@Override
	public void print() {
		System.out.println("Hello");

	}

	@Override
	public void show() {
		System.out.println("World");

	}

	public static void main(String[] args) {
		InterfaceExtendsInterface IF = new InterfaceExtendsInterface();
		IF.show();
		IF.print();
	}

}

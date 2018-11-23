package InterfaceTesting;

interface Printable {
	void print();
}

interface Showable {
	void show();
}

public class MultipleInterfaces implements Printable, Showable {

	@Override
	public void show() {
		System.out.println("Hello");

	}

	@Override
	public void print() {
		System.out.println("World");

	}

	public static void main(String[] args) {
		MultipleInterfaces M = new MultipleInterfaces();
		M.print();
		M.show();

	}

}

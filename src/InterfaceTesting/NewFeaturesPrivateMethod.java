package InterfaceTesting;

interface Drawable {
	void draw();
}

class Rectangle implements Drawable {

	@Override
	public void draw() {
		System.out.println("Draw Rectangle");
	}

}

class Circle implements Drawable {

	@Override
	public void draw() {
		System.out.println("Draw Circle");
	}

}

public class NewFeaturesPrivateMethod {

	public static void main(String[] args) {
		Drawable D = new Rectangle();
		D.draw();
		Drawable D1 = new Circle();
		D1.draw();
	}

}

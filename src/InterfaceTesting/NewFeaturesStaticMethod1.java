package InterfaceTesting;

interface staticMethods {
	void draw();

	static int Cube(int x) {
		return x * x * x;
	}
}

class Another implements staticMethods {

	@Override
	public void draw() {
		System.out.println("Abstarct Method Called");
	}

}

public class NewFeaturesStaticMethod1 {

	public static void main(String[] args) {
		staticMethods sM = new Another();
		sM.draw();
		System.out.println(staticMethods.Cube(3));
	}

}

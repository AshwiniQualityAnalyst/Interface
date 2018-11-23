package InterfaceTesting;

interface Bank {
	float rateOfInterest();
}

class SBI implements Bank {

	@Override
	public float rateOfInterest() {
		return 9.15f;
	}

}

class PNB implements Bank {

	@Override
	public float rateOfInterest() {
		return 9.7f;
	}

}

public class RealWorldExampe1 {

	public static void main(String[] args) {
		Bank ref = new SBI();
		System.out.println(ref.rateOfInterest());
		Bank ref1 = new PNB();
		System.out.println(ref1.rateOfInterest());
	}

}

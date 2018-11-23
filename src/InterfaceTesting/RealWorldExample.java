package InterfaceTesting;

interface Vehicle {
	// all are the abstract methods.
	void changeGear(int a);

	void speedUp(int a);

	void applyBrakes(int a);
}

class Bicycle implements Vehicle {

	int speed;
	int gear;

	// to change gear
	@Override
	public void changeGear(int newGear) {
		gear = newGear;

	}

	// to increase speed
	@Override
	public void speedUp(int increment) {
		speed = speed + increment;

	}

	// to decrease speed
	@Override
	public void applyBrakes(int decrement) {
		speed = speed - decrement;

	}

	public void printStates() {
		System.out.println("Speed: " + speed + " Gear: " + gear);
	}

}

class Bike implements Vehicle {
	int speed;
	int gear;

	@Override
	public void changeGear(int newGear) {
		gear = newGear;

	}

	@Override
	public void speedUp(int increment) {
		speed = speed + increment;

	}

	@Override
	public void applyBrakes(int decrement) {
		speed = speed - decrement;

	}

	public void printStates() {
		System.out.println("Speed: " + speed + " Gear: " + gear);
	}

}

public class RealWorldExample {

	public static void main(String[] args) {
		Bicycle B = new Bicycle();
		B.changeGear(10);
		B.speedUp(10);
		B.applyBrakes(10);
		System.out.println("Bicycle present state :");
		B.printStates();

		Bike bike = new Bike();
		bike.changeGear(1);
		bike.speedUp(4);
		bike.applyBrakes(3);
		System.out.println("Bike present state :");
		bike.printStates();
	}

}

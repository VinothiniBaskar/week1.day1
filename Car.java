package week1.day1;

public class Car {
	public void driveCar() {
		System.out.println("The car is started succesfully");
	}

	public void applyBrake() {
		System.out.println("The car is stopped");
	}

	public void soundHorn() {
		System.out.println("Press the Horn");
	}

	public void isPuncture() {
		System.out.println("The car is  not Puncture");
	}

	public static void main(String[] args) {
		Car obj = new Car();
		obj.driveCar();
		obj.applyBrake();
		obj.soundHorn();
		obj.isPuncture();

	}

}

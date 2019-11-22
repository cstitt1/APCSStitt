package p3_5;
public class CarTester {
	public static void main(String[] args) {
		Car myCar = new Car(70);
		myCar.addGas(25);
		myCar.drive(350);
		System.out.println(myCar.getGasInTank());
	}
}
package p3_5;

/**
 * A class that creates a car and can change the gas in its tank.
 * @author cstit
 */
public class Car {
	
	/**
	 * A private variable to hold the fuel efficiency value in miles per gallon.
	 */
	private double mpg, gas;
	
	/**
	 * Creates an object of class Car with a certain fuel efficiency
	 * @param eff the fuel efficiency
	 */
	public Car(int eff) {
		mpg = eff;
		gas = 0;
	}
	
	/**
	 * Adds a certain number of gallons of gas to the car.
	 * @param gal The number of gallons
	 */
	public void addGas(int gal) {
		gas += gal;
	}
	
	/**
	 * Drives the car a certain number of miles, reducing the gas.
	 * @param miles The number of miles driven.
	 */
	public void drive(int miles) {
		gas -= (miles/mpg);
	}
	
	/**
	 * Gives the amount of gas left in the car.
	 * @return The amount of gas left in the car.
	 */
	public double getGasInTank() {
		return gas;
	}
}
package proj4_1part2;

/**
 * This class creates a triangle given the 3 corner coordinates and 
 * computes the side lengths, angles, perimeter, and area
 * @author cstitt
 *
 */
public class Triangle 
{
	private int xA, yA, xB, yB, xC, yC;
	private double sideA, sideB, sideC, angleA, angleB, angleC;
	/**
	 * This constructs a triangle with the given 3 corner coordinates
	 * @param x1 x coordinate of corner 1
	 * @param y1 y coordinate of corner 1
	 * @param x2 x coordinate of corner 2
	 * @param y2 y coordinate of corner 2 
	 * @param x3 x coordinate of corner 3
	 * @param y3 y coordinate of corner 3 
	 */
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3)
	{
		xA = x1;
		yA = y1;
		xB = x2;
		yB = y2;
		xC = x3;
		yC = y3;
		sideA = this.distanceFormula(xB, yB, xC, yC);
		sideB = this.distanceFormula(xA, yA, xC, yC);
		sideC = this.distanceFormula(xA, yA, xB, yB);
		angleA = this.lawOfCosine(sideA, sideB, sideC);
		angleB = this.lawOfCosine(sideB, sideA, sideC);
		angleC = this.lawOfCosine(sideC, sideA, sideB);
	}
	
	private double distanceFormula(int x, int y, int xPrime, int yPrime) {
		double res = Math.pow(xPrime-x, 2);
		res += Math.pow(yPrime-y, 2);
		res = Math.sqrt(res);
		return res;
	}
	
	private double lawOfCosine(double side1, double side2, double side3) {
		double angleSide1 = Math.pow(side2,2)+Math.pow(side3,2)-Math.pow(side1, 2);
		angleSide1 /= (2*side2*side3);
		angleSide1 = Math.acos(angleSide1);
		angleSide1 *= (180/Math.PI);
		return angleSide1;
	}
	
	/**
	 * returns the side length of the side opposite the corner with the same number. 
	 * The side number must be in the range 1<= sideNumber <= 3
	 * For example sideNumber 1 is the side opposite the corner (xA, yA)
	 * @param sideNumber the side the triangle whose length will be returned
	 * @return the side length of the given side
	 */
	public double getSideLength(int sideNumber)
	{
		if (sideNumber==1) {
			return sideA;
		} else if (sideNumber==2) {
			return sideB;
		} else if (sideNumber==3) {
			return sideC;
		} else {
			return -1;
		}
	}
	
	/**
	 * returns the angle measure at the corner with the same number
	 * The angle number must be in the range 1<= angleNumber <= 3
	 * For example angleNumber 1 is the angle at corner (xA, yA)
	 * @param angleNumber the angle of the triangle whose measure will be returned
	 * @return the angle measure of the given angle number
	 */
	public double getAngle(int angleNumber)
	{
		if (angleNumber==1) {
			return angleA;
		} else if (angleNumber==2) {
			return angleB;
		} else if (angleNumber==3) {
			return angleC;
		} else {
			return -1;
		}
	}
	
	/**
	 * returns the perimeter of the triangle, which is the sum of the sides
	 * @return the perimeter of the triangle
	 */
	public double getPerimeter()
	{
		return sideA+sideB+sideC;
	}
	
	/**
	 * returns the area of the triangle using Heron's Formula
	 * @return the area of the triangle
	 */
	public double getArea()
	{
		double areaT;
		double semiP = this.getPerimeter()/2;
		areaT = Math.sqrt(semiP*(semiP-sideA)*(semiP-sideB)*(semiP-sideC));
		return areaT;
	}
}
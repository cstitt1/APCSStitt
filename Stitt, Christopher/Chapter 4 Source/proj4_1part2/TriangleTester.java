package proj4_1part2;

public class TriangleTester {

	public static void main(String[] args) {
		Triangle tri = new Triangle(0,0,5,7,4,3);
		System.out.println(tri.getSideLength(1));
		System.out.println(tri.getSideLength(2));
		System.out.println(tri.getSideLength(3));
		System.out.println(tri.getAngle(1));
		System.out.println(tri.getAngle(2));
		System.out.println(tri.getAngle(3));
		System.out.println(tri.getPerimeter());
		System.out.println(tri.getArea());
	}

}

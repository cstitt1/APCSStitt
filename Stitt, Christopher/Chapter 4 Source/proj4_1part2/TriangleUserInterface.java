package proj4_1part2;
import java.util.Scanner;

public class TriangleUserInterface {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input the x and y coordinates for the triangles corners.");
		System.out.println("The points will be x1, y1, x2, y2, x3, and y3, respectively.");
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		int x2 = input.nextInt();
		int y2 = input.nextInt();
		int x3 = input.nextInt();
		int y3 = input.nextInt();
		Triangle tri = new Triangle(x1,y1,x2,y2,x3,y3);
		System.out.println("The distance between the point (x1,y1) and the point (x2,y2) is "+tri.getSideLength(3)+" units.");
		System.out.println("The distance between the point (x1,y1) and the point (x3,y3) is "+tri.getSideLength(2)+" units.");
		System.out.println("The distance between the point (x2,y2) and the point (x3,y3) is "+tri.getSideLength(1)+" units.");
		System.out.println("The angle at the point (x1,y1) is "+tri.getAngle(1)+" degrees.");
		System.out.println("The angle at the point (x2,y2) is "+tri.getAngle(2)+" degrees.");
		System.out.println("The angle at the point (x3,y3) is "+tri.getAngle(3)+" degrees.");
		System.out.println("The area of the triangle is "+tri.getArea()+" units.");
		System.out.println("The perimeter of the triangle is "+tri.getPerimeter()+" units.");
		input.close();
	}

}

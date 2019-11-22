package p9_06;

import java.awt.Rectangle;

import p9_3_with_callback.Measurer;

public class RectanlgeDataSet {

	public static void main(String[] args) {
		Measurer<Rectangle> rectMeasurer = new RectangleMeasurer();
		DataSet<Rectangle> test = new DataSet<Rectangle>(rectMeasurer);
		
		Rectangle rect1 = new Rectangle(1, 2);
		Rectangle rect2 = new Rectangle(5, 3);
		Rectangle rect3 = new Rectangle(7, 2);
		
		test.add(rect3);
		test.add(rect2);
		test.add(rect1);
		
		System.out.println("Max Rectangle: "+"Width="+test.getMaximum().getWidth() + " & Height="+test.getMaximum().getHeight());
	}

}

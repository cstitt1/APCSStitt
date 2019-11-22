package p9_06;

import java.awt.Rectangle;

import p9_3_with_callback.Measurer;

public class RectangleMeasurer implements Measurer<Rectangle>{
	public double measure(Rectangle aRect)
	{
		return 2*aRect.getHeight()+2*aRect.getWidth();
	}
}

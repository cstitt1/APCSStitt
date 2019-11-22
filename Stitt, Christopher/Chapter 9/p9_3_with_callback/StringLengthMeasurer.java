package p9_3_with_callback;

/**
   Objects of this class measure rectangles by area.
*/
public class StringLengthMeasurer implements Measurer<String>
{
   public double measure(String aString)
   {
	   return aString.length();
   }
}
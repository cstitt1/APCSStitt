package p9_01;

import java.util.Random;
import shared.Measurable;

/**
   This class models a die that, when cast, lands on a random
   face.
*/
public class Die implements Measurable
{
   /**
      Constructs a die with a given number of sides.
      @param s the number of sides, e.g. 6 for a normal die
   */
   public Die(int s)
   {
      sides = s;
      generator = new Random();
   }

   /**
      Simulates a throw of the die
      @return the face of the die 
   */
   public int cast()
   {
      roll = 1 + generator.nextInt(sides);
	  return roll;
   }
   
   public double getMeasure() {
	   return roll;
   }
   
   private Random generator;
   private int sides;
   private int roll;
}

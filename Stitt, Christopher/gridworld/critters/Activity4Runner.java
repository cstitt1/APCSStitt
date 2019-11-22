package critters;

import info.gridworld.actor.ActorWorld;
import java.awt.Color;
import info.gridworld.actor.*;
import info.gridworld.grid.*;

public class Activity4Runner {
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		
		world.add(new Location(2,2), new ChameleonCritter());
		world.add(new Location(3,5), new ChameleonKid());
		world.add(new Location(4,4), new RockHound());
		world.add(new Location(4,5), new Rock(Color.RED));
		world.add(new Location(4,2), new BlusterCritter(2));
		world.add(new Location(6,4), new QuickCrab());
		world.add(new Location(5,5), new KingCrab());
		
		world.show();
	}
}
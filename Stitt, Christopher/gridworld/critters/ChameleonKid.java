package critters;

import java.util.ArrayList;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

public class ChameleonKid extends ChameleonCritter{
	
	public void processActors(ArrayList<Actor> actors) {
		for (int i=0; i<actors.size(); i++) {
			if (this.getLocation().getDirectionToward(actors.get(i).getLocation()) == Location.NORTH ||
				this.getLocation().getDirectionToward(actors.get(i).getLocation()) == Location.SOUTH) {
				this.setColor(actors.get(i).getColor());
				return;
			}
		}
		
		super.processActors(new ArrayList<Actor>());
	}
}

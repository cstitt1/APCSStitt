package critters;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import java.util.ArrayList;

public class KingCrab extends CrabCritter{
	public void processActors(ArrayList<Actor> actors) {
		for (int i=0; i<actors.size(); i++) {
			Location old = new Location(actors.get(i).getLocation().getRow(),actors.get(i).getLocation().getCol());
			
			if (old.getRow() < this.getLocation().getRow())
				if (getGrid().isValid(new Location(old.getRow()-1, old.getCol()-1)) && getGrid().get(new Location(old.getRow()-1, old.getCol()-1)) == null)
					actors.get(i).moveTo(new Location(old.getRow()-1, old.getCol()-1));
			else
				if (getGrid().isValid(new Location(old.getRow()+1, old.getCol()+1)) && getGrid().get(new Location(old.getRow()+1, old.getCol()+1)) == null)
					actors.get(i).moveTo(new Location(old.getRow()+1, old.getCol()+1));
			
			if (actors.get(i).getLocation().equals(old))
				actors.get(i).removeSelfFromGrid();
		}
	}
}
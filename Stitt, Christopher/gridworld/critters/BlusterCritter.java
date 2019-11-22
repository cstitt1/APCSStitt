package critters;

import java.util.ArrayList;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

public class BlusterCritter extends Critter{
	private int courage;
	
	public BlusterCritter(int c) {
		super();
		courage = c;
	}
	
	public ArrayList<Actor> getActors() {
		int critterCount = 0;
		ArrayList<Actor> actors = new ArrayList<Actor>();
		int myRow = getLocation().getRow();
		int myCol = getLocation().getCol();
		
		for (int r = myRow-2; r < myRow+3; r++) {
			for (int c=myCol-2; c<myCol+3; c++) {
				if (getGrid().isValid(new Location(r, c)) && getGrid().get(new Location(r,c))!=null && !(new Location(r,c).equals(new Location(myRow, myCol)))) {
					actors.add(getGrid().get(new Location(r,c)));
					critterCount++;
				}
			}
		}
		
		if (critterCount >= courage)
			this.setColor(getColor().darker());
		else
			this.setColor(getColor().brighter());
		return actors;
	}
}
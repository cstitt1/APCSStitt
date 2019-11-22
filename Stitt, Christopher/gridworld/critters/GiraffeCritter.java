package critters;

import java.util.ArrayList;
import info.gridworld.actor.*;
import info.gridworld.grid.*;

public class GiraffeCritter extends Critter{
	private int stepsTaken = 0;
	private boolean stay = true;
	public static final int STOMACH_SIZE=1, NECK_SIZE=2, MAX_HUNGRY_STEPS=5;
	
	public ArrayList<Actor> getActors() {
		ArrayList<Actor> temp = new ArrayList<Actor>();
		
		for (int r = getLocation().getRow() - NECK_SIZE; r<=getLocation().getRow() + NECK_SIZE; r++) {
			for (int c=getLocation().getCol() - NECK_SIZE;c<=getLocation().getCol() + NECK_SIZE;c++) {
				if (getGrid().isValid(new Location(r,c)) && getGrid().get(new Location(r,c)) instanceof Flower)
					temp.add(getGrid().get(new Location(r,c)));
			}
		}
		
		return temp;
	}
	
	public void processActors(ArrayList<Actor> actors) {
		if (actors.size() < STOMACH_SIZE)
			stay = false;
		
		int i=0;
		while (actors.size() > 0 && i < STOMACH_SIZE) {
			int r = (int) (Math.random()*actors.size());
			actors.remove(r).removeSelfFromGrid();
			i++;
		}
	}
	
	public ArrayList<Location> getMoveLocations() {
		if (!stay)
			return super.getMoveLocations();
		else
			return new ArrayList<Location>();
	}
	
	public Location selectMoveLocation(ArrayList<Location> locs) {
		if (MAX_HUNGRY_STEPS <= stepsTaken)
			return null;
		else
			return super.selectMoveLocation(locs);
	}
	
	public void makeMove(Location loc) {
		if (loc != null && loc.equals(getLocation()))
			stepsTaken = 0;
		else
			stepsTaken++;
		stay=true;
		super.makeMove(loc);
	}
}

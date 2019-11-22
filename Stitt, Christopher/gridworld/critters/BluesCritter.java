package critters;

import java.awt.Color;
import java.util.ArrayList;
import info.gridworld.actor.*;
import info.gridworld.grid.*;

public class BluesCritter extends Critter{
	private ArrayList<Location> moves;
	private int r;
	
	public ArrayList<Actor> getActors() {
		moves = getGrid().getOccupiedAdjacentLocations(getLocation());
		ArrayList<Actor> rocks = new ArrayList<Actor>();
		
		for (int i=0; i<moves.size(); i+=0) {
			if (!(getGrid().get(moves.get(i)) instanceof Rock))
				moves.remove(i);
			else
				if (getGrid().get(moves.get(i)).getColor().equals(Color.BLUE)) {
					i++;
					rocks.add(getGrid().get(moves.get(i)));
				} else
					moves.remove(i);
		}
		
		r = (int) (Math.random() * moves.size());
		return rocks.get(r).getGrid().getNeighbors(getLocation());
	}
	
	public void processActors(ArrayList<Actor> actors) {
		for (int i=0; i<actors.size(); i++) {
			actors.get(i).removeSelfFromGrid();
		}
	}
	
	public ArrayList<Location> getMoveLocations() {
		return moves;
	}
	
	public Location selectMoveLocation(ArrayList<Location> locs) {
		int n = locs.size();
		if (n==0)
			return getLocation();
		return locs.get(r);
	}
}

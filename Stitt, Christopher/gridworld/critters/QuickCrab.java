package critters;

import info.gridworld.grid.Location;
import java.util.ArrayList;

public class QuickCrab extends CrabCritter{
	public ArrayList<Location> getMoveLocations() {
		ArrayList<Location> locs = new ArrayList<Location>();
		
		if (getGrid().isValid(getLocation().getAdjacentLocation(getDirection() + Location.LEFT)) && getGrid().get(getLocation().getAdjacentLocation(getDirection() + Location.LEFT)) == null)
			if (getGrid().isValid(getLocation().getAdjacentLocation(getDirection() + Location.LEFT).getAdjacentLocation(getDirection() + Location.LEFT)) && getGrid().get(getLocation().getAdjacentLocation(getDirection() + Location.LEFT).getAdjacentLocation(getDirection() + Location.LEFT)) == null)
				locs.add(getLocation().getAdjacentLocation(getDirection() + Location.LEFT).getAdjacentLocation(getDirection() + Location.LEFT));
			else
				locs.add(getLocation().getAdjacentLocation(getDirection() + Location.LEFT));
		
		if (getGrid().isValid(getLocation().getAdjacentLocation(getDirection() + Location.RIGHT)) && getGrid().get(getLocation().getAdjacentLocation(getDirection() + Location.RIGHT)) == null)
			if (getGrid().isValid(getLocation().getAdjacentLocation(getDirection() + Location.RIGHT).getAdjacentLocation(getDirection() + Location.RIGHT)) && getGrid().get(getLocation().getAdjacentLocation(getDirection() + Location.RIGHT).getAdjacentLocation(getDirection() + Location.RIGHT)) == null)
				locs.add(getLocation().getAdjacentLocation(getDirection() + Location.RIGHT).getAdjacentLocation(getDirection() + Location.RIGHT));
			else
				locs.add(getLocation().getAdjacentLocation(getDirection() + Location.RIGHT));
		
		return locs;
	}
}
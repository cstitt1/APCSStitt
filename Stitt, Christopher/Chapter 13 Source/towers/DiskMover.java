package towers;

public class DiskMover
{
	public static void main(String[] args)
	{
		move(4,1,3);
	}
	
	//Base is if there are no disks or there is no movement necessary
	//1 Disk(s): S--T
	//2 Disk(s): S--N (1 Disk(s) to N); S--T, N--T
	//3 Disk(s): S--T, S--N, T--N (2 Disk(s) to N); S--T, N--S, N--T, S--T
	//4 Disk(s): S--N, S--T, N--T, S--N, T--S, T--N, S--N (3 Disk(s) to N); S--T, N--T, N--S, T--S, N--T, S--N, S--T, N--T
    public static void move(int disks, int source, int target)
    {
        if (source==target || disks == 0) {
        	return;
        }
        
        if (disks==1) {
        	System.out.println("Move a disk from peg " + source + " to peg " + target + ".");
        	return;
        }
        
        int nonTarget = 6 - (source+target);
        
        move(disks-1, source, nonTarget);
        move(1, source, target);
        move(disks-1, nonTarget, target);
    }
}
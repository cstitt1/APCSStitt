package p7_13;

public class MagicSquare {
	int[][] nums;
	
	public MagicSquare(int n) {
		nums = new int[n][n];
		int x = n-1;
		int y = n/2;
		nums[x][y] = 1;
		for (int k=2; k<=Math.pow(n, 2); k++) {
			if (x==n-1) {
				if (y==n-1 || nums[0][y+1]!=0) {
					x-=1;
				} else {
					x = 0;
					y += 1;
				}
			} else {
				if (y==n-1) {
					if (nums[x+1][0]!=0) {
						x-=1;
					} else {
						x+=1;
						y=0;
					}
				} else {
					if (nums[x+1][y+1]!=0) {
						x-=1;
					} else {
						x+=1;
						y+=1;
					}
				}
			}
			nums[x][y] = k;
		}
	}
	
	public String toString() {
		String res = "";
		for (int x = 0; x < nums.length; x++) {
			for (int y=0; y<nums[x].length; y++) {
				res += nums[x][y];
				int len = Integer.toString(nums[x][y]).length();
				int max = (int) Math.pow(nums.length,2);
				int maxLen = Integer.toString(max).length();
				for (int i=maxLen; i>=len; i--) {
					res += " ";
				}
			}
			res += '\n';
		}
		return res;
	}
}

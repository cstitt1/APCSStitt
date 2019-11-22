package p4_14;

public class TimeInterval {
	private int timeDiff;
	
	public TimeInterval(int time1, int time2) {
		timeDiff = time2 - time1;
	}
	
	public String getHours() {
		if ((int) timeDiff/100==1) {
			return ((int) timeDiff/100+" hour");
		}
		return ((int) timeDiff/100+" hours");
	}
	
	public String getMinutes() {
		if ((int) timeDiff%100==1) {
			return ((int) timeDiff%100+" minute");
		}
		return ((int) timeDiff%100+" minutes");
	}
}

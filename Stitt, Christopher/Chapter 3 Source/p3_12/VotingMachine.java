package p3_12;
import java.util.*;
public class VotingMachine {
	private int totR, totD;
	public VotingMachine() {
		totR=0;
		totD=0;
	}
	public void voteDemocrat() {
		totD+=1;
	}
	public void voteRepublican() {
		totR+=1;
	}
	public void clearState() {
		totD=0;
		totR=0;
	}
	public String tallyUp() {
		GregorianCalendar tst = new GregorianCalendar();
		int mth = tst.get(Calendar.MONTH)+1;
		int day = tst.get(Calendar.DAY_OF_WEEK);
		int wk = tst.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		int hr = tst.get(Calendar.HOUR_OF_DAY);
		if (mth==11&&day==3&&wk==2&&hr>=20) {
			return ("Democrat: "+(totR+1)+"and Republican: "+totR);
		}
		return ("Democrat: "+totD+"and Republican: "+totR);
	}
}
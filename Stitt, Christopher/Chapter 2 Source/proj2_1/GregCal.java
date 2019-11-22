package proj2_1;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class GregCal {
	public static void main(String[] args) {
		//Base case:
		//GregorianCalendar base = new GregorianCalendar();
		//System.out.println(base); gives you this info:
		//YEAR=2016,MONTH=8,WEEK_OF_YEAR=37,WEEK_OF_MONTH=2
		//DAY_OF_MONTH=10,DAY_OF_YEAR=254,DAY_OF_WEEK=7
		//DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=11,HOUR_OF_DAY=11,MINUTE=57,SECOND=47,MILLISECOND=555
		
		//Task #1:
		GregorianCalendar dhfn = new GregorianCalendar();
		//System.out.println(dhfn);
		dhfn.add(Calendar.DAY_OF_YEAR, 100);
		String date = GregCal.getDate(dhfn);
		String day = GregCal.getDay(dhfn);
		System.out.println("The day 100 days from today is "+day + ", " + date);
		
		//Task #2:
		GregorianCalendar bdwd = new GregorianCalendar(2016, Calendar.OCTOBER, 1);
		String bday = GregCal.getDay(bdwd);
		System.out.println("The weekday of my birthday this year is "+bday);
		
		//Task #3:
		GregorianCalendar bdtk = new GregorianCalendar(1998, Calendar.OCTOBER, 1);
		bdtk.add(Calendar.DAY_OF_YEAR, 10000);
		String b10k = GregCal.getDate(bdtk);
		System.out.println("The date 10000 days from my birth is "+b10k);
	}
	
	public static String getDate(GregorianCalendar cal) {
		int mnth = cal.get(Calendar.MONTH)+1;
		int dy = cal.get(Calendar.DAY_OF_MONTH);
		int yr = cal.get(Calendar.YEAR);
		String date = mnth+"/"+dy+"/"+yr;
		return date;
	}
	
	public static String getDay(GregorianCalendar cal) {
		int dn = cal.get(Calendar.DAY_OF_WEEK);
		if (dn==1) {
			return "Sunday";
		} else if (dn==2) {
			return "Monday";
		} else if (dn==3) {
			return "Tuesday";
		} else if (dn==4) {
			return "Wednesday";
		} else if (dn==5) {
			return "Thursday";
		} else if (dn==6) {
			return "Friday";
		} else {
			return "Saturday";
		}
	}
}
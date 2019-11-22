package p4_18;

public class Easter {
	private String mth;
	private int dy;
	
	public Easter(int year) {
		int y = year;
		int a = y%19;
		int b = y/100;
		int c = y%100;
		int d = b/4;
		int e = b%4;
		int g = (8*b+13)/25;
		int h = (19*a+b-d-g+15)%30;
		int j = c/4;
		int k = c%4;
		int m = (a+11*h)/319;
		int r = (2*e+2*j-k-h+m+32)%7;
		int n = (h-m+r+90)/25;
		int p = (h-m+r+n+19)%32;
		dy=p;
		if (n==1) {
			mth="January";
		} else if (n==2) {
			mth="February";
		} else if (n==3) {
			mth="March";
		} else if (n==4) {
			mth="April";
		} else if (n==5) {
			mth="May";
		} else if (n==6) {
			mth="June";
		} else if (n==7) {
			mth="July";
		} else if (n==8) {
			mth="August";
		} else if (n==9) {
			mth="September";
		} else if (n==10) {
			mth="October";
		} else if (n==11) {
			mth="November";
		} else if (n==12) {
			mth="December";
		}
	}
	
	public String getEasterSundayMonth() {
		return mth;
	}
	
	public int getEasterSundayDay() {
		return dy;
	}
}

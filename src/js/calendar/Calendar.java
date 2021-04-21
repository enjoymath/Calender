package js.calendar;

public class Calendar {

	public static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static final int[] LEAP_MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int getMaxDaysofMonth(int year, int month) {
		
		if ((year % 4 == 0) && ((year % 100 != 100) || (year % 400 == 0))){
			return LEAP_MAX_DAYS[month - 1];
		}
		
		return MAX_DAYS[month - 1];
	}
	
	public boolean getLeapYear(int year) {
		if ((year % 4 == 0) && ((year % 100 != 100) || (year % 400 == 0))){
			return true;
		}
		
		return false;
	}
	
	
	public void printCalender(int year, int month) {
		
		System.out.printf("   <<%d년, %d월>>\n", year, month);
		System.out.println("----------------------");
		System.out.println(" SU MO TU WE TH FR SA ");
		System.out.println("----------------------");
		
		int totalday = 0;
		int setweek = 0;
		for (int i = 1970; i < year; i++) {     // 1970년 1월 1일은 목요일입니다.
			if (getLeapYear(i)) {
				totalday = totalday + 366;
			} else {
				totalday = totalday + 365;
			}
		}
		
		for (int i = 1; i < month; i++) {
			totalday = totalday + getMaxDaysofMonth(year, i);
		}
		
		setweek = (totalday+4) % 7 + 1;

		for (int j=0;j < setweek-1; j++) {
			System.out.print("   ");
		}
		for (int i = 1; i <= getMaxDaysofMonth(year, month); i++) {
			
			System.out.printf(" %2d", i);
			if ((i + setweek-1) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}
	
		
}

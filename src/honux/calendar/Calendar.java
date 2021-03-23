package honux.calendar;

public class Calendar {
	
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private static final int[] LEAP_MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public boolean isLeapYear(int year) {
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getMaxDaysOfMonth(int year, int month) {
		if(isLeapYear(year)) {
			return LEAP_MAX_DAYS[month - 1];
		} else {
			return MAX_DAYS[month - 1];
		}
	}
	
	public int getDaysOfLeapYear(int year) {
		int days = 0;
		for(int i = 1583; i < year; i++) {
			if(isLeapYear(i)) {
				days++;
			}
		}
		return days;
	}
	
	public int getFisrtWeekdayOfYear(int year) {
		return (year-1583-1+getDaysOfLeapYear(year)) % 7;
	}
	
	public int getFirstWeekdayOfMonth(int firstWeekday, boolean leapYear, int month) {
		int totalDays = 0;
		int[] maxDaysOfMonth = new int[12];
		
		if(leapYear) {
			maxDaysOfMonth = LEAP_MAX_DAYS;
		} else {
			maxDaysOfMonth = MAX_DAYS;
		}
		
		for(int i = 0; i < month - 1; i++) {
			totalDays += maxDaysOfMonth[i];
		}
		
		return (totalDays + firstWeekday) % 7;
	}
	
	public void printCalendar(int year, int month) {
		
		boolean leapYear = isLeapYear(year);
		int maxDay = getMaxDaysOfMonth(year, month);
		int firstWeekdayOfYear = getFisrtWeekdayOfYear(year);
		int weekday = getFirstWeekdayOfMonth(firstWeekdayOfYear, leapYear, month);
		
		System.out.printf("    <<%d년 %d월>>\n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");
		
		//print empty space
		for(int i = 0; i < weekday; i++) {
			System.out.print("   ");
		}
		
		//print calendar
		for(int i = 1; i < maxDay+1; i++){
			System.out.printf("%3d", i);
			if((i + weekday) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}
}
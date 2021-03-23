package honux.calendar;

import java.util.Scanner;

public class Calendar {
	
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}
	
	public void printSampleCalendar() {
		System.out.println(" 일 월 화 수 목 금 토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");		
		System.out.println("22 23 24 25 26 27 28");
	}

	public static void main(String[] args) {
		Calendar cal = new Calendar();
		Scanner sc = new Scanner(System.in);
		String PROMPT = "cal>";
		
		int month = 0;
		
		while(true) {
			System.out.println("월을 입력해 주세요.");
			System.out.print(PROMPT);
			month = sc.nextInt();
			
			if(month == -1) {
				sc.close();
				break;
			} else if(month > 12 || month <= 0) {
				System.out.println("1월부터 12월 사이를 입력하세요");
				continue;
			}
			
			System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.getMaxDaysOfMonth(month));
		}
		System.out.println("시스템이 종료됐습니다.");
	}

}
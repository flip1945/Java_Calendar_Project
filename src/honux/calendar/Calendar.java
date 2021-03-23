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
		
		//cal.printSampleCalendar();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("반복횟수를 입력하세요.");
		
		int roop = sc.nextInt();
		int[] months = new int[roop];
		
		System.out.println("\n월을 입력해 주세요.");
		
		for(int i = 0; i < roop; i++) {
			int month = sc.nextInt();
			months[i] = month;
			
		}
		sc.close();
		
		for(int j = 0; j < roop; j++) {
			System.out.printf("%d월은 %d일까지 있습니다.\n", months[j], cal.getMaxDaysOfMonth(months[j]));
		}
	}

}
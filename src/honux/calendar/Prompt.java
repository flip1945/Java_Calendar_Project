package honux.calendar;

import java.util.Scanner;

public class Prompt {
	
	public int parseDays(String week) {
		if(week.equals("su")) {
			return 0;
		} else if(week.equals("mo")) {
			return 1;
		} else if(week.equals("tu")) {
			return 2;
		} else if(week.equals("we")) {
			return 3;
		} else if(week.equals("th")) {
			return 4;
		} else if(week.equals("fr")) {
			return 5;
		} else if(week.equals("sa")) {
			return 6;
		} else {
			return 0;
		}
	}

	public void runPrompt() {
		Calendar cal = new Calendar();
		Scanner sc = new Scanner(System.in);

		int month = 0;
		int year = 0;
		int weekday = 0;
		String strWeekDay = "";

		while (true) {
			System.out.println("년도를 입력해 주세요.");
			System.out.print("YEAR> ");
			year = sc.nextInt();
			
			if(year == -1) {
				break;
			}
			System.out.println("월을 입력해 주세요.");
			System.out.print("MONTH> ");
			month = sc.nextInt();

			if (month == -1) {
				break;
			} else if (month > 12 || month <= 0) {
				System.out.println("1월부터 12월 사이를 입력하세요");
				continue;
			}
			
			System.out.println("첫째 날의 요일을 입력해 주세요.(su, mo, tu, we, th, fr, sa)");
			System.out.print("WEEKDAY> ");
			strWeekDay = sc.next();
			weekday = parseDays(strWeekDay);
			
			cal.printCalendar(year, month, weekday);
		}
		System.out.println("시스템이 종료됐습니다.");
		sc.close();
	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}
}

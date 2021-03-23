package honux.calendar;

import java.util.Scanner;

public class Prompt {

	public static void main(String[] args) {
		Calendar cal = new Calendar();
		Scanner sc = new Scanner(System.in);
		
		int month = 0;
		int year = 0;
		
		while(true) {
			System.out.println("년도를 입력해 주세요.");
			System.out.print("YEAR> ");
			year = sc.nextInt();
			System.out.println("월을 입력해 주세요.");
			System.out.print("MONTH> ");
			month = sc.nextInt();
			
			if(month == -1) {
				sc.close();
				break;
			} else if(month > 12 || month <= 0) {
				System.out.println("1월부터 12월 사이를 입력하세요");
				continue;
			}
			
			cal.printCalendar(year, month);
		}
		System.out.println("시스템이 종료됐습니다.");
	}

}

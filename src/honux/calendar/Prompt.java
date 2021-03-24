package honux.calendar;

import java.util.Scanner;

public class Prompt {

	public void runPrompt() {		
		printMenu();
		
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		while(true) {
			System.out.println("명령 (1, 2, 3, h, q)");
			System.out.print("> ");
			String cmd = sc.next();
			if(cmd.equals("1")) {
				cmdRegister(sc, cal);
			} else if(cmd.equals("2")) {
				cmdSearch(sc, cal);
			} else if(cmd.equals("3")) {
				cmdCal(sc, cal);
			} else if(cmd.equals("h")) {
				printMenu();
			} else if(cmd.equals("q")) {
				break;
			}
		}
		sc.close();
		System.out.println("시스템이 종료됐습니다.");
	}

	public void printMenu() {
		System.out.println("+----------------------+");
		System.out.println("| 1. 일정 등록");
		System.out.println("| 2. 일정 검색");
		System.out.println("| 3. 달력 보기");
		System.out.println("| h. 도움말 q. 종료");
		System.out.println("+----------------------+");
	}
	
	public void cmdCal(Scanner sc, Calendar cal) {
		int month = 0;
		int year = 0;
		
		System.out.println("년도를 입력해 주세요.");
		System.out.print("YEAR> ");
		year = sc.nextInt();

		System.out.println("월을 입력해 주세요.");
		System.out.print("MONTH> ");
		month = sc.nextInt();
		
		if (month > 12 || month <= 0) {
			System.out.println("1월부터 12월 사이를 입력하세요");
		} else {
			cal.printCalendar(year, month);			
		}
	}
	
	public void cmdRegister(Scanner sc, Calendar cal) {
		System.out.println("[일정 등록] 날짜를 입력하세요.");
		System.out.print("> ");
		String date = sc.next();
		sc.nextLine();
		System.out.println("일정을 입력하세요.");
		System.out.print("> ");
		String plan = sc.nextLine();
		
		cal.registerPlan(date, plan);
	}
	
	public void cmdSearch(Scanner sc, Calendar cal) {
		System.out.println("[일정 검색] 날짜를 입력하세요.");
		System.out.print("> ");
		String date = sc.next();
		String plan;
		
		plan = cal.searchPlan(date);
		
		System.out.println(plan);
	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}
}

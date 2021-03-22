package honux.calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 수를 입력하세요.");
		String numbers = scanner.nextLine();
		String[] splitNumber = numbers.split(" ");
		
		scanner.close();
		
		int firstNumber = Integer.parseInt(splitNumber[0]);
		int secondNumber = Integer.parseInt(splitNumber[1]);
		
		System.out.printf("%d와 %d의 합은 %d입니다.", firstNumber, secondNumber, firstNumber + secondNumber);
	}
}

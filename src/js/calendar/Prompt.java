package js.calendar;

import java.util.Scanner;

public class Prompt {
	
	public void runPrompt() {
		
		Calendar cal = new Calendar();
		Scanner scanner = new Scanner(System.in);
		int month = 1;
		int year = 2020;

		while (true) {
			
			System.out.println("년을 입력하세요");
			System.out.print("YEAR> ");
			year = scanner.nextInt();

			System.out.println("월을 입력하세요");
			System.out.print("MONTH> ");
			month = scanner.nextInt();
			
			if (month == -1 || year == -1) {
				break;
			} else if (month > 12) {
				continue;
			}
			
			cal.printCalender(year, month);			
		}
		
		System.out.println("Bye~~");
		scanner.close();
		
	}
	
	public static void main(String[] args) {
		
		Prompt p = new Prompt();
		p.runPrompt();
			
	}

}

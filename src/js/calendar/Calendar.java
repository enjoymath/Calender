package js.calendar;

import java.util.Scanner;

public class Calendar {

	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	private int getMaxDaysofMonth(int month) {
		
		return MAX_DAYS[month - 1 ];
	}
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		String prompt = "cal> ";
		Calendar cal = new Calendar();
		int month = 1;
		
		while (true) {
			System.out.println("월을 입력하세요");
			System.out.print(prompt);
			month = scanner.nextInt();
			
			if (month == -1) {
				break;
			} else if (month > 12) {
				continue;
			}
		
			System.out.printf("%d월의 최대 일수는 %d입니다.", month, cal.getMaxDaysofMonth(month));
		}

		System.out.println("Bye~~");
		
		scanner.close();
		
		
		
	}

}

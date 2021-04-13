package js.calendar;

import java.util.Scanner;

public class Calendar {

	private static final int[] MAX_DAYS = {32, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	private int getMaxDaysofMonth(int month) {
		
		return MAX_DAYS[month - 1 ];
	}
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		
		int month = scanner.nextInt();
		
		Calendar cal = new Calendar();
		
		System.out.printf("%d월의 최대 일수는 %d입니다.", month, cal.getMaxDaysofMonth(month));
		
		scanner.close();
		
		
		
	}

}

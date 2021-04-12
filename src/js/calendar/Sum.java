package js.calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		
		// 두 수의 합을 구하는 프로그램을 작성하여 보자
		int a, b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 수를 입력하세요");
		String str1 = scanner.next();
		String srt2 = scanner.next();
		
		a = Integer.parseInt(str1);
		b = Integer.parseInt(srt2);
		
		System.out.printf("두 수 %d 와 %d의 합은 %d 입니다.", a, b, a+b);
		scanner.close();
		
		

	}

}

package js.calendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Prompt {
	
	HashMap<Date, String> calMap = new HashMap<Date, String>();
	
	DateFormat calFormat = new SimpleDateFormat("yyyy-mm-dd");
	Date calDate = new Date();
	
	public void runMenu() {
		
		System.out.println("+------------------+");
		System.out.println("| 1. 일정 등록        ");
		System.out.println("| 2. 일정 검색        ");
		System.out.println("| 3. 달력 보기        ");
		System.out.println("| h. 도움말          ");
		System.out.println("| q. 종료           ");
		System.out.println("+-----------------+");
		System.out.print("명령 : 1, 2, 3, h, q  >>");
	}
	
	
	public void runPrompt() {
		
		Scanner scanner = new Scanner(System.in);

		while (true) {
			
			runMenu();
			String cmd = scanner.next();
			
			if (cmd.equals("1")) inputCalendar(scanner);
			else if (cmd.equals("2")) viewCalendar(scanner);
			else if (cmd.equals("3")) calendarPrint(scanner);
			else if (cmd.equals("h")) helpCalendar();
			else if (cmd.equals("q")) break;
			
		}
		
		System.out.println("Good bye ~~");
		scanner.close();
	}
	


	private void inputCalendar(Scanner scanner) {
		
		String calMemo = "";
		
		System.out.println("날짜를 입력하시오<yyyy-mm-dd>");
		System.out.print("DATE>");
		String str = scanner.next();
		try {
			calDate = calFormat.parse(str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("메모를 입력하시오");
		System.out.print("MEMO> ");
		
		while (true) {
			String str2 = scanner.next();	
			calMemo += str2+" ";
			if (str2.endsWith(";")) break;
		}
		
		calMap.put(calDate, calMemo);
		System.out.println(calMap);
	}


	private void helpCalendar() {
	
		runMenu();
		
	}


	private void viewCalendar(Scanner scanner) {

		System.out.println("날짜를 입력하시오<yyyy-mm-dd>");
		System.out.print("DATE>");
		String str = scanner.next();
		try {
			calDate = calFormat.parse(str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(calMap.get(calDate));
	}


	public void calendarPrint(Scanner scanner) {
		Calendar cal = new Calendar();
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
		

	}
	
	public static void main(String[] args) {
		
		Prompt p = new Prompt();
		p.runPrompt();
			
	}

}

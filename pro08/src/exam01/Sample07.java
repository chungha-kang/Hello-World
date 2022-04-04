package exam01;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Sample07 {
	
	Scanner sc = new Scanner(System.in);

	public void ex01() {
		/*
		 * 사용자 입력으로 년/월/일 형식의 날짜를 입력 받아
		 * 날짜 배열에 저장하기 위한 코드를 작성한다.
		 * (입력 형식은 반드시 년/월/일 형식이여야 하며, 형식이 다른 경우
		 * 다시 입력하도록 한다.)
		 */
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		String input = "";
		Date[] dates = new Date[0];
		
		while(true) {
			System.out.print("년/월/일 형식의 날짜 입력(e를 입력하면 종료) : ");
			input = sc.nextLine();
			if(input.matches("\\d{4}/\\d{1,2}/\\d{1,2}")) {
				try {
					dates = Arrays.copyOf(dates, dates.length + 1);
					dates[dates.length - 1] = format.parse(input);
				} catch (ParseException e) {
					e.printStackTrace();
				} 
			} else if(input.equals("e")) {
				break;
			}
		}

		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c1.setTime(dates[0]);
		
		System.out.println(c1.getTime());
		System.out.println(c2.getTime());
		
		int year = c1.get(Calendar.YEAR) - c2.get(Calendar.YEAR);
		int month = c1.get(Calendar.MONTH) - c2.get(Calendar.MONTH);
		int date = c1.get(Calendar.DATE) - c2.get(Calendar.DATE);

		int totalDate = 
		
	}
		
	public void ex02() {
		/*
		 * 사용자 입력으로 년/월/일 형식의 날짜를 입력 받은 후
		 * 입력 받은 날짜가 현재 날짜로 부터 얼만큼의 일자인지
		 * 그 차를 구하는 코드를 작성한다.
		 * (과거의 날짜는 D-Day -10일, 미래의 날짜는 D-Day 10일)
		 */
		
	}
		
		
	public void ex03() {
		/*
		 * 프로그램이 동작한 후 부터 종료할 때까지의 시간 기록을 남기기
		 * 위한 코드를 작성해 본다.
		 * 동작 시킬 프로그램은 1 ~ 100,000 까지의 누적합을 구하는 코드로
		 * 해당 반복이 얼만큼의 시간이 걸리는지 기록을 출력한다.
		 */
		Date start = new Date();	// 프로그램 시작전에 시간 측정
		long tot = 0;
		for(long i = 1; i <= 10000000000L; i++) {
			tot += i;
		}
		Date end = new Date();	// 프로그램 종료 후 시간 측정
		
		long timer = end.getTime() - start.getTime();
		System.out.println("걸린 시간 : " + timer / 1000.0 + " 초");

	}

	public static void main(String[] args) {
		Sample07 sample = new Sample07();
		sample.ex03();
		// sample.ex02();
		// sample.ex03();
	}	
}

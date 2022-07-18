package chap05;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
				switch(week) {
				case 1 :
					today = chap05.week.SUNDAY; break;
				case 2 :
					today = chap05.week.MONDAY; break;
				case 3 :
					today = chap05.week.TUESDAY; break;
				case 4 :
					today = chap05.week.WEDNESDAY; break;
				case 5 :
					today = chap05.week.THURSDAY; break;
				case 6 :
					today = chap05.week.FRIDAY; break;
				case 7 :
					today = chap05.week.SATURDAY; break;
				
				}
				System.out.println("오늘 요일 : "+ today);
	
	if(today == Week.SUNDAY) {
		System.out.println("일요일에는 축구를 합니다.");
} else {
	System.out.println(" 열심히 자바 공부합니다.");
		}
	}
}

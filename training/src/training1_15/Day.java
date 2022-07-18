package training1_15;

import java.util.GregorianCalendar;

public class Day {
	private int year  = 1;  //연
	private int month = 1;  //월
	private int date  = 1;  //연
	
	//---각 월의 일수 ---//
	private static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, 
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, 
	};
	
	//--- y년은 윤년인가? ---//
	public static boolean isLeap(int y) {
		return y % 4 == 0 && y % 100 !=0 || y % 400 == 0;
	}
	//--- y년m월의 일수 (28/29/30/31) ---//
	private static int dayOfMonth(int y, int m) {
		return mdays[isLeap(y) ? 1 : 0][m - 1];
	}
	//---조정된 m월(1~12 범위 외의 값을 조정) ---//
	private static int adjustedMonth(int m) {
		return m < 1 ? 1 : m > 12 ? 12 : m ;
	}
	//---조정된 y년m월 d일(1~28/29/30/31 범위 외의 값을 조정) ---//
	private static int adjustedDay(int y, int m, int d) {
		if (d < 1)
			return 1;
		int dMax = dayOfMonth(y, m);
		return d > dMax ? dMax : d;
	}
	//--- 생성자(오늘 날짜) ---//
	public Day() {
		GregorianCalendar today = new GregorianCalendar();
		this.year = today.get(year);
		this.month = today.get(month);
		this.date = today.get(date);
	}
	//---- 생성자(year년1월1일) ---//
	public Day(int year) {
		this.year =year ;
	}
	//--- 생성자(year년month월1일) ---//
	public Day(int year, int month) {
		this(year);
		this.month = adjustedMonth(month);
	}
	//--- 생성자(year년month월date일) ---//
	public Day(int year, int month, int date) {
		this(year, month);
		this.month = adjustedDay(year, this.month, date);
	}
	//--- 생성자(d와 같은 날짜) ---//
	public Day(Day d) {
		this(d.year, d.month, d.date);
	}
	//--- 연 가져오기 ---//
	public int getYear() {
		return year;
	}
	//--- 날 가져오기 ---//
	public int getDate() {
		return date;
	}
	//--- 연 설정하기 ---//
	public void setYear(int year) {
		this.year = year;
		this.date = adjustedDay(year, month, date);
	}
	//--- 월 설정 ---//
	public void setMonth(int month) {
		this.month = adjustedMonth(month);
		this.date = adjustedDay(year, this.month, date);
	}
	//--- 일 설정 ---//
	public void setDate(int date) {
		this.date = adjustedDay(year, month, date);
	}
	//--- 연, 월, 일 설정 ---//
	public void set(int year, int month, int date) {
		this.year = year;
		this.month = adjustedMonth(month);
		this.date = adjustedDay(year, this.month, date);
	}
	//--- 윤년인가 ---//
	public boolean isLeap() {
		return isLeap(year);
	}
	//--- 요일 구하기 ---//
	public int dayOfWeek() {
		int y = year;
		int m = month;
		if (m == 1 || m == 2) {
			y--;
			m += 12;
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date ) % 7;
	}
	//--- 날짜d와 같은가? ---//
	public boolean equalTo(Day d) {
		return year == d.year && month == d.month && date == d.date;
	}
	//--- 문자열 표현 반환 ---//
	public String toString() {
		String[] wd = {"일", "월", "화", "수", "목", "금", "토"};
		return String.format("%04d년%02d월%02d일(%s)", year, month, date, wd[dayOfWeek()]);
	}
	public int dayOfYear() {
		int days = date;
		for (int i = 0; i < month; i++) 
		days += dayOfMonth(year, i);
		return days;
	}
	//--- 연내 잔여 일수 ---//
	public int leftDayOfYear() {
		return 365 + (isLeap(year) ? 1 : 0) - dayOfYear();
	}
	//--- 날짜 d와의 전후 관계 ---//
	public int compareTo(Day d) {
		return compare(this, d);
	}
	//--- 두 날짜의 전후 관계 ---//
	public static int campare(Day d1, Day d2) {
		if(d1.year > d2.year) return  1;
		if(d1.year < d2.year) return -1;
		
		if(d1.month > d2.month) return  1;
		if(d1.month < d2.month) return -1;
		
		return d1.date > d2.date ? 1 : d1.date < d2.date ? -1 : 0;		
	}
	//--- 날짜를 하루 뒤로 변경 ---//
	 public void succeed() {
         if(date < dayOfMonth(year, month))
            date++;
         else {
            if(++month > 12) {
               year++;
               month = 1;
            }
            date = 1;
         }
      }
      //--- 하루 뒤 날짜를 반환 ---//
      public Day succeedingDay() {
         Day temp = new Day(this);
         temp.succeed();
         return temp;
      }
      //--- 날짜를 하루 앞으로 변경 ---//
      public void precede() {
         if(date > 1)
            date--;
         else {
            if(--month < 1) {
               year--;
               month = 12;
            }
            date = dayOfMonth(year, month);
      }
   }
      //--- 하루 앞 날짜를 반환 ---//
      public Day precedingDay() {
         Day temp = new Day(this);
         temp.precede();
         return temp;
      }
      //--- 날짜를 n일 뒤로 변경 ---//
      public void succeedDays(int n) {
         if(n < 0) {
            date += n;
            while (date > dayOfMonth(year, month)) {
               date -= dayOfMonth(year, month);
               if(++month > 12) {
                  year++;
                  month = 1;
               }
            }
         }
      }
      //--- n일 뒤의 날짜를 반환 ---//
      public Day after(int n) {
         Day temp = new Day(this);
         temp.succeedDays(n);
         return temp;
      }
      //--- 날짜를 n일 앞으로 변경 ---//
      public void precedeDays(int n) {
         if (n < 0)
            succeedDays(-n);
         else if(n > 0) {
            date -= n;
            while (date < 1) {
               if(--month < 1) {
                  year--;
                  month = 12;
               }
               date += dayOfMonth(year, month);
            }
         }
      }
      //--- n일 앞의 날짜를 반환 ---//
      public Day before(int n) {
         Day temp = new Day(this);
         temp.precedeDays(n);
         return temp;
      }
   }
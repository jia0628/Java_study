import java.util.Scanner;

class Day {
	// 인스턴스 변수
	private int year;
	private int month;
	private int date;
	
	// 생성자
	public Day(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	// 생성자 오버로딩
	//★ 복사 생성자
	public Day(Day d) {  //● 임의의 매개변수 d
		this.year = d.year;
		this.month = d.month;
		this.date = d.date;
	}
	
	// getter
	public int getYear() {
		return this.year;
	}
	public int getMonth() {
		return this.month;
	}
	public int getdate() {
		return this.date;
	}
	
	// setter
	public void setYear(int year) {
		this.year = year;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setDate(int date) {
		this.date = date;
	}
	
	// 날짜 설정 메서드(한번에 쓰기)
	//● 생성자는 마음대로 호출할 수없으니 대신 호출할 메서드 생성
	public void set(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	// 요일 계산 메서드
	// 제라의 공식: 0~6 사이의 정수로 리턴
	// 0: 일, 1: 월, 2: 화, 3: 수, 4: 목, 5: 금, 6: 토
	public int dayOfWeek() { //● 요일은 배열이라 숫자로 나옴, 그래서 int
		int y = year;
		int m = month;
		int d = date;
		
		//● 크게 알아둘 필요 없는 부분
		if(m==1 || m==2) {
			y--;
			m += 12;
		}
		return (y + y/4 - y/100 + y/400 + (13*m+8)/5 + d) % 7;
	}
	
	// 날짜 비교 메서드
	//● public 리턴타입 메서드명(매개변수) {
	public boolean equalDay(Day d) { //● 임의의 매개변수 d(위의 d랑 다름)
		return this.year==d.year && this.month==d.month && this.date==d.date; //● 멤버변수와 d.year=>day2의 year비교
	}
	
	
	
}

//★ 핵심 주제) 두 개의 날짜 인스턴스를 생성하여 비교
public class DayTest03 {
	
	/*
	//● 메서드 하나 생성 -> true, false로 판별하기 위해 리턴타입은 boolean
	static boolean compareDay(Day d1, Day d2) {
		return d1.getYear()==d2.getYear() && d1.getMonth()==d2.getMonth() && d1.getdate()==d2.getdate();
	}
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y, m, d;
		
		// 두 개의 인스턴스 생성
		System.out.println("♣ 날짜 1을 입력하시오.");
		System.out.print("년 입력: ");
		y = sc.nextInt();
		System.out.print("월 입력: ");
		m = sc.nextInt();
		System.out.print("일 입력: ");
		d = sc.nextInt();
		Day day1 = new Day(y, m, d);
		
		System.out.println("♣ 날짜 2을 입력하시오.");
		System.out.print("년 입력: ");
		y = sc.nextInt();
		System.out.print("월 입력: ");
		m = sc.nextInt();
		System.out.print("일 입력: ");
		d = sc.nextInt();
		Day day2 = new Day(y, m, d);
		
		// 방법 1번 -> 잘못된 방법
		// 참조를 비교하고 있고, 두 날짜는 인스턴스를 각각 생성하므로 항상 다른 참조가 된다.
		//● 클래스에서 == 은 참조가 같은지를 비교한다.(그 전까지는 값을 비교해왔다)
		/*
		if(day1 == day2) {
			System.out.println("두 날짜는 같습니다.");
		} else {
			System.out.println("두 날짜는 다릅니다.");
		}
		*/
		
		// 방법 2번 -> 옳은 방법
		// 단점: 비교식이 너무 길어짐.
		//● day1과 day2의 년, 월, 일을 각각 떼어내어 비교
		/*
		if(day1.getYear() == day2.getYear() &&
				day1.getMonth() == day2.getMonth() && day1.getdate() == day2.getdate()) {
			System.out.println("두 날짜는 같습니다.");
		} else {
			System.out.println("두 날짜는 다릅니다.");
		}
		*/
		
		// 방법 3번 -> 옳은 방법
		// 해결: 메서드를 사용하여 비교식이 길어지는 문제도 해결
		// 단점: 날짜를 비교할때마다, 날짜 비교 메서드를 만들어 사용해야 한다.
		// 단점: 날짜를 비교하는 기능을 날짜 클래스 안에 소속되어 있어야 한다.
		//● 메서드 호출
		/*
		if(compareDay(day1, day2)) {
			System.out.println("두 날짜는 같습니다.");
		} else {
			System.out.println("두 날짜는 다릅니다.");
		}
		*/
		
		// 방법 4번 -> 최종 방법
		//● 메서드를 호출하면서 day2를 매개변수로 던짐
		if(day1.equalDay(day2)) { //● equalDay(Day d) day2의 매개변수 Day d
			System.out.println("두 날짜는 같습니다.");
		} else {
			System.out.println("두 날짜는 다릅니다.");
		}
		
		
		sc.close();
	}
}

import java.util.Calendar;

//● 한 파일에서 public 클래스는 단 1개밖에 쓸수 없다 -> 그게 main으로 쓰임.
//● 때문에 나머지 클래스는 public을 붙일 수 없다.
class DateId {
	private static long count = 0;   // 클래스 변수
	private long id;                 // 인스턴스 변수
	
	//● 맨 처음에 딱 한번만 초기화 시킨다 -> 클래스 초기자
	//● 매 생성자마다 다 들어가야 한다 -> 인스턴스 초기자
	
	// 클래스 초기자, 클래스 블럭, static 초기자(정적 초기자), static 블럭(정적 블럭)
	static {
		Calendar c = Calendar.getInstance();
		long year = c.get(Calendar.YEAR);
		long month = c.get(Calendar.MONTH) + 1;  //● 달은 0~11까지 배열로 만들어져서 +1을 해야함.
		long date = c.get(Calendar.DATE);
		
		count = year*10000000 + month*100000 + date*1000;
		
		System.out.printf("오늘은 %4d년 %2d월 %2d일 입니다.\n", year, month, date);
	}

	// 생성자
	public DateId() {
		id = ++count;
	}
	
	// getter
	public static long getCount() {
		return count;
	}
	public long getId() {
		return id;
	}
	
}

public class DateIdTest01 {
	public static void main(String[] args) {
		DateId a = new DateId();
		DateId b = new DateId();
		DateId c = new DateId();
		
		System.out.println("a's Id = " + a.getId());
		System.out.println("b's Id = " + b.getId());
		System.out.println("c's Id = " + c.getId());
	}
}

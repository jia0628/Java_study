import java.text.SimpleDateFormat;
import java.util.Date;
/*
	 SimpleDateFormat: 날짜를 원하는 포맷으로 만들어 사용하도록 하는 클래스
	 	-> Date 클래스의 인스턴스를 사용함, Calendar 클래스인 경우에는 Date로 변경하여 사용함.
	 	
 		< 포맷 형식 >
		 yyyy: 년도 4자리, yy: 년도 2자리
		 MM: 월 2자리, M: 월 1자리
		 dd: 일 2자리, d: 일 1자리
		 HH: 24시간, hh: 12시간
		 mm: 분 2자리, m: 분 1자리
		 ss: 초 2자리, s: 초 1자리, sss: 밀리 세컨드
		 a: 오전 또는 오후
		 E: 한글 1글자 요일
		 
*/

public class SimpleDateFormatTest01 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date d = new Date(126, 1, 6, 17, 35, 40);  // 2026, 2, 6, 17, 35, 40
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy-MM-dd");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");      //● HH -> 24시간제, hh -> 12시간제
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy/MM/dd a hh:mm:ss");    //● a -> 오전, 오후 표시
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy/MM/dd E요일  hh:mm:ss");  //● E -> 요일
		
		System.out.println(sdf1.format(d));
		System.out.println(sdf2.format(d));
		System.out.println(sdf3.format(d));
		System.out.println(sdf4.format(d));
		System.out.println(sdf5.format(d));
		
	}
}

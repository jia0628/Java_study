import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest01 {
	public static void main(String[] args) {
		// 파일 입력 1번
		// 단점: 예외처리 구문이 복잡함
		/*
		FileInputStream fis = null;  //● 선언은 밖에 생성은 안에 (선언까지 안에 다 하면 밖에서 접근을 할 수가 없어짐)
	
		try {
			fis = new FileInputStream("c:/html240522/temp/test01.txt");
			int data = 0;
			while((data = fis.read()) != -1) {  // -1 : EOF(End Of File), 파일의 끝
				char c = (char)data;
				System.out.print(c);
//				System.out.print(data);  // 아스키 코드로 출력
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();  //● Scanner처럼 마지막에 꼭 닫아줘야함 -> 안그럼 메모리가 샌다
			} catch(IOException e) {
				e.printStackTrace();
			}	
		}
		*/
		
		// 파일 입력 2번
		// 장점: finally문 제거하여 코드가 비교적 간결해짐. finally가 가지는 상징성은 없어짐.
		/*
		FileInputStream fis = null;  
		
		try {
			fis = new FileInputStream("c:/html240522/temp/test01.txt");
			int data = 0;
			while((data = fis.read()) != -1) {  // -1 : EOF(End Of File), 파일의 끝
				char c = (char)data;
				System.out.print(c);
//				System.out.print(data);  // 아스키 코드로 출력
			}
			fis.close();  
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		*/
		
		// 파일 입력 3번 (★ 추천) 
		// try-with-resource 방법
		// - 자동으로 리소스를 닫아줌.
		// - finally 블럭을 사용하여 리소스를 확실히 닫는 것과 같은 효과를 줌.
		// - 자바 1.7버전부터 도입
		try(FileInputStream fis = new FileInputStream("c:/html240522/temp/test01.txt")) {
			int data = 0;
			while((data = fis.read()) != -1) {  // -1 : EOF(End Of File), 파일의 끝
				char c = (char)data;
				System.out.print(c);
//				System.out.print(data);  // 아스키 코드로 출력
			} 
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} 
		
		
	}
}

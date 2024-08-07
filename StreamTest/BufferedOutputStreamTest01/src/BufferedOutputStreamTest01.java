import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest01 {
	public static void main(String[] args) {
		// 1번 방법: try-catch-finally
		
		// 파일 입출력 스트림
		FileInputStream fis = null;
		FileOutputStream fos = null;
		// 보토 파일 입출력 스트림
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream("c:/html240522/temp/jdk.exe");    //● 일반적으론 \이지만 자바만 /
			fos = new FileOutputStream("c:/html240522/temp/jdk_copy.exe");
			
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			int data = 0;
			System.out.println("복사 시간을 측정합니다.");
			System.out.println("--------------------");
			long startTime = System.currentTimeMillis();
			while((data = bis.read()) != -1) {   // -1: EOF(End Of File)
				bos.write(data);
			}
			long endTime = System.currentTimeMillis();
			System.out.println("--------------------");
			System.out.println("복사 시간이 끝났습니다.");
			System.out.printf("복사시간: %d초", (endTime-startTime)/1000);
		} catch(FileNotFoundException e) {         //● IOException는 FileNotFoundException의 부모
			System.err.println(e.getMessage());    // catch 블럭에 FileNotFoundException부터 둘다 쓰거나
 		} catch(IOException e) {                   // 아니면 IOException 하나만 써도 된다.
			System.err.println(e.getMessage());
		} finally {
			try {
				// 보조 스트림을 닫으면 파일 입출력 스트림도 함께 닫힌다
				bis.close();
				bos.close();
			} catch(IOException e) {
				System.err.println(e.getMessage());
			}
		}
		
		
		
	}
}
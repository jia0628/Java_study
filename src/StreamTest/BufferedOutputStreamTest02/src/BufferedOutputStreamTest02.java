import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest02 {
	public static void main(String[] args) {
		// 2번 방법: try-catch 블럭만 사용
		
		// 보토 파일 입출력 스트림
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			bis = new BufferedInputStream(new FileInputStream("c:/html240522/temp/jdk.exe"));
			bos = new BufferedOutputStream(new FileOutputStream("c:/html240522/temp/jdk_copy.exe"));
			
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
			// 보조 스트림을 닫으면 파일 입출력 스트림도 함께 닫힌다
			bis.close();
			bos.close();
		} catch(FileNotFoundException e) {   
			System.err.println(e.getMessage());   
 		} catch(IOException e) {                   
			System.err.println(e.getMessage());
		} 
		
		
	}
}

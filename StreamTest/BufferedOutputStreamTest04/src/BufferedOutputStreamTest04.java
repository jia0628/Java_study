import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest04 {
	public static void main(String[] args) {
		// try-catch
		BufferedOutputStream bos = null;
		
		try {
			// 버퍼의 크기 5로 설정
			bos = new BufferedOutputStream(new FileOutputStream("c:/html240522/temp/test02.txt"), 5);
			
			for(int i='1'; i<='9'; i++) {
				bos.write(i);
			}
			
			//● flush(): 버퍼(메모리)에 남아있는 데이터를 강제로 밀어넣는다, 강제로 쓰도록 한다.
			bos.flush();  
			
			System.out.println("문자 파일에 쓰기가 완료되었습니다.");
			
			// 닫는 작업 생략 -> 버퍼의 크기만큼만 실행
			// 버퍼를 닫으면, flush를 하고, 파일 스트림도 닫게 한다.
			//bos.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}

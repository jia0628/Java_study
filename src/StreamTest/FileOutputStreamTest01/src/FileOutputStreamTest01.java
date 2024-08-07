import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest01 {
	public static void main(String[] args) {
		// 1번 방법
		/*
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("c:/html240522/temp/test01.txt");
			fos = new FileOutputStream("c:/html240522/temp/test01_copy.txt");
			int data = 0;
			while((data = fis.read()) != -1) {
				fos.write(data);
			}
			System.out.println("파일을 읽고 썼습니다. (파일 복사)");
			fis.close();
			fos.close();
		} catch(FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch(IOException e) {
			System.err.println(e.getMessage());
		}
		*/
		
		// 2번 방법 - try-width-resource
		
		try(FileInputStream fis = new FileInputStream("c:/html240522/temp/test01.txt");
			FileOutputStream fos = new FileOutputStream("c:/html240522/temp/test01_copy.txt");) {
			int data = 0;
			while((data = fis.read()) != -1) {
				fos.write(data);
			}
			System.out.println("파일을 읽고 썼습니다. (파일 복사)");
		} catch(FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch(IOException e) {
			System.err.println(e.getMessage());
		}
		
	}
}

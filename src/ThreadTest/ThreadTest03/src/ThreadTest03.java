import javax.swing.JOptionPane;

class MyThread extends Thread {
	@Override
	public void run() {
		for(int i=10; i>=0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);  // 1초
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

// swing 요새는 잘 안씀
public class ThreadTest03 {
	public static void main(String[] args) {
		// 쓰레드 인스턴스로 동작
		MyThread t1 = new MyThread();
		t1.start();
		
		// main 쓰레드로 동작
		String name = JOptionPane.showInputDialog("이름을 입력하세요.");
		System.out.println("당신의 이름은 " + name + "입니다.");
		
	}
}

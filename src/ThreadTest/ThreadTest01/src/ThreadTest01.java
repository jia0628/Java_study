
/*
	쓰레드를 생성하는 방법
	1. Thread 클래스를 상속받는 클래스
		- 다른 부모로부터 상속받은게 있으면 쓸 수 없다. (다중상속x)
	2. Runnable 인터페이스를 구현하는 클래스 (★추천)
	
	- run(): 쓰레드를 만들때 반드시 오버라이딩 해야하는 메서드
*/

// 1번 방법
class MyThread extends Thread {
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(getName());
		}
	}
}

// 2번 방법
class MyThread2 implements Runnable {
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
public class ThreadTest01 {
	public static void main(String[] args) {
		// 1. Thread 클래스를 상속 받았을때
		MyThread t1 = new MyThread();
		t1.start(); //● start를 통해 run() 메서드를 호출한다(직접적으론 할 수 없어서 간접적인 호출 사용)
		
		// 2. Runnable 인터페이스를 구현했을때
//		MyThread2 mt = new MyThread2();
//		Thread t2 = new Thread(mt);
		Thread t2 = new Thread(new MyThread2());
		t2.start();
	}
}


class Thread1 extends Thread {
	@Override
	public void run() {
		for(int i=0; i<500; i++) {
			System.out.printf("%s", new String("-"));
			if(i%50 == 0) System.out.println();
			for(int j=0; j<10000000; j++) { }  // 속도 지연을 위해 공회전을 돌림
		}
	}
}

class Thread2 extends Thread {
	@Override
	public void run() {
		for(int i=0; i<500; i++) {
			System.out.printf("%s", new String("|"));
			if(i%50 == 0) System.out.println();
			for(int j=0; j<10000000; j++) { }  // 속도 지연을 위해 공회전을 돌림
		}
	}
}

/*
 우선순위: 우선으로 실행하도록 하는 순위, 1~10으로 설정할 수 있음, 기본값 5
 데몬 쓰레드(Daemon Thread): 일반 쓰레드의 작업을 돕는 보조 작업 쓰레드 , 일반 쓰레드가 종료되면 자동으로 대몬 쓰레드로 종료됨.
 
 */
public class ThreadTest04 {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		System.out.println("t1: " + t1.getName());
		System.out.println("t2: " + t2.getName());
		
		System.out.println("t1 우선순위: " + t1.getPriority());
		System.out.println("t2 우선순위: " + t2.getPriority());
		
		// 우선순위 변경
//		t1.setPriority(10);
//		t2.setPriority(1);
		
		System.out.println("t1 우선순위: " + t1.getPriority());
		System.out.println("t2 우선순위: " + t2.getPriority());
		
		System.out.println("데몬 쓰레드 여부: " + t1.isDaemon());
		System.out.println("데몬 쓰레드 여부: " + t2.isDaemon());
		
		// 데몬 쓰레드로 변경
		t1.setDaemon(true);
		
		System.out.println("데몬 쓰레드 여부: " + t1.isDaemon());
		System.out.println("데몬 쓰레드 여부: " + t2.isDaemon());
		
		t1.start();
		t2.start();
	}
}

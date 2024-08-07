
// 공유 집게판
// - 쓰레드가 작업하는 공간
class SynObject {
	private int sum = 0;
	
	// 공유 자원 -> 임계 영역(critical section)
	// -> 동기화 영역(synchronized section)으로 바꿔줌
	// -> 하나의 쓰레드가 들어가면 lock을 걸고(모니터를 가지고), 작업이 끝날때까지 다른 쓰레드는 들어가지 못함.
	public synchronized void add() {
		int n = sum;
		for(int i=0; i<10; i++) {
			Thread.yield();   // .yield(): 다음 쓰레드로 양보, 시간이 지연됨
		}
		n += 10;
		sum = n;
		System.out.println(Thread.currentThread().getName() + " : " + sum);
	}
	
	// getter
	public int getSum() {
		return sum;
	}
}

// 쓰레드
class WorkerThread extends Thread {
	private SynObject so;
	
	public WorkerThread(String name, SynObject so) {
		super(name);
		this.so = so;
	}
	
	@Override
	public void run() {
		int i = 0;
		while(i < 10) {
			so.add();
			i++;
		}
	}
}

public class ThreadTest05 {
	public static void main(String[] args) {
		SynObject obj = new SynObject();
		
		WorkerThread th1 = new WorkerThread("John", obj);
		WorkerThread th2 = new WorkerThread("Mary", obj);
		
		th1.start();
		th2.start();
	}
}

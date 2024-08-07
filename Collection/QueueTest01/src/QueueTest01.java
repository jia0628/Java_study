import java.util.LinkedList;
import java.util.Queue;

/*
	Queue (큐)
	- 한 방향으로 데이터가 이동하는 파이프처럼 생긴 저장 구조
	- First In First Out (FIFO, 선입선출)
	- offer: 큐에 데이터를 넣는 작업
	- poll: 큐에 데이터를 꺼내는 작업, 꺼내고 나면 데이터가 사라짐.
	
 */
public class QueueTest01 {
	public static void main(String[] args) {
		//● Queue는 구현체 클래스로 Queue가 아닌 LinkedList사용
		Queue<Integer> q1 = new LinkedList<>();
		
		// 데이터 추가
		q1.offer(10);
		q1.offer(20);
		q1.offer(30);
		System.out.println(q1);
		System.out.println("크기: " + q1.size());
		
		// 데이터를 꺼냄
		while(!q1.isEmpty()) {
			System.out.println(q1.poll());
		}
		System.out.println(q1);
		System.out.println("크기: " + q1.size());
		System.out.println("-----------");
		
		
		Queue<String> q2 = new LinkedList<>();
		
		// 데이터 추가
		q2.offer("박준우");
		q2.offer("유호진");
		q2.offer("달시오크");
		System.out.println(q2);
		System.out.println("크기: " + q2.size());
		
		// 데이터를 꺼냄
		while(!q2.isEmpty()) {
			System.out.println(q2.poll());
		}
		System.out.println(q1);
		System.out.println("크기: " + q2.size());
		
	}
}

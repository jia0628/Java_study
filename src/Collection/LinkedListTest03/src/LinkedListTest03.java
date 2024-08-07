import java.util.Iterator;
import java.util.LinkedList;

class Point {
	// 인스턴스 변수
	private int x;
	private int y;
	
	// 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// getter
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	// setter
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//★ 2개의 인스턴스가 같은지의 여부, equals() 메서드
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			Point p = (Point)obj;
			return this.x == p.x && this.y == p.y;
		}
		return false;
	}
	
	// toString 출력
	@Override
	public String toString() {
		return String.format("(%d, %d)", x, y);
	}
	
}

public class LinkedListTest03 {
	public static void main(String[] args) {
		// Point 클래스의 인스턴스를 저장하는 LinkedList 생성
		LinkedList<Point> list = new LinkedList<>();
		
		// 데이터 10개 추가, 10부터 10씩 증가하는 좌표 10개 추가 (순차적)
		for(int i =10; i<=100; i+=10) {
			list.add(new Point(i, i));
		}
		System.out.println(list);
		
		// 맨 뒤에 (110, 110) 데이터 추가 (순차적)
		list.add(new Point(110, 110));
		System.out.println(list);
		
		// (20, 20) 뒤에 (25, 25) 데이터 추가 (비순차적)
//		list.add(2, new Point(25, 25));
		
		//★ Object클래스의 equals() 메서드 오버라이딩이 필요한 부분
		for(int i=list.size()-1; i>=0; i--) {
			if(list.get(i).equals(new Point(20, 20))) { // list.get(i) -> this부분, new Point(20, 20) -> p부분
				list.add(i+1, new Point(25, 25));
			}
		}
		System.out.println(list);
		
		// (50, 50) 데이터를 삭제
//		list.remove(5);
		
		for(int i=list.size()-1; i>=0; i--) {
			if(list.get(i).equals(new Point(50, 50))) {
				list.remove(i);
			}
		}
		System.out.println(list);
		
		// (70, 70) 데이터를 (75, 75)로 수정
		for(int i=list.size()-1; i>=0; i--) {
			if(list.get(i).equals(new Point(70, 70))) {
				list.set(i, new Point(75, 75));
			}
		}
		System.out.println(list);
		System.out.println();
		
		// 출력 1
		System.out.println("----출력 1----");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + "  ");
		}
		System.out.println();
		
		// 출력 2
		System.out.println("----출력 2----");
		for(Point p : list) {
			System.out.print(p + "  ");
		}
		System.out.println();
		
		// 출력 3
		System.out.println("----출력 3----");
		Iterator<Point> it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + "  ");
		}
		System.out.println();
		
		// 출력 4
		System.out.println("----출력 4----");
		list.forEach(x -> System.out.print(x + "  "));
		System.out.println();
		
		// 출력 5
		System.out.println("----출력 5----");
		list.forEach(System.out::print);
		System.out.println();
		
	}
}

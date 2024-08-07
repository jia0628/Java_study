package test;

import shape.*;

/*
문제) 아래의 작업 지시 사항을 준수하여 다형성 프로그램을 완성하시오.
	1. 인터페이스 Plane2D(평면)를 만들고, 면적을 리턴하는 추상 메서드 getArea를 추가하시오.
	2. 추상 클래스인 AbstractSquare을 생성하고, Rectangle과 Parallelogram을 자식 클래스로 만드시오.
	3. 밑변과 높이를 가지는 Parallelogram(평행사변형) 클래스를 추가하시오.
	4. 면적을 가지는 클래스는 getArea를 오버라이딩하시오.
	
	5. 5개 도형의 인스턴스를 담는 배열을 생성하여 다형성을 구현하시오.
	6. 반복문을 사용하여 5개 도형의 정보를 출력하시오.
	7. 면적을 계산하는 도형은 면적 정보를 함께 출력하시오.
*/

public class ShapeTest02 {
	public static void main(String[] args) {
		// 다형성 구현 1
		/*
		Shape[] shapes = new Shape[5];
		shapes[0] = new Point();
		shapes[1] = new Rectangle(10, 5);
		shapes[2] = new HorizontallLine(5);
		shapes[3] = new VerticalLine(6);
		shapes[4] = new Parallelogram(7, 5);
		*/
		
		// 다형성 구현 2
		Shape[] shapes = new Shape[] {
				new Point(),
				new HorizontallLine(5),
				new VerticalLine(6),
				new Rectangle(8, 3),
				new Parallelogram(8, 4),
		};
		
		// 출력 1번 - 기본 for문
		for(int i=0; i<shapes.length; i++) {
			shapes[i].print();                        //● Rectangle과 Parallelogram의 공통점: AbstractSquare의 자식들, 인터페이스가 Plane2D
			if(shapes[i] instanceof AbstractSquare) { //● 자식들 말고 부모를 참조하냐 물어보면된다, 인터페이스를 물어봐도 된다.
				System.out.println("총 면적: " + ((AbstractSquare)shapes[i]).getArea());
			}
			System.out.println();
		}
		
		// 출력 2번 - 향상된 for문
		/*
		for(Shape s : shapes) {
			s.print();
			if(s instanceof Plane2D) {
				System.out.println("총 면적: " + ((Plane2D) s).getArea());
				System.out.println();
			}
		}
		*/
		
	}
}

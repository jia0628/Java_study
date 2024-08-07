package test;

/*
import shape.Shape;
import shape.Point;
import shape.Rectangle;
import shape.HorizontallLine;
import shape.VerticalLine;
*/

import shape.*;

/*
문제) 아래의 작업 지시 사항을 준수하여 다형성을 구현하시오.
	1. Shape 클래스의 자식 클래스인 4가지 도형의 인스턴스를 배열에 저장하시오. (2가지 방법)
	2. 배열을 반복문을 사용하여 인스턴스의 정보를 출력하시오. (2가지 방법)
*/

public class ShapeTest01 {
	public static void main(String[] args) {
		
		// 다형성 구현 1번
		/*
		Shape[] shapes = new Shape[4];
		shapes[0] = new Point();
		shapes[1] = new Rectangle(15, 5);
		shapes[2] = new HorizontallLine(10);
		shapes[3] = new VerticalLine(6);
		*/
		
		// 다형성 구현 2번
		Shape[] shapes = new Shape[] {
			new Point(),
			new Rectangle(15, 5),
			new HorizontallLine(10),
			new VerticalLine(6),
		};
		
		// 출력 1번 - 기본 for문
		for(int i=0; i<shapes.length; i++) {
			shapes[i].print();
			System.out.println();
		}
		
		// 출력 2번 - 확장 for문, for-in문
		/*
		for(Shape s : shapes) {
			s.print();
			System.out.println();
		}
		*/
		
	}
}

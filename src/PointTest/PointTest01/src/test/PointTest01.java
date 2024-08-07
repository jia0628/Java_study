package test;
//● 단일형
//import point.Point2D;
//import point.Point3D;

//● 주문형
import point.*;

public class PointTest01 {
	public static void main(String[] args) {
		Point2D p1 = new Point2D(10, 20);
		Point3D p2 = new Point3D(50, 60, 70);
		
		System.out.println(p1.toString()); //● Point2D 즉, 부모꺼를 찍는다
		System.out.println(p2.toString()); //● Point3D 즉, 자식꺼를 찍는다 <- 오버라이딩
		
	}
}

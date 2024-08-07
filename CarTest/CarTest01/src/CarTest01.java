
/*
Car 클래스
- 멤버 변수: name(이름), width(너비), height(높이), length(길이), x와 y(움직임을 나타나내는 좌표), fuel(연료)
- 
 */

class Car {
	// 인스턴스 변수(멤버 변수)
	private String name;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double fuel;
	
	// 생성자
	public Car(String name, int width, int height, int length, double fuel) {
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.fuel = fuel;
		x = y = 0;
	}
	
	// getter 부분
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getFuel() {
		return fuel;
	}
	
	// setter 부분
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	public void setFuel(double fuel) {
		this.fuel = fuel;
	}
	
	// 차 정보 출력 메소드
	public void putSpac() {
		System.out.println("차 이름: " + name);
		System.out.println("차 너비: " + width);
		System.out.println("차 높이: " + height);
		System.out.println("차 길이: " + length);
	}
	
}

// 문제) Car 클래스의 인스턴스를 2개 생성하여 정보를 출력하시오.
public class CarTest01 {
	public static void main(String[] args) {
		Car car1 = new Car("GV90", 2055, 1790, 4930, 200);
		Car car2 = new Car("k9", 1915, 1490, 5140, 100);
		
		car1.putSpac();
		System.out.println();
		car2.putSpac();
	}

}

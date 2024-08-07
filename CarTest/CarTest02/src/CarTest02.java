import java.util.Scanner;

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
	
	// getter
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getFuel() {
		return fuel;
	}
	
	// setter
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
	
	// 차 이동 메서드
	public boolean move(double dx, double dy) {
		double distance = Math.sqrt(dx*dx + dy*dy); //● distance -> 거리
		
		//● 연료와 거리를 비교하여 차를 움직인다.
		if(fuel > distance) { // 이동 가능
			x += dx;
			y += dy;
			fuel -= distance;
			return true;      //● true면 움직일 수 있고
		} else {              // 이동 불가능
			return false;     //● false면 움직일 수 없다.
		}
	}
	
	
}

// 문제) 자동차의 제원(이름, 너비, 높이, 길이, 연료량)을 입력하여 인스턴스를 만들고, 거리에 따라 이동할 수 있도록 프로그램을 작성하시오.
public class CarTest02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		// 입력
		System.out.println("자동차의 제원을 입력하시오.");
		
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("너비: ");
		int width = sc.nextInt();
		System.out.print("높이: ");
		int height = sc.nextInt();
		System.out.print("길이: ");
		int length = sc.nextInt();
		System.out.print("연료량: ");
		double fuel = sc.nextDouble();
		
		// 입력값을 인스턴스에 넣음
		Car car1 = new Car(name, width, height, length ,fuel); //● 입력받았던 변수들을 넣음
		
		// 메소드 호출
		car1.putSpac();
		*/
		
		Car car1 = new  Car("k9", 1200, 1500, 2000, 200);
		
		while(true) {
			System.out.printf("현재 위치: (%.2f, %.2f), 남은 연료량: %.2f\n", car1.getX(), car1.getY(), car1.getFuel());
			
			System.out.print("이동하시겠습니까? (YES:1 / NO:0) : ");
			int yn = sc.nextInt();
			
			if(yn == 0) {
				break;  //● 강제로 멈추겠다의 break;
			} 
			
			System.out.print("x방향 이동 거리 입력: ");
			double dx = sc.nextDouble();
			
			System.out.print("y방향 이동 거리 입력: ");
			double dy = sc.nextDouble();
			
			
			//● 위에서 true로 보내게 해놨으니까 !으로 false로 바꿈
			if(!car1.move(dx, dy)) {
				System.out.println("연료가 부족합니다!!!");
			} 
			
		}
		
		System.out.println("자동차가 정지하였습니다.");
		
	
		sc.close();
	}

}

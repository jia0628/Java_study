import java.util.Stack;

/*
	Stack (스택)
	- 밑이 막혀있는 통처럼 생긴 데이터 저장 구조
	- First In Last Out (FILO, 선입후출)
	- 시스템의 지역변수를 저장하는 구조, 아주 중요한 데이터는 스택에 저장
	- push: 스택에 데이터를 넣는 작업
	- pop: 스택에 데이터를 꺼내는 작업, 꺼내고 나면 데이터가 사라짐.
	
*/
public class StackTest01 {
	public static void main(String[] args) {
		Stack<Integer> st1 = new Stack<>();
		
		// 데이터 추가
		st1.push(10);
		st1.push(20);
		st1.push(30);
		System.out.println(st1);
		System.out.println("크기: " + st1.size());
		
		// 데이터를 꺼냄
		while(!st1.isEmpty()) {
			System.out.println(st1.pop());
		}
		System.out.println(st1);
		System.out.println("크기: " + st1.size());
		System.out.println("-----------");
		
		
		Stack<String> st2 = new Stack<>();
		
		//"박준우", "유호진", "달시오크", "패트릭쿤", "한설희", "에덴", "DK"
		// 데이터 추가
		st2.push("박준우");
		st2.push("달시오크");
		st2.push("에덴");
		System.out.println(st2);
		System.out.println("크기: " + st2.size());
		
		// 데이터를 꺼냄
		while(!st2.empty()) {
			System.out.println(st2.pop());
		}
		System.out.println(st2);
		System.out.println("크기: " + st2.size());
		
	}
}

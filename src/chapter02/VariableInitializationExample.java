package chapter02;

public class VariableInitializationExample {
	public static void main(String args[]) {
		// 변수 value 선언
		int value;
		
		//변수 value 값을 읽고 10을 더하는 산술 연산을 수행
		//연산의 결과값을 변수 result의 초기값으로 저장
		//int result = value + 10; - 변수의 초기화가 되어있지 않으므로 실행 불가능
		value = 20;
		int result = value + 10;
		
		// 변수 result의 값을 콘솔에 출력
		System.out.println(result);
		
	}
}

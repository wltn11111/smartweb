import java.util.Scanner;

public class Exam_01 {

	// Method 정의부(Definition)
	public static int plus(int num1, int num2){		// 메서드 왼쪽에 리턴 데이터 타입, 오른쪽은 매개변수
		int result= num1+num2;					
		return result;
	}
	
	// 두 정수를 인자로 전달받아 뺄셈한 결과를 반환하는 minus 메서드
	public static int minus(int a, int b) {
		int minus = a-b;
		return minus;
	}
	// 두 정수를 인자로 전달받아 나눗셈한 결과를 실수로 반환하는 divide 메서드
	public static double divide(double a, double b) {
		double result = a/b;
		return result;
	}
	
	// 두 정수를 인자로 전달 받아 더 큰수를 반환하는 bigger 메서드
	// (두 수가 같다면 0을 반환)
	public static int bigger(int a, int b) {
		int result=0;
		if(a < b) {
			result = b;
		}else if(a >  b) {
			result = a;
		}else if(a==b) {
			result = 0;
		}
		return result;
	}
	
	// "사과" 를 인자로 전달하면 Apple 을, "딸기"를 인자로 전달하면 Strawberry를 
	// 반환하는 translate 메서드 제작
	// (사과나 딸기가 아닌 다른 값이 전달도면 none 반환)
	public static String translate(String result) {
		
		if(result == "사과") {
			result="Apple";						//.equals 문자 비교문
		}else if(result == "딸기") {
			result="Strawberry";
		}else {
			result="none";
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		// System.out.println(10+5);
		// System.out.println(plus(10,5));		// 메서드 호출부
		
		
//		int result = plus(10,5);	// 사용자 정의 메서드
		
		System.out.println(minus(10,7));
		System.out.println(divide(10,3));
		System.out.println(bigger(4,10));
		System.out.println(translate("ㅁㄴㅇ"));
		String str = new String("딸기");
		System.out.println(str);
		

//		System.out.println(result);	
			// 내장 메서드
		// puls method 에 전달하는 10과 5를 인자,인수값(parameter, argument) 이라고 부른다.
		// 메서드에 전달되어지는 값을 받는 변수를 매개 변수라고 부른다.
		
	}
}


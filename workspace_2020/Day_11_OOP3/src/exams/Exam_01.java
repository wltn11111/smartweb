package exams;

class A {
	public void funcA() {
		System.out.println("A입니다.");
	}
}
class B extends A{
	public void funcA() {
		System.out.println("B입니다.");
	}
}
public class Exam_01 {
	
	public static void main(String[] args) {
		
		// 많을 다 형상 형
		// 다형성 
		// 클래스 간 상속관계에서 부모클래스 자료형으로 만든 참조 변수에게 발현되는 성질
		// 상위 클래스 참조변수는 하위 클래스 인스턴스의 주소를 저장할 수 있다.
		// 다형성으로 형변환 형변환으로 B클래스에 메서드 사용가능.
		
		A a = new B();		// up casting  // down casting
		a.funcA();
		
		// 다형성을 가지는 부모클래스 참조변수는 기본적으로 자신의 Type만큼의 참조만 가능
		// 만약 자신의 Type이 아닌 대입된 인스턴스의 모든 기능을 사용하고 싶다면 Down casting 필요
		// *예외 상황 : 자식클래스에서 Overriding 한 메서드는 Down Casting없이 사용
		
	}
}

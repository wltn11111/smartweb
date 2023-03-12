package custom;

public class Temp {
	public int a;				// Instance Member field 
	public static int b;		// Class Member field 정적변수 

	public void func1() {
		a=20;
		b=20;
	}

	public static void func2() {
		b = 20;
	}
}

// static : main 이 생성된 후에 바로 생성 (사용가능)
//		    메모리 효율성이 떨어짐
//		    프로그램이 끝날때 까지 사용해야하는것만 static사용.

// Instance : 인스턴스는 new 클래스를 만들면 생성.
// 			  인스턴스는 클래스를 포함하지않는다. 인스턴스는 a만 갖는다. a는 b의 주소를 기억함.
//			  인스턴스는 b를 포함 x, main생기면 data영역에 b생성.



public class Exam_05 {
	public static void main(String[] args) {
		
		int a= 10;

		// 대입연산자 규칙1 우항이 좌항으로 대입된다(예외없음)
		// 대입연산자 규칙2 그러므로 좌항은 반드시 공간이어야만 한다. (변수)
				
		 int A=10; int B=20;
		 //A += B;
		 // A+=B;
		 // B-=A;
		 // A*=B;
		 // A/=B;
		 
		 // A++; ++A;
		 // A =  A + 1; 
		 // B--; --B;
		 // B = B - 1;
		 
//		 System.out.println("A : " + A++);
//		 System.out.println(A);
//		 System.out.println("B : " + B);
		
		 // 관계연산자
		 // A == B : A 값이 B 값과 같다.
		 
/*		 System.out.println(A == B); // A 값이 B 값과 같다.
		 System.out.println(A != B); // A 와 B의 값이 같지 않다.
		 System.out.println(A < B);  // A 가 B보다 작다.
		 System.out.println(A > B);  // A 가 B보다 크다.
		 System.out.println(A <= B); // A가 B보다 작거나 같다.
		 System.out.println(A >= B); // A가 B보다 크거나 같다.
		 
//		 System.out.println(10 < A < 20); 사용불가
		 10 < A && A < 20
		 
		 */ 
		 // &&연산자 (그리고)  ||연산자 (또는) 
		 System.out.println(true && true);
		 System.out.println(true && false);
		 System.out.println(false && true);
		 System.out.println(false && false);
		 System.out.println("==================");
		 System.out.println(true || true);
		 System.out.println(true || false);
		 System.out.println(false || true);
		 System.out.println(false || false);
		 
		 // 논리 연산자 shortcut 
		 
		 
		 
	}
}

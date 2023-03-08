
public class Exam_02 {

	public static void main(String[] args) {
		
		//난수예제
		
		double rand = Math.random();	// 0 ~ 1.0 사이의 실수를 무작위로 생성
		System.out.println((int)(rand*10));	// 난수 0 ~ 9 출력 코드
		System.out.println((int)(rand*6) + 1 ); 	// 주사위 1 ~ 6
		
		// 37 ~ 52 사이의 난수를 출력하려면?
		// 난수 범위 공식
		// 구하고자 하는 난수의 최소값을 x
		// 구하고자 하는 난수의 최대값을 y
		// (Y-X+1)+X
		// (52-37+1)+37
		System.out.println((int)(rand));
		
	}
}

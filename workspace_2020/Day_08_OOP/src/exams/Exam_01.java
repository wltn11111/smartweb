package exams;
import java.util.Scanner;

import custom.TV;

public class Exam_01 {
	public static void main(String[] args) {
		
		TV samsung = new TV();
	
		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
		
		String str = new String("Apple");
		System.out.println("Apple" == "Apple");
		System.out.println(str == "Apple");
		
	}
}				

//Stack메모리에 변수하나를 생성
// new를 사용하여 참조자료형을 heap메모리에 저장(instance(객체))
// instance의 주소값을 변수에 담아야한다. 
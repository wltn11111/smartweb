package exams;

import custom.Temp;

public class Exam_04 {
	
	public void func() {
		int a =10;
	}
	
	public static void main(String[] args) {
		
		Temp t1 = new Temp();
		Temp t2 = new Temp();
//		t1 = null;			// 인스턴스 지우기

		t1.a=30;
		t2.a=20;
		
		System.out.println(t1.a);
		System.out.println(t2.a);
		
		t1.b =30;
		Temp.b = 335;
		System.out.println(t2.b);
		
		// 지역변수 -> stack 메모리
		// 매개변수 -> stack 메모리
		// 멤버변수 -> heap 메모리
		// 정적변수 -> data 메모리
		
	}
}

package OOP_Quiz01;

import java.util.Scanner;

public class Student {
	private String name;
	private int kor,eng,math;

	// Constructor - 생성자
	// 목적 - 만들어진 인스턴스에 초기값을 세팅하게 하기 위한 목적으로 사용되는 메서드
	// 생성자 메서드는 여타 다른 메서드들과 다르게 return 값을 가질수 없다.
	// 생성자 메서드는 다른 메서드들과 다르게 method call 타이밍을 선택할 수 없다.
	// 기타 특성은 일반 메서드와 동일하다.

	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		
	}

	/*public Student() {
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		eng = Integer.parseInt(sc.nextLine());
		kor = Integer.parseInt(sc.nextLine());
		math = Integer.parseInt(sc.nextLine());	
	}*/

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		this.math = math;
	}


	@Override
	public String toString() {
		return "Student [이름= "+ name +", 영어=" + eng + ", 국어=" + kor + ", "
				+ "수학=" + math + ", 합계="+(kor+eng+math) + 
				", 평균="+((kor+eng+math)/3.0) +"]";
	}


}

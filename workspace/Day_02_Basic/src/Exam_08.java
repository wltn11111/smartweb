import java.util.Scanner;

public class Exam_08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		String str = sc.nextLine(); 	 // 입력상태 유지, 숫자입력하면 변수에 숫자 저장
		
		int num = Integer.parseInt(str); // parseInt : 소괄호 안에있는것을 숫자로 분석하라.
		System.out.println(num + 15);
	
	}
}

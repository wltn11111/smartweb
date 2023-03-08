import java.util.Scanner;

public class Exam_07 {
	public static void main(String[] args) {
		
		// 문장을 입력받는 기능
		Scanner sc = new Scanner(System.in); 	//컨트롤 쉬프트 알파벳O 오토임프트
		
		// System.in.read();
		// nextLine을 쓰려면 Scanner Scanner를 쓰려면 import
		System.out.println("메세지를 남겨주세요.");
		String str = sc.nextLine(); 			// nextLine은 문자열로(String값)을 받아옴.
		
		System.out.println("<<당신이 남신 메세지는>>");
		System.out.println(str);
		
	}
}

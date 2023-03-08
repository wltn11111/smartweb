import java.util.Scanner; // 컨트롤 쉬프트 O

public class Quiz_06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("두번째 정수 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		System.out.println("두 수의 합은 : "+ (num1+num2));
	/*	
		// 두 정수를 입력받아 덧셈한 결과를 출력하는 프로그램을  작성해주세요.
		System.out.print("첫번째 정수를 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		
		System.out.print("두번째 정수를 입력해주세요 : ");
		String str2 = sc.nextLine();
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		System.out.println("두 수의 합은 : "+ (num1+num2));
		*/
	}

}

import java.util.Scanner;

public class Quiz_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~100사이 입력 : " );
		int num = Integer.parseInt(sc.nextLine());
	
		System.out.println("=========결과=============");
		
		
		if(1 <= num && 100 >= num) {
			if(num % 2 == 0) {
				System.out.println("입력한 수는 짝수입니다.");
			}else if(num % 2 == 1) {
				System.out.println("입력한 수는 홀수입니다.");
			}else {
				System.out.println("숫자");
			}
		}else {
			System.out.println("1~100사이 숫자를 입력해주세요.");
		}
	}
		
	}


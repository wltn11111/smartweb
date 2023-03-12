import java.util.Scanner;

public class Quiz_07 {
	public static void main(String[] args) {

		// System.exit(0); 실행즉시 프로그램을 꺼버린다. 반복문에 사용.
		
		Scanner sc = new Scanner(System.in);

		while(true) {	// 무한반복은 while(true) 묶는다.
			System.out.print("2~9단중 선택 (0 -> 종료) : ");
			int num = Integer.parseInt(sc.nextLine());
			System.out.println("====구구단 출력 프로그램====");
			System.out.println();

			if(num == 0) {
				System.out.println("구구단을 종료합니다.");
				System.exit(0);
			}
			if(1 < num && num < 10 ) {
				int i = 1;
				while(i < 10) {
					System.out.println(num + " * "+ i +" = " + (num * i));
					i++;
				}
			}else {
				System.out.println("범위를 벗어났습니다.");
			}
		}
	}
}

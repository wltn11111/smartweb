import java.util.Scanner;

public class Quiz_04 {
	
	public static int validNum(String msg) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		while(true) {
			try {
				System.out.print(msg);
				num = Integer.parseInt(sc.nextLine());
				return num;						
			}catch(Exception e) {
				System.out.println("숫자를 입력해야 합니다.");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		while(true) {
			System.out.println("===계산기 프로그램===");

			System.out.print("연산자 입력(+,-,*,/) : ");
			String st = sc.nextLine();
			
			if(st.equals("q")){
				System.out.println("종료합니다.");
				System.exit(0);
			}else if(st.equals("+") || st.equals("-") ||
					st.equals("*") || st.equals("/")) { 
				
				int num1 = validNum("첫 번째 숫자 입력 : ");
				int num2 = validNum("두 번째 숫자 입력 : ");
				
				
				
	/*			while(true) {
					try {

						System.out.print("첫 번째 숫자 입력 : ");
						num1 = Integer.parseInt(sc.nextLine());
						break;	// 수가 정상 입력 될 시 무한루프 탈출						
					}catch(Exception e) {
						System.out.println("숫자를 입력해야 합니다.");
					}
				}

				while(true) {
					try {

						System.out.print("두 번째 숫자 입력 : ");
						num2 = Integer.parseInt(sc.nextLine());
						break;	// 수가 정상 입력 될 시 무한루프 탈출						
					}catch(Exception e) {
						System.out.println("숫자를 입력해야 합니다.");
					}
				} */

				int sum=num1+num2;
				int sub=num1-num2;
				int mul=num1*num2;
				double div=(num1/(double)num2);

				System.out.println("==== 결과 ====");
				if(st.equals("+")) {
					System.out.println(num1 + "+" + num2 + "=" + sum + "\n");

				}else if(st.equals("-")) {
					System.out.println(num1 + "-" + num2 + "=" + sub + "\n");

				}else if(st.equals("*")) {
					System.out.println(num1 + "*" + num2 + "=" + mul + "\n");

				}else if(st.equals("/")) {
					//	System.out.printf("%d * %d = %.2f \n", num1, num2, div);
					System.out.println(num1 + "/" + num2 + "=" + div + "\n");
				}
			}else {
				System.out.println("연산자를 다시 입력해주세요.");
			}
		}
	}
}

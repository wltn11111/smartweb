import java.util.Scanner;

public class Quiz_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("===동전 앞 뒤 맞추기===");
		System.out.print("숫자를 입력해주세요(1.앞면/2.뒷면) : ");
		while(true){

			while(true) {
				try {
					int num = Integer.parseInt(sc.nextLine());

					double rand = Math.random();
					if(num==(int)(rand*3)+1) {

						System.out.println("맞췄습니다.");
						System.out.println("---------------------->restart");

					}
					else {
						System.out.println("땡! 틀렸습니다!");
					}
					break;
				}catch(Exception e) {
					System.out.println("다시입력해 주세요.");
				}

			}

		}
	}
}

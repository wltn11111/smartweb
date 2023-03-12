import java.util.Scanner;

public class Quiz_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			while(true) {		// switch문으로 다시해보기
				try {		
					System.out.println("===가위 바위 보 게임===");
					System.out.print("숫자를 선택하세요(1.가위/ 2.바위/ 3.보) : ");
					int num = Integer.parseInt(sc.nextLine());
					int rand = (int)(Math.random()*3)+1;
					
					
					if(num==1) {
						System.out.println("당신은 가위를 냈습니다.");
					}else if(num==2) {
						System.out.println("당신은 바위를 냈습니다.");
					}else if(num==3) {
						System.out.println("당신은 보를 냈습니다.");
					}else {
						System.out.println("잘못입력하였습니다.");
						continue;
					}

					if(rand==1) {		// 경우의수를 정해주기
						System.out.println("컴퓨터는 가위를 냈습니다.");
					}else if(rand==2) {
						System.out.println("컴퓨터는 바위를 냈습니다.");
					}else if(rand==3) {
						System.out.println("컴퓨터는 보를 냈습니다.");
					}

					if((num==1 && rand==3)||(num==2&&rand==1)||(num==3&&rand==2)) {
						System.out.println("당신이 이겼습니다.");
					}else if(num==rand) {
						System.out.println("비겼습니다.");
					}else{
						System.out.println("컴퓨터가 이겼습니다.");
					}
					break;
				}catch(Exception e) {
					System.out.println("숫자를 입력해주세요.");
				}
			}
		}	

	}

}




import java.util.Scanner;

public class Quiz_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i=0;
		int a;

		System.out.println("***ATM 시뮬레이터***");
		System.out.println("1.잔액조회");
		System.out.println("2.입금하기");
		System.out.println("3.출금하기");
		System.out.println("4.종료하기");
		System.out.print(">>");

		while(true) {

			while(true) {
				try {
					a = Integer.parseInt(sc.nextLine());
					break;
				} catch(Exception e) {
					System.out.println("다시 입력해주세요.");
				}
			}


			if(a==1) {
				System.out.println("잔액 : " + i);	

			}else if(a==2) {
				while(true) {
					try {
						System.out.println("얼마를 입금하시겠습니까?");
						int j = Integer.parseInt(sc.nextLine());

						System.out.println(j+"원이 입금되었습니다.");
						i+=j;
						break;
					}catch(Exception e) {
						System.out.println("금액은 숫자로 입력해야 합니다.");
					}
				}
			}else if(a==3) {
				while(true) {
					try {
						System.out.println("얼마를 출금하시겠습니까?");	
						int k = Integer.parseInt(sc.nextLine());

						if(k<i) {
							System.out.println(k+"원이 출금되었습니다.");
							i-=k; 
						}else if(k>i){
							System.out.println("잔액이 부족합니다.");
						}
						break;
					}catch(Exception e) {
						System.out.println("금액은 숫자로 입력해야 합니다.");
					}
				}
			}else if(a==4) {
				System.out.println("종료하기");
				System.exit(0);
			}else {
				System.out.println("다시눌러주세요.");			
			}

		}
	}
}			


/*	switch(a) {
				case 1:
					System.out.println("잔액조회 기능을 선택");
					break;
				case 2:
					System.out.println("입금하기 기능을 선택");
					break;
				case 3:
					System.out.println("출금하기 기능을 선택");
					break;
				case 4:
					System.out.println("종료하기 선택");
					System.exit(0);
					break;
				default :
					System.out.println("다시 눌러주세요.");
				}*/

/*	if(a==1) {
				System.out.println("잔액조회 기능을 선택");	
			}else if(a==2) {
				System.out.println("입금하기 기능을 선택");	
			}else if(a==3) {
				System.out.println("출금하기 기능을 선택");	
			}else if(a==4) {
				System.out.println("종료하기");	
			}else {
				System.out.println("다시눌러주세요.");
			} */


import java.util.Scanner;

public class Quiz_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ins=0;
		int bt=0;

		while(true) {
			try {
			System.out.println("경마 게임에 오신것을 환영합니다.");
			System.out.println("1.게임 시작");
			System.out.println("2.잔액 충전");
			System.out.println("3.잔액 조회");
			System.out.println("4.종료");
			System.out.print("메뉴를 선택해주세요.>>");
			int num = Integer.parseInt(sc.nextLine());

			if(num==1) {
				System.out.println("!! 경마 게임을 시작하겠습니다 !!");
				System.out.println("1.우승 경력이 많지만 은퇴를 앞둔 말");
				System.out.println("2.이번 달 성적이 제일 좋은 말");
				System.out.println("3.최근 떠오르는 신예인 말");
				System.out.print("배팅 하고 싶은 말을 선택해주세요.>>");
				int hol = Integer.parseInt(sc.nextLine());
				if(hol>3) {
					System.out.println("다시 고르세요.");
				}else {
					System.out.print("얼마를 배팅 하시겠습니까?>>");		
					bt = Integer.parseInt(sc.nextLine());

					if(bt>ins) {
						System.out.println("충전해오세요.");
					}else if(bt<=ins) {

						int ran = (int)(Math.random()*3)+1;

						if(hol==ran) {
							System.out.println("배팅에 성공하셨습니다.");
							System.out.println("금액 두배 : "+ bt*2);
							ins+=bt*2;

						}else if(hol!=ran) {
							System.out.println("배팅에 실패하셨습니다 ㅠㅅㅠ");
							ins-=bt;
							System.out.println("배팅 금액 " + bt + "원을 모두 잃으셨습니다.");
							System.out.println("=============================");
						}
					}
				}
			}else if(num==2) {
				System.out.print("잔액 충전 >>");
				ins=Integer.parseInt(sc.nextLine());
				System.out.println("=============================");

			}else if(num==3) {
				System.out.println("잔액은 "+ ins + "원");
				System.out.println("=============================");

			}else if(num==4) {
				System.out.println("종료");
				System.out.println("=============================");
				System.exit(0);
			}else {
				continue;
			}
			}catch(Exception e) {
				System.out.println("다시 입력해주세요.");
			}
		}
	}
}

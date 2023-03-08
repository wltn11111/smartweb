import java.util.Scanner;

public class Quiz_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int mon=3000;
		int co=0;
		int sa=0;
		int m=0;

		int cocont=1000;
		int sacont=800;
		int mcont=1500;

		while(true) {
			System.out.println("<< 자판기 시뮬레이터 >>");
			System.out.println("음료수를 선택하세요.");
			System.out.println("1. 콜라(1000) 2. 사이다(800) 3. 매실차(1500) 4. 종료[0. 소지품확인]");


			int menu = Integer.parseInt(sc.nextLine());

			if(menu==1) {
				if(mon>=cocont) {
					System.out.println("콜라를 구매했습니다.");
					co++;
					System.out.println("콜라 : " + co + "개");
					mon-=cocont;
					System.out.println("소지금 : "+ mon + "\n");
				}else if(mon < cocont) {
					System.out.println("소지금이 부족합니다." + "\n");
				}
			}else if(menu==2) {
				if(mon>=sacont) {
					System.out.println("사이다를 구매했습니다.");
					sa++;
					System.out.println("사이다 : " + sa + "개");
					mon-=sacont;
					System.out.println("소지금 : "+ mon + "\n");
				}else if(mon<sacont) {
					System.out.println("소지금이 부족합니다." + "\n");
				}
			}else if(menu==3) {
				if(mon>=mcont) {
					System.out.println("메실차를 구매했습니다.");
					m++;
					System.out.println("메실 : " + m + "개");
					mon-=mcont;
					System.out.println("소지금 : "+ mon + "\n");
				}else if(mon<mcont) {
					System.out.println("소지금이 부족합니다." + "\n");
				}
			}else if(menu==4){
				System.out.println("종료");
				System.exit(0);			
			}else if(menu==0) {
				System.out.println("<< 소지품 목록 >>");
				System.out.println("소지금 : " + mon + "원");
				System.out.println("콜라 : "+ co + "개");
				System.out.println("사이다 : "+ sa + "개");
				System.out.println("매실차 : "+ m + "개");
				System.out.println("==================");
				System.out.println();
			}
		}
	}
}

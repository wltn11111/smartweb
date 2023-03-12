import java.util.Scanner;

public class Quiz_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("오늘 점심메뉴를 선택하세요.");
		System.out.println("1.김치찜 2.샐러드김밥 3.돈가스");
		System.out.print(">>");
		
		// 선택한 메뉴에 따라, 가까운 가게 이름을 출력하는 프로그램 작성
		
		int menu = Integer.parseInt(sc.nextLine());
		
		if(menu == 1) {
			System.out.println("종로도담");
		}else if(menu == 2) {
			System.out.println("일번가 김밥");
		}else if(menu == 3) {
			System.out.println("원흠");
		}else {
			System.out.println("가게를 골라주세요.");
		}
	}
}

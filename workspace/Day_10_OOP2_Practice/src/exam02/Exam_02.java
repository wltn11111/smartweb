package exam02;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam_02 {

	// CafeMenu 클래스 설계
	// 상품번호 (숫자)
	// 상품명 (문자열)
	// 가격ㄱ (숫자)
	// getter / setter / construcor / 정보은닉

	// 1001 / Americano / 2500
	// 1002 / CafeLatte / 3000

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Manager manager = new Manager();

		while(true) {
			System.out.println("< CafeMenu >>");
			System.out.println("1. 카페 메뉴 등록");
			System.out.println("2. 카페 메뉴 출력");
			System.out.println("3. 메뉴 검색 (제목으로)");
			System.out.println("4. 메뉴 수정 (제목으로)");
			System.out.println("5. 메뉴 삭제 (제목으로)");
			System.out.println("0. 종료");
			System.out.print(">>");
			int menu = Integer.parseInt(sc.nextLine());

			if(menu==1) {
				manager.addMenu(new CafeMenu(1,"아메리카노",2500));
				manager.addMenu(new CafeMenu(2,"카푸치노",3000));
				manager.addMenu(new CafeMenu(3,"아포카토",3500));


			}else if(menu==2) {
				ArrayList<CafeMenu> cafemenu = manager.getCafe();

				System.out.println("번호\t메뉴\t가격");
				for(CafeMenu ca : cafemenu) {
					System.out.println(ca.getNum()+"\t"+ca.getMen()+"\t"+ca.getPrice());
				}


			}else if(menu==3) {

				System.out.println("검색할 메뉴 이름 : ");
				String name = sc.nextLine();

				ArrayList<CafeMenu> result = manager.serchByMenu(name);

				System.out.println("번호\t메뉴\t가격");
				if(result.size() == -1) {
					System.out.println("메뉴가 없습니다.");
				}else {
					for(CafeMenu ca : result) {
						System.out.println(ca.getNum()+"\t"+ca.getMen()+"\t"+ca.getPrice());
					}
				}

			}else if(menu==4) {

				System.out.println("수정할 메뉴 이름 : ");
				String str = sc.nextLine();

				int index = manager.indexMenu(str);

				if(index == -1) {
					System.out.println("메뉴가 없습니다.");
				}else {
					System.out.println("번호");
					int num = Integer.parseInt(sc.nextLine());

					System.out.println("메뉴");
					String name = sc.nextLine();

					System.out.println("가격");
					int price = Integer.parseInt(sc.nextLine());

					manager.updateMenu(index, new CafeMenu(num,name,price));


				}
			}else if(menu==5) {
				
				System.out.println("삭제할 메뉴 이름 : ");
				String st = sc.nextLine();
				
				int result = manager.deleMenu(st);
				if(result == -1) {
					System.out.println("삭제할 메뉴가 없습니다.");
				}
			}

		}
	}
}


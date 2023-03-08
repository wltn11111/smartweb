package exams01;

import java.util.Scanner;

public class Exam_01_Practice {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Movie [] mov = new Movie[100];		// new나오면 인스턴스를 만든다.
											// Movie 에 멤버필드가 존재. name,gan,star
	
		while(true) {
			System.out.println("<<Netfilx Simulator>>");
			System.out.println("1. 신규 영화 등록");
			System.out.println("2. 영화 목록 출력");
			System.out.println("0. 종료");
			System.out.print(">>");
			int menu = Integer.parseInt(sc.nextLine());


			if(menu==1) {
				for(int i=0; i<mov.length; i++) {
					if(mov[i]==null) {
						mov[i] = new Movie();
						// 영화 제목
						System.out.print("신규 영화 제목 : ");
//						mov[i].setName();

						//영화 장르
						System.out.print("신규 영화 장르 : ");
//						mov[i].setGan();
						//평점 
						System.out.print("신규 영화 평점 : ");
//						mov[i].setStar();
						//위의 3가지를 입력 받아서
						// Movie 인스턴스를 생성해보세요.
						System.out.println(mov[i].getName()+"\t"+mov[i].getGan()+"\t"+mov[i].getStar());
						break;
					}  
				}
			}else if(menu ==2) {	// 영화 추가한 리스트
				System.out.println("제목"+"\t"+"장르"+"\t"+"평점");
				for(int i =0; i<mov.length ; i++) {
					if(mov[i]==null) {
						break;
					}
					System.out.println(mov[i].getName()+"\t"+mov[i].getGan()+"\t"+mov[i].getStar());
				}

			}else if(menu ==0) {
				System.out.println("Netfilx 를 종료 합니다.");
				System.exit(0);
			}else {
				System.out.println("메뉴 번호를 다시 확인해주세요.");
			}
		}

	}
}

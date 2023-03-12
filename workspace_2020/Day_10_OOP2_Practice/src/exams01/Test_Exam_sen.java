package exams01;

import java.util.ArrayList;
import java.util.Scanner;

import exams01.Movie;

public class Test_Exam_sen {
	public static void main(String[] args) {

		// M V C
		// Model	: 시각적으로 보여지진 않지만 내부적으로 동작하는 코드
		// View 	: 사용자에 의해 조작되고 보여지는 부분
		// Control	: 제어 및 분기 관련 코드

		Scanner sc = new Scanner(System.in);
		Manager manager = new Manager();

		while(true) {
			System.out.println("<<Netfilx Simulator>>");
			System.out.println("1. 신규 영화 등록");
			System.out.println("2. 영화 목록 출력");
			System.out.println("3. 영화 검색 (제목으로 검색)");
			System.out.println("4. 정보 수정 (제목으로 수정)");
			System.out.println("5. 영화 삭제 (제목으로 삭제)");
			System.out.println("0. 종료");
			System.out.print(">>");

			int menu = Integer.parseInt(sc.nextLine());

			if(menu==1) {

				manager.addMovie(new Movie("11111", "b", 8.0));
				manager.addMovie(new Movie("12121", "e", 9.0));
				manager.addMovie(new Movie("13141", "f", 7.0));

				//	manager.addMovie(new Movie(title,genre,score));
				//	movies[index++] = new Movie(title,genre,score);


			} else if(menu==2) {
				ArrayList<Movie> movies = manager.getMovies();

				System.out.println("제목\t장르\t평점");
				for(Movie m : movies) {
					System.out.println(m.getName() + "\t"+
							m.getGan()+ "\t"+
							m.getStar());
				}
				//				for(int i =0; i< manager.getIndex(); i++) {
				//					System.out.println(movies[i].getName()+"\t"+ movies[i].getGan()+"\t"+ movies[i].getStar());
				//				}

			}else if(menu==3) {		// 검색

				System.out.println("검색할 영화 제목 : ");
				String title = sc.nextLine();

				ArrayList<Movie> result = manager.serchByTiltle(title);

				System.out.println("제목\t장르\t평점");

				if(result.size() == 0) {
					System.out.println("해당 제목의 영화는 존재하지 않습니다.");
				}else {
					for(Movie m : result) {
						System.out.println(m.getName() + "\t"+
								m.getGan()+ "\t"+
								m.getStar());

					}

				}


				//				ArrayList<Movie> movies = manager.getMovies();
				//				System.out.println("검색할 영화 이름 : ");
				//				String str = sc.nextLine();
				//
				//				System.out.println("제목\t장르\t평점");
				//				for(Movie m : movies) {
				//					if(m.getName().equals(str)) {
				//						System.out.println(m.getName() + "\t"+
				//								m.getGan()+ "\t"+
				//								m.getStar());
				//					}		
				//				}

			}else if(menu==4) {
				System.out.println("수정할 영화 이름 : ");
				String title = sc.nextLine();

				int index = manager.getIndexByTitle(title);

				if(index == -1) {
					System.out.println("해당 제목의 영화는 존재하지 않습니다.");
				}else {
					System.out.println("변경할 제목 : ");
					String modTilte = sc.nextLine();

					System.out.println("변경할 장르 : ");
					String modGenre = sc.nextLine();

					System.out.println("변경할 평점 : ");
					double modScore = Double.parseDouble(sc.nextLine());

					manager.updateByIndex(index, new Movie(modTilte,modGenre,modScore));
				}

			}else if(menu==5) {
				
				System.out.println("삭제할 영화 제목 : ");
				String title = sc.nextLine();
				
				int result = manager.deleteByTitle(title);
				if(result == -1) {
					System.out.println("삭제하려는 영화가 존재하지 않습니다.");
				}
				
			}else if(menu ==0) {
				System.out.println("프로그램을 종료");
				System.exit(0);
			}
		}
	}

}

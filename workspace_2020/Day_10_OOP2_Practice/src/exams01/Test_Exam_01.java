package exams01;

import java.util.Scanner;

public class Test_Exam_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Movie [] movies = new Movie[5];
		int index=0;

		while(true) {
			System.out.println("<<Netfilx Simulator>>");
			System.out.println("1. 신규 영화 등록");
			System.out.println("2. 영화 목록 출력");
			System.out.println("3. 영화 검색 (제목으로)");
			System.out.println("4. 영화 제목 수정");
			System.out.println("5. 삭제 ");
			System.out.println("0. 종료");
			System.out.print(">>");

			int menu = Integer.parseInt(sc.nextLine());

			if(menu==1) {
				if(movies[index]==null) {

					System.out.println("영화 제목 : ");
					String title = sc.nextLine();
					System.out.println("영화 장르 : ");
					String genre = sc.nextLine();
					System.out.println("영화 평점 : ");
					double score = Double.parseDouble(sc.nextLine());

					movies[index] = new Movie(title,genre,score);
					index++;
				}

			} else if(menu==2) {
				
				 System.out.println("제목\t장르\t평점");
				for(int i =0 ; i < index; i++) { //movies[i] != null; index를 꽉채우면 오류가 난다.
					System.out.println(movies[i].getName()+"\t"+movies[i].getGan()+"\t"+movies[i].getStar());
				}
			}else if(menu==3) {
				System.out.println("검색하려는 영화 제목 : ");
				String title = sc.nextLine();

				System.out.println("제목\t장르\t평점");
	            for(int i = 0; i < index; i++) {
	               if(movies[i].getName().equals(title)) {
	                  System.out.println(movies[i].getName() +"\t"+movies[i].getGan()+"\t"+movies[i].getStar());
	               }
	            }


			}else if(menu==4) {
				System.out.println("수정하고자 하는 영화 제목 : ");
				String title = sc.nextLine();
				for(int i=0; i< index; i++) {
					if(movies[i].getName().equals(title)) {
						System.out.println("변경할 제목 : ");
						String updateTitle = sc.nextLine();
						
						System.out.println("변경할 장르 : ");
						String updateGenre = sc.nextLine();
						
						System.out.println("변경할 평점 : ");
						double updateScore = Double.parseDouble(sc.nextLine());

						movies[i] = new Movie(updateTitle,updateGenre,updateScore);
						break;
					}
				}
			}else if(menu ==5) {
				System.out.println("삭제할 영화 제목 : ");
				String title = sc.nextLine();

				for(int i=0; i<index; i++) {
					if(movies[i].getName().equals(title)) {
						for(int j = i; j < index; j++) {
							if(j==index-1) {
								movies[j] = null;
								index--;
								break;
							}
							movies[j] = movies[j+1];
						}
					}
				}
			}else if(menu ==0) {
				System.out.println("프로그램을 종료");
				System.exit(0);
			}

		}
	}
}

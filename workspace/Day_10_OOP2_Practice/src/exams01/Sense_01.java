package exams01;

import java.util.Scanner;

public class Sense_01 {
   

   
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      Movie[] movies = new Movie[5];
      
      int index = 0;
      while (true) {
         System.out.println("<< Netflix Simulator >>");
         System.out.println("1. 신규 영화 등록");
         System.out.println("2. 영화 목록 출력");
         System.out.println("3. 영화 검색 ( 제목으로 검색 )");
         System.out.println("4. 정보 수정 ( 제목으로 검색 )");
         System.out.println("0. 종료");
         System.out.print(">>>");

         int menu = Integer.parseInt(sc.nextLine());


         if (menu==1) {
            
            movies[index] = new Movie("Avatar","SF",9.0);
            index++;
            movies[index] = new Movie("영웅","Drama",10.0);
            index++;
            movies[index] = new Movie("범죄도시2","Action",8.0);
            index++;
            
         }else if (menu == 2) {
            
            System.out.println("제목\t장르\t평점");
            for(int i = 0;i < index;i++) {
               System.out.println(movies[i].getName() + "\t" + movies[i].getGan() + "\t" + movies[i].getStar());
            }
         }else if (menu == 3) {
            
            System.out.print("검색하려는 영화 제목 : ");
            String title = sc.nextLine();
            
            System.out.println("제목\t장르\t평점");
            for(int i = 0; i < index; i++) {
               if(movies[i].getName().equals(title)) {
                  System.out.println(movies[i].getName() +"\t"+movies[i].getGan()+"\t"+movies[i].getStar());
               }
            }
            
         }else if (menu == 4) {
            
            System.out.print("수정하고자 하는 영화 제목 : ");
            String title = sc.nextLine();
            
            for(int i = 0;i < index;i++) {
               if(movies[i].getName().equals(title)) {
                  
                  System.out.print("변경할 제목 : ");
                  String updateTitle = sc.nextLine();
                  
                  System.out.print("변경할 장르 : ");
                  String updateGenre = sc.nextLine();
                  
                  System.out.print("변경할 평점 : ");
                  double updateScore = Double.parseDouble(sc.nextLine());
                  
                  movies[i] = new Movie(updateTitle, updateGenre, updateScore);
                  break;
               }
            }
         }else if(menu == 5) {
            
            System.out.print("삭제할 영화 제목 : ");
            String title = sc.nextLine();
            
            for(int i = 0;i < index;i++) {
               if(movies[i].getName().equals(title)) {
                  for(int j = i;j < index;j++) {
                     if(j == index-1) {
                        movies[j] = null;
                        index--;
                        break;
                     }
                     movies[j] = movies[j+1];
                  }
                  break;
               }
            }
         }else if (menu == 0) {
            System.out.println("Netflix 를 종료합니다.");
            System.exit(0);
         }else  {
            System.out.println("잘못 입력하셨습니다.");
         }
         continue;
      }



   }
}
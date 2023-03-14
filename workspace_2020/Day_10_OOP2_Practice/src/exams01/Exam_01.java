package exams01;

public class Exam_01 {

	// Movie 클래스 설계
	// 영화 제목
	// 장르
	// 평점
	// 정보 은닉 적용후 , getter / setter / constructor 모두 생성
	// custom 패키지에 작성해주세요.
	public static void main(String[] args) {

//		Movie mov = new Movie("포켓몬 ","에로 ",9.0);	
//		Movie mov2 = new Movie("영웅 ","드라마 ",8.42);
//		System.out.println(mov.getName()+mov.getGan()+mov.getStar());		
//		System.out.println(mov2.getName()+mov2.getGan()+mov2.getStar());
		
//		Movie [] movies = new Movie[2];		// movie 변수 2개만들고, 값은 x 
		Movie [] movies2 = new Movie[] {
	//			new Movie("아바타2","SF/액션",8.82), 
	//			new Movie("애마","부인",9.99)
				};
	//	movies2[1].setStar(100);
		
		for(int i =0; i< movies2.length; i++) {	
			System.out.println(movies2[i].getName()+"/"+movies2[i].getGan()+"/"+movies2[i].getStar());
		}
			
	}
}

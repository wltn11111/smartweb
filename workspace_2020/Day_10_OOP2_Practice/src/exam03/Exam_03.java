package exam03;

public class Exam_03 {

	// Contact 클래스 설계
	// 이름 전화번호 이메일
	// getter / setter / constructor / 정보은닉
	
	// 홍길동 / 01012344321 / hong@naver.com
	// 조성태 / 01090062139 / stj@gmail.com
	
	public static void main(String[] args) {
		
		Contact con = new Contact("홍길동","01012344321", "hong@naver.com");
		
		System.out.println(con.getName()+"/"+con.getNum()+"/"+con.getMail());
		
		Contact con2 = new Contact("조성태","01090062139", "hong@naver.com");
		System.out.println(con2.getName()+"/"+con2.getNum()+"/"+con2.getMail());
		
		
	}
		
}

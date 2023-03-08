import java.util.Scanner;

public class Quiz_07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("이름 : ");
		String name = sc.nextLine();	//모든 입력을 꺼내서 다음 입력가능.
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();			//버퍼에서 숫자만 꺼내서 \r\n을 안꺼냄.
		// sc.nextInt()사용시 sc.nextline(); 사용해줘야 \r\n 처리가능.
		
						
/*		String name = sc.nextLine();
		
		double kor = Integer.parseInt(sc.nextLine()); // 대입되면서 뒤에 .0을 붙인다 (프로모션)
		// Double.parseDouble(); 입력을 소수점으로 받고싶으면 더블형의 도구를 사용해야함.
		int eng = Integer.parseInt(sc.nextLine());
		int math = Integer.parseInt(sc.nextLine());		
		
		double sum = (kor+eng+math);
		double avg = sum/3;
		
		System.out.println("======================");
		System.out.println("이름 : "+ name);
		System.out.println("======================");
		System.out.println("국어 : "+ kor);
		System.out.println("영어 : "+ eng);
		System.out.println("수학 : "+ math);
		System.out.println("======================");
		System.out.println("합계 : "+ sum);
		System.out.println("평균 : "+ avg);
*/
		
		
	}
}

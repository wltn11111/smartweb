import java.io.IOException;

public class Exam_06 {
	public static void main(String[] args) throws IOException { 
													// IOException에 던지다
/*		System.out.print("한 글자를 입력해주세요 : "); 	// read();입력전에 안내해야함.
		int input = System.in.read();				// 입력될 숫자(int형) 하나 , 입력값을 input에 담을수있다.
	//	char ch = (char)input;
		
		System.out.println("입력하신 문자의 " + (char)input + " 아스키코드 10진수는 " + input + " 입니다.");
	*/	// 유저인터테이스 UI
		
		System.out.print("한 글자를 입력해주세요 : ");
		int input1 = System.in.read();
		System.out.println("입력한 문자는 : " + input1);
												// A입력하면 A \r\n 같이 입력이되어서 3번째까지는 입력불가.
		System.out.print("한 글자를 입력해주세요 : ");
		int input2 = System.in.read();
		System.out.println("입력한 문자는 : " + input2);
		
		System.out.print("한 글자를 입력해주세요 : ");
		int input3 = System.in.read();
		System.out.println("입력한 문자는 : " + input3);
		
		System.out.print("한 글자를 입력해주세요 : ");
		int input4 = System.in.read();
		System.out.println("입력한 문자는 : " + input4);
		
	}
}

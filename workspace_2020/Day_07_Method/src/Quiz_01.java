
public class Quiz_01 {

	public static int countchar(String co, char ch) {
		int count =0;
		for(int i =0; i < co.length(); i++) {
			if(co.charAt(i)==ch) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		String str = "gbiawerg;kjfbjkheghlnaejsdigvnaerjbfuyasvfbiksergkfvEAIUfba;jlwrbguoaqwgfiuawernhklsbnzbufvDSgnzk;dfhnzbvzgm";

		int count = countchar(str,'b');
		System.out.println("알파벳의 개수 : " + count);
	}
}
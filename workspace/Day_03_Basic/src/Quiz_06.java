import java.util.Scanner;

public class Quiz_06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ãâ·Â È½¼ö : ");
		int a = Integer.parseInt(sc.nextLine());
		int i=0;
		while(i < a) {
			System.out.println("hellow java while : " + i);
			i++;
		}
	}
}

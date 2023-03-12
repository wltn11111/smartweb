import java.util.Scanner;

public class Quiz_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("===1~n까지의 합 구하기===");

		System.out.print("n 입력 : ");
		int n = Integer.parseInt(sc.nextLine());

		int i=1;
		int sum=0;

		while(i<=n) {
			sum+=i;
			i++;
		}
		System.out.println("1~100까지의 합은 "+ sum);
	}
}

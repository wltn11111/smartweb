import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int x = 0;
//		int y = 0;
//		int z = 0;
		
		int[] arr = new int[3];
		
		
		for(int i=0; i < arr.length; i++) {
			System.out.print("arr["+ i +"] : "  );
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		
		System.out.println("입력된 값은 ");
		for(int i =0; i < arr.length; i++) {
			System.out.println("arr["+ i +"] : " + arr[i]);
		}
		
			
	/*	System.out.print((char)(i+120) + " : ");
		arr[0] = Integer.parseInt(sc.nextLine());
		
		System.out.print("y : ");
		arr[1] = Integer.parseInt(sc.nextLine());
		
		System.out.print("z : ");
		arr[2] = Integer.parseInt(sc.nextLine());
		
		System.out.println("입력된 값은 ");
		System.out.println("x : " + arr[0]);
		System.out.println("y : " + arr[1]);
		System.out.println("z : " + arr[2]);
		
		*/
	}
}

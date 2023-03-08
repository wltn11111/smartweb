
public class Exam_02 {
	public static void main(String[] args) {
		
		// int형 변수 3칸짜리를 arr1로 작성하고,
		// 0 : 48 , 1:99, 2:33을 저장한 후
		// 화면에 출력해봅시다.
		
		// String 형 변수 2칸짜리를 arr2 로 작성하고,
		// 0: "Hellow", 1: "World" 를 저장한 후
		// 화면에 출력해 봅시다.
		
		// char 형 변수 5칸짜리를 arr3로 작성하고,
		// 0 : 'A' 1:'r' 2:'r' 3: 'a' 4: 'y' 를 저장한 후
		// 화면에 출력해 봅시다.
		
		int [] arr1 = new int[] {48,99,33};
		String [] arr2 = new String[] {"Hellow","World"};
		char [] arr3 = new char[] {'A','r','r','a','y'};
		
		for(int i=0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		for(int j=0; j<arr2.length; j++) {
			System.out.print(arr2[j] + " ");
		}
		System.out.println();
		for(int k=0; k<arr3.length; k++) {
			System.out.print(arr3[k]);
		}
	}
}


public class Quiz_01 {
	public static void main(String[] args) {
		
		// int형 변수 100개를 arr1 로 생성하고,
		// 1부터 100까지 저장한 후 출력해보세요.
		int [] arr1 = new int [100];
		
		for(int i=0; i<arr1.length; i++) {
			
			arr1[i]+=i;
			System.out.println(arr1[i]+1);
		}
		
		// char 형 변수 26개를 arr2로 생성하고,
		// 알파벳 A 부터 Z까지 저장한 후 출력해보세요.
		char [] arr2 = new char[26];
	//	arr2[0] = 'A';	
		for(int j=0; j < arr2.length; j++) {
	//	arr2[j]+= 1;
			arr2[j] = (char)(65+j);
		System.out.println(arr2[j]);
		}
		
		int [] arr3 = new int[100];
		
		for(int i=0; i < arr3.length; i++) {
			arr3[i]= 100-i;
			System.out.println(arr3[i]);
		}
	}
}

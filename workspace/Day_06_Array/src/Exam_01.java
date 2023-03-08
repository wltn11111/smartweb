
public class Exam_01 {
	public static void main(String[] args) {

		// 만들어진 배열에 주소를 arr에 저장
		// 나는 지금 heap 메모리를 사용하겠다 -> new
		int [] arr = new int[] {10,20,30,40};// <-- 배열 생성 문법 : int형 변수 4개 생성 (참조변수를 만들었다)

		//		arr[0] = 10;
		//		arr[1] = 20;
		//		arr[2] = 30;
		//		arr[3] = 40;

		

		// 아래 코드를 반복문으로 변경해서 출력
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		//		System.out.println(arr[1-1]);
		//		System.out.println(arr[3/2]);
		//		System.out.println(arr[(int)(Math.random())*3]);
		//		System.out.println(arr[Integer.parseInt(sc.nextline())]);
		//		System.out.println(arr[a]);


	}
}







// 메모리영역은 총4개 
// stack, data, heap, text
// stack : 작고 고정된 값 쓰기 용이
// heap : 가변적이고 값이 큼

// String:  값의 주소를 쓴다. 참조형 (heap) 
// Scanner sc = new Scanner(System.in); 여기서 new도 heap
// String str = new String("Hellow World"); 나중에 배울 문법.

// offset : 기준점으로 부터 얼마나 떨어져있는가


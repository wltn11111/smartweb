import java.util.ArrayList;

public class Exam_02 {
	public static void main(String[] args) {
		// 다형성, 객체로 저장이됨.
		// Object : 모든 클래스타입에 최고상위클래스
		//<> 사용시 정의가능.
//		ArrayList<ArrayList<String>> arr = new ArrayList<>();
		ArrayList<String> arr = new ArrayList<>();	
		
		arr.add("Hello");
		arr.add("Wold");
		arr.add("Collection");
	
//		for(int i=0; i< arr.size(); i++) {
//			System.out.println(arr.get(i));
//		}
		
		// : 오른쪽엔 데이터가 많은것
		// : 왼쪽엔 데이터를 받을 변수
		// for rich문 : Collection이 있어야 가능, 문법적으로 심플, 반복횟수 제어 불가
		for(String str : arr) {		
			System.out.println(str);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println(((String)arr.get(2)).length());
//		System.out.println(arr.get(2).length());
		// 다형성으로인해 다운캐스팅을 해야하는 번거로움이있음. 
		
		// size() 가 총 길이
		// lengs() 가 내용 길이
		
//		System.out.println(arr.get(0));
//		System.out.println(arr.get(1));
//		System.out.println(arr.get(2));
		
//		arr.remove(0);
//		arr.add(1,"Jva");
//		
//		System.out.println(arr.get(0));
//		System.out.println(arr.get(1));
//		System.out.println(arr.get(2));
//		
//		System.out.println(arr.size()); //arr의 갯수
		
	}
}


public class Exam_01 {
	public static void main(String[] args) {

		here: while(true) { 		// 라벨 브레이크
			for(int i=1; i <=10; i++) {
				System.out.println(i);
				if(i == 5) {
					break here;
				}
			}
		}
	}
}




/*
int i;
for(i=1; i<=10; i++) {
	int a = 10;		// 지역변수는 중괄호 끝나면 사라진다.
	System.out.println(a); // 출력 a++ 해도 값 10.
	a++; //11
 */
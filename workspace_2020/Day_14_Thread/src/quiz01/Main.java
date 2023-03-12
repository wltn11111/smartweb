package quiz01;


class Work extends Thread{
	public void PlusThread() {
		for(int i =1; i<=10; i++) {
			System.out.print("+");
		}
	}
	
}
class Work2 extends Thread{
	public void MinusThread() {
		for(int i =1; i<=10; i++) {
			System.out.print("-");
		}
	}
	
}

class Work3 extends Thread{
	public void MinusThread() {
		for(int i =1; i<=10; i++) {
			System.out.print("*");
		}
	}
	
}

public class Main {
	public static void main(String[] args) {


		// + 를 출력하는 PlusThread
		// - 를 출력하는 MinusThread
		// * 를 출력하는 MplyThread
		// 를 각각 생성하여 각각 100개씩 기호를 동시에 출력하게 만들어 봅시다.
		Work wo = new Work();
		Work2 wo2 = new Work2();
		Work3 wo3 = new Work3();
		
		wo.start();
		wo2.start();
		wo3.start();
		
		

	}
}

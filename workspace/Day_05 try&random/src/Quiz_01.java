
public class Quiz_01 {
	
	public static int myRand(int min, int max) {
		return (int)(Math.random()*(max-min+1)+min);
	}
	
	public static void main(String[] args) {
		
		// 5 ~ 10 난수
		// (int)(Math.random() * (10-5+1)+5);
		// myRand(5,10); <-- 5 ~ 10 사이의 난수
		
		for(int i =0; i < 20; i++) {
			System.out.print(myRand(0,9) + "\t"); 	// 0 ~ 9
			System.out.print(myRand(1,10) + "\t");	// 1 ~10
			System.out.print(myRand(20,35) + "\t");	// 20 ~ 35
			System.out.println(myRand(0,1));			// 0 or 1
			
		}
		
/*		double rand = Math.random();
		
		// 0~9 까지의 랜덤수 
		System.out.println("0 ~ 9까지의 랜덤수 : " + ((int)(rand*10)));
		// 1~10 까지의 랜덤수 
		System.out.println("1 ~ 10까지의 랜덤수 : " + ((int)(rand*10)+1));
		// 20~35까지의 랜덤수
		System.out.println("20 ~ 35까지의 랜덤수 : " + (int)(rand*(35-20+1)+20));
		// 0 또는 1
		System.out.println("0또는 1 : " + (int)(rand*2));
		*/
		
	}
}

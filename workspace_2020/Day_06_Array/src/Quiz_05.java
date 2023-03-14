
public class Quiz_05 {
	public static void main(String[] args) {


		// 1 ~ 45 사이의 난수를 중첩되지 않게 7개를 뽑아서 출력하세요.
		// 오늘의 추천 로또 번호 만들기
	/*	int [] arr = new int [7];
		int lotto;

		here:	for(int i =0; i < arr.length; i++) {
			lotto = (int)((Math.random()*45)+1);
			for(int j=0; j<arr.length; j++) {
				if(lotto==arr[j]) {
					i--;
					continue here;
				}
			}
			arr[i] = lotto;
			System.out.println("추천 로또 번호 : " + arr[i]);
		}*/
		int[] nums = new int[45];
		for(int i =0; i<nums.length; i++) {
			nums[i]=i+1;
		}
		
		for(int i=0; i < nums.length*10; i++) {
			int x = (int)(Math.random()*45);
			int y = (int)(Math.random()*45);
			
			int tmp = nums[x];
			nums[x] = nums[y];
			nums[y] = tmp;
			
			
		}
		System.out.println("추천 로또 번호 : \t" + nums[0] + "\t"+
												nums[1] + "\t"+
		nums[2] + "\t"+
		nums[3] + "\t"+
		nums[4] + "\t"+
		nums[5] + "\t");
		System.out.println("보너스 번호 : \t" + nums[6]);
	}
}

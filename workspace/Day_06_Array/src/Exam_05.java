
public class Exam_05 {
	public static void main(String[] args) {
		// 5개의 수중에 3개 랜덤 뽑기
		
		int [] nums = new int[] {1,2,3,4,5};
		
		for(int i=0; i <nums.length*10; i++) {
			int x = (int)(Math.random()*5);
			int y = (int)(Math.random()*5);
			
			int tmp = nums[x];
			nums[x] = nums[y];
			nums[y] = tmp;			
		}	
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);		
	}
}



/*
for(int i =0; i< 3; i++) {
			int ran = (int)((Math.random()*5)+1);
			System.out.println(ran);
		}
*/
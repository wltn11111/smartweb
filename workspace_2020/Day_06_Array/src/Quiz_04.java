
public class Quiz_04 {
	public static void main(String[] args) {
		int [] nums = new int[] {15,24,35,99,86,34,13,27,46,66}; 

		for(int i=0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		for(int j=0; j < nums.length-1; j++) {
			for(int i =0; i < nums.length-1; i++) {
				if(nums[i] > nums[i+1]) {
					int tmp = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = tmp;
				}
			}
		}
		for(int i=0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}

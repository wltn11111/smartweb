
public class Quiz_03 {
	public static void main(String[] args) {
		/*		int [] arr1 = new int[] {15,24,35,99,86,34,13,27,46,66,
								13,15,24,27,34,35,46,66,86,99}; */
		int [] nums = new int[] {24,86,13,46};

		System.out.print("정렬 전 : ");
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		// --------------------정렬 코드 (Bubble Sort)

		for(int i =0; i < nums.length-1; i++) {
			
			for(int j=0; j < nums.length-1; j++) {
				if(nums[j] > nums[j+1]) {
					int tmp = nums[j] ;
					nums[j] = nums[j+1];
					nums[j+1] = tmp;
				}
			}

		}
		// --------------------정렬 코드

		System.out.println("===============");
		System.out.print("정렬 후 : " );
		for(int i=0; i <nums.length; i++) {
			System.out.print(nums[i] + " ");

		}
	}
}

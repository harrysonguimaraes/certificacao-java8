public class ArrayExample {
	
	public static void main(String[] args) {
		
		int[] nums = new int[3];
		//cria 3 int com o valor default do int: 0;
		System.out.println(nums);


		for(int n : nums) {
			System.out.println(n);
		}

		for(int i = 0; i < nums.length; i ++) {
			System.out.println(nums[i]);
		}
		// Como nums é um ponteiro, para imprimir os valores, deve-se usar um for.
		// Pode ser for comum ou foreach
	}
}
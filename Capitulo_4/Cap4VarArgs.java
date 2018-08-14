public class Cap4VarArgs {
	
	public void argsVar(int num, int... nums) {

		System.out.println(nums.length);
	}

	public static void main(String[] args) {
		
		Cap4VarArgs argus = new Cap4VarArgs();

		argus.argsVar(1);
		argus.argsVar(2, 5);

		int[] num = {2,4,5,68,9};

		argus.argsVar(1, 4, 5, 6);
		argus.argsVar(1, num);
	}
}
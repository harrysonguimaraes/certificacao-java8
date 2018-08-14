public class StaticInit {
	
	private static final int NUM_SECONDS_PER_HOUR;

	static {

		int numSeconds = 60;
		int numMinutes = 60;
		NUM_SECONDS_PER_HOUR = numMinutes * numSeconds;
	}


	public static void main(String[] args) {
		
		System.out.println(NUM_SECONDS_PER_HOUR);

	}
}
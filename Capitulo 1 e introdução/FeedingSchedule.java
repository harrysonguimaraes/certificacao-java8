public class FeedingSchedule {
	
	public static void main(String[] args) {
		
		int x = 10, j =0;

		OUTER :  for(int i = 0; i <3;)
			INNER: do {
				i++; j++;

				if (x > 10) break INNER;

				x += 4;
				j++;
			} while(j <= 2);

			System.out.println(x);
	}
}
public class SearchSimple {
	
	public static void main(String[] args) {
		
		MY_SHINE_LABEL:
		System.out.println("Prnta label!");

		int x = 0; 
		
		if (x == 0) {
			x++;
			goto MY_SHINE_LABEL;
		}
	}
}
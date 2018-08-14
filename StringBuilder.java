public class StringBuilder {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();

		for(char atual = 'a'; atual <= 'z'; atual++) {

			sb.append(atual);
		}

		System.out.println(sb);
	}
}
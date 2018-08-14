import java.util.*;

public class ArraysSort {
	
	public static void main(String[] args) {
		
		int [] numeros = {10, 7, 0, 5, 9};

		System.out.println(Arrays.toString(numeros));

		Arrays.sort(numeros);

		System.out.println(Arrays.toString(numeros));


		System.out.println(Arrays.binarySearch(numeros, 0));
		System.out.println(Arrays.binarySearch(numeros, 1));
	}
}
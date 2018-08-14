import java.util.*;

public class GrassHopper {
	
	public GrassHopper(String n) {
		name = n;
	}

	public static void main(String[] args) {
		
		GrassHopper one = new GrassHopper("g1");
		GrassHopper two = new GrassHopper("g2");

		one = two;

		two = null;
		one = null;

	}

	private String name;
}
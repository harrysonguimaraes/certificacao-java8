public class WrapperClasses {
	
	public static void main(String[] args) {
		
		boolean boo = Boolean.parseBoolean("true");

		byte byteNum = Byte.parseByte("1");

		short shortNum = Short.parseShort("2");

		int intNum = Integer.parseInt("3");

		long longNum = Long.parseLong("5");

		float floatNum = Float.parseFloat("10.0");

		double doubleNum = Double.parseDouble("12.3e");

		System.out.println(boo + "\n" + byteNum + "\n" + shortNum + "\n" + intNum + "\n" + longNum + "\n" + floatNum + "\n" + doubleNum);
	}
}
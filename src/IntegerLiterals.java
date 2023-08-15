/**program to display a welcome message
 * @author venkatesh@Techzenure
 * @since 27th jul 2023
 */
public class IntegerLiterals {

	public static void main(String[] args) {
		System.out.println(12);
		System.out.println(012);
		System.out.println(0x12);
		System.out.println(0X12);
		System.out.println(0b11);
		System.out.println(0B11);
		
		System.out.println("Octal Decimal Value Of 65 = " + Integer.toOctalString(65));
		System.out.println(0101);
		System.out.println("Hexa Decimal Value Of 65 = " + Integer.toHexString(65));
		System.out.println("Binary Decimal Value Of 65 = " + Integer.toBinaryString(65));
		System.out.println("Octal Decimal Value Of 75 = " + Integer.toOctalString(75));
		System.out.println("Hexa Decimal Value Of 66 = " + Integer.toHexString(66));
		System.out.println("Binary Value Of 66 = " + Integer.toBinaryString(66));
	}

}

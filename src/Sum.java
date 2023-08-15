import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First No: ");
		int fno = sc.nextInt();
		
		System.out.println("Enter Second no: ");
		int sno = sc.nextInt();
		
		int s = fno + sno;
		
		System.out.println("sum = " + s);
		System.out.println(fno + "+" + sno + "=" + s);
	
	}

}

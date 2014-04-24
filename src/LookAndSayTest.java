import java.util.Scanner;
public class LookAndSayTest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a digit:");
		String digit = input.next();
		System.out.println("Please enter sequence number:");
		int sequence=input.nextInt();
		
		LookAndSay test = new LookAndSay(digit);
		for (int i = 0; i < sequence; i++) 
		{
			test.las();
			test.display();
		}
	}

}
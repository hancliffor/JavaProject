package emailapp;
import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		String str[]=sc.nextLine().split(" ");
		Email em1=new Email(str[0],str[1]);
		 System.out.println(em1.showInfo() );
	}
}


import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		int num=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number");
		while(num!=5) {
			num=sc.nextInt();
			System.out.println("its not 5,enter 5");
			
		}
		System.out.println("got it");
			 
	}

}

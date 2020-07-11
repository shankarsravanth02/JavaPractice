import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Anofile {

	public static void main(String[] args) throws FileNotFoundException {
		String pro="C:/Users/SONY/Desktop/somepro.txt";
		File program=new File(pro);
		Scanner sc=new Scanner(program);
		String letter=sc.next();
		System.out.println("here i m"+letter);
		int count=1;
		while(sc.hasNextLine()) {
			String lined=sc.nextLine();
			System.out.println(count+" : "+lined);
			count++;
		}
		System.out.println(count-1 +" : total lines");
       sc.close();
	}

}

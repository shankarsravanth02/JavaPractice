import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class scanfile {

	public static void main(String[] args) throws FileNotFoundException {
		String file="C:/Users/SONY/Desktop/myprofile.txt";
		File matter=new File(file);
		Scanner sc=new Scanner(matter);
	while(sc.hasNextLine()) {
		String lines=sc.nextLine();
      System.out.println(lines);
	}
    sc.close();
	}
}

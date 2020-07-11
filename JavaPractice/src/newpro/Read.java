package newpro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) {
		File file=new File("C:/Users/SONY/Desktop/somepro.txt");
		try (BufferedReader br=new BufferedReader(new FileReader(file))) {
			String line;
			while((line=br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
 			System.out.println("file not found:");
 			System.out.println(e);
		} catch (IOException e) {
			System.out.println("file not read:");
		}

	}

}

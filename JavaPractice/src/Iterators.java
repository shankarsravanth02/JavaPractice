import java.util.Iterator;
import java.util.LinkedList;

public class Iterators {

	public static void main(String[] args) {
		LinkedList<String> its=new LinkedList<String>();
		its.add("alphabets");
		its.add("numbers");
		its.add("genres");
		
		Iterator<String> adds= its.iterator();
		String str=adds.next();
		System.out.print(str);
		System.out.println();

	}

}

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Newlists {

	public static void main(String[] args) {
		List<String> lists=new ArrayList<String>();
		SortedSet<String> sets=new TreeSet<String>();
		//addelements(lists);
		addelements(sets);
		 Collections.sort(lists);
		 
		// showElements(lists);
		 showElements(sets);
	}
		private static void addelements(Collection<String> col) {
			col.add("won");
			col.add("perecntage");
			col.add("55%");
		}
		private static void showElements(Collection<String> col) {
			for(String set:col) {
				System.out.println(set);
			}
		}
		


}

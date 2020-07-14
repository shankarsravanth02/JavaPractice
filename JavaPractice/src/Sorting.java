import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("beta");
		list.add("Alpha");
		list.add("gamma");
	
	Collections.sort(list);
	
	Iterator itr=list.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
	}
	}

}

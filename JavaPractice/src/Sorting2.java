import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sorting2 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(Integer.valueOf(43));
		list.add(Integer.valueOf(21));
		list.add(Integer.valueOf(98));
	
	//Collections.sort(list,Collections.reverseOrder());
	
	Iterator itr=list.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
	}
	}
}

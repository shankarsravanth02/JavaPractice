import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		Set<Integer> Hints=new HashSet<Integer>();
		Set<Integer> Tints=new TreeSet<Integer>();
		System.out.println(Hints.isEmpty());
		Hints.add(22);
		Hints.add(1);
		Hints.add(21);
		Hints.add(2);
		 for(Integer setting:Hints) {
			 System.out.println(setting);
		 }
		 System.out.println(Hints.isEmpty());
		 Set<Integer> Hints1=new HashSet<Integer>();
			Set<Integer> Tints1=new TreeSet<Integer>();
			System.out.println(Hints.isEmpty());
			Hints.add(29);
			Hints.add(11);
			Hints.add(20);
			Hints.add(21);
			for(Integer setting1:Hints1) {
				 System.out.println(setting1);
			 }
		 System.out.println(Hints1.retainAll(Hints1));

	}

}

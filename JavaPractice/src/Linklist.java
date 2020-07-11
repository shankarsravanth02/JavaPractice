import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linklist {

	public static void main(String[] args) {
		List<Integer> arraylist=new ArrayList<Integer>();
		List<Integer> linklist=new LinkedList<Integer>();
		onTime("arraylist",arraylist);
		onTime("linkedlist",linklist);
	}
		private static void onTime(String type, List<Integer> list) {
			 for(int i=0;i<1E5;i++) {
				 list.add(i);
			 }
			 long start=System.currentTimeMillis();
			 for(int i=0;i<1E5;i++) {
				 list.add(i);
			 }
			 long end=System.currentTimeMillis();
			 System.out.println("time taken:"+(end-start)+" ms"+" in type "+type);
		 }


}

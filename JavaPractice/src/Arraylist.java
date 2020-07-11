import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> ints=new ArrayList<Integer>();
		ints.add(20);
		ints.add(35);
		ints.add(65);
		System.out.println(ints.get(2));
	for(int i=0;i<ints.size();i++) {
		 System.out.println(ints.get(i));
	}
   for(Integer value:ints) {
	   System.out.println(value);
   }
	}

}

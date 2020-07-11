import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sortinglist {

	public static void main(String[] args) {
		List<String> brands=new ArrayList<String>();
		brands.add("samsung");
		brands.add("xiomi");
		brands.add("oneplus");
		brands.add("lava");
		Collections.sort(brands);
		for(String brand:brands) {
			System.out.println(brand);
		}
      
	}

}

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class NestedDS {
	public static String[] devices= {
		"air conditioners","Mobiles","televisions"
	};
	public static String[][] brands= {
			{"voltas","tata","bluestar"},
			{"apple","samsung","redmi"},
			{"LG","samsung","oneplus"}
	};

	public static void main(String[] args) {
		
    Map<String, Set<String>> entries=new HashMap<String, Set<String>>();
    
     for(int i=0;i<devices.length;i++) {
    	 String device=devices[i];
    	 String[] brand=brands[i];
    	 Set<String> brandset=new LinkedHashSet<String>();
    	  for(String setBrand:brand) {
    		  brandset.add(setBrand);
    		  entries.put(device,brandset);
    	      Set<String> brandsset=entries.get("Mobiles");
    	          for(String brands1:brandsset) {
    		          System.out.println(brands1);
    	}

     }
    
	}

}
}
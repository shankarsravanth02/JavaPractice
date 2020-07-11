import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"one");
		map.put(3,"Three");
		map.put(5,"Five");
		map.put(7,"seven");
		System.out.println(map.get(null));
		for(Map.Entry<Integer,String> entry: map.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
		map.remove(5);
		System.out.println(map.isEmpty());
		System.out.println(map);
		map.clear();
		System.out.println(map);
		System.out.println(map.isEmpty());

	}

}

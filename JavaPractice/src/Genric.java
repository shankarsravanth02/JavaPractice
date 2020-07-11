import java.util.ArrayList;
class Machine {
	String work() {
		return "Machine working";
	}
}
class Television extends Machine {
	String switchon() {
		return "tv on";
	}
	String off() {
		return "tv off";
	}
}
public class Genric {

	public static void main(String[] args) {
		
             ArrayList<Machine> works=new ArrayList<Machine>();
             works.add(new Machine());
             show(works);
	}

public static void show(ArrayList<Machine> store) {
	for (Machine value:store) {
		System.out.println(value);
	}
 }
}

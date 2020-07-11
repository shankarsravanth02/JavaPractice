
public class Enums {

	public static void main(String[] args) {
		Numbers calling=Numbers.Three;
		switch(calling) {
		case One:
			System.out.println("1");
			break;
		case Three:
			System.out.println("3");
			break;
		case Two:
			System.out.println("2");
			break;
		
		}
		System.out.println(Numbers.One instanceof Numbers );
		System.out.println(Numbers.Two.getSpecify());
		System.out.println(Numbers.One.hashCode());
		System.out.println(Numbers.One.name());
		System.out.println(Numbers.One.ordinal());
		

	}

}

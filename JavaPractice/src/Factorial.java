
public class Factorial {

	public static void main(String[] args) {
		System.out.println(fact(5));
		
	}
	public static int fact(int num) {
		if(num==1)
			return 1;
		return fact(num-1)*num;
	}

}

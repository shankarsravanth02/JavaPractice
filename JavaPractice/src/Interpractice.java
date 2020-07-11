class inter implements Info {
	public void met() {
		System.out.println("in class implemented interface");
	}
}
public class Interpractice {

	public static void main(String[] args) {
	    inter i1=new inter();
	    System.out.println(i1.ID);
	    System.out.println(i1.IDS);
	    i1.met();
	    

	}

}

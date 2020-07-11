class cat{
	String name="tom";
	int age=4;
	void speak() {
		System.out.println("meow");
		System.out.println("name="+name);
		System.out.println("age="+age);
	}
}
class dogs extends cat {
	String name="bhom";
	int age=5;
	void speak() {
		System.out.println("bhow");
		System.out.println("name="+name);
		System.out.println("age="+age);
	}
}

public class Inherit {

	public static void main(String[] args) {
		cat c=new cat();
		c.speak();
		dogs d= new dogs();
		d.speak();
		cat d1=new dogs();
		d1.speak();
System.out.println("completed");
	}

}

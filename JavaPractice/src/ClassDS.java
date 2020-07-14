import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
class prolangs {
	int sno;
	String inventor,lang;
	public prolangs(int sno,String inventor,String lang) {
		this.inventor=inventor;
		this.lang=lang;
		this.sno=sno;
	}
}
public class ClassDS {
       
	public static void main(String[] args) {
		prolangs p1=new prolangs(1,"     James Gosling  ","     JAVA");
		prolangs p2=new prolangs(2,"     Guido van Rossum  ","  Python");
		prolangs p3=new prolangs(3,"     Dennis Ritchie  ","    C");
		prolangs p4=new prolangs(4,"     Ross ihaka  ","        R language");
		prolangs p5=new prolangs(5,"     Brendan Eich  ","      JAVA script");
		prolangs p6=new prolangs(6,"     Ken Thompson  ","      Go lang");
		prolangs p7=new prolangs(7,"     Bjarne Stroustrup  "," C++");
		List<prolangs> info=new ArrayList<prolangs>();
		info.add(p1);
		info.add(p2);
		info.add(p3);
		info.add(p4);
		info.add(p5);
		info.add(p6);
		info.add(p5);
		info.add(p7);
		info.add(p5);
		System.out.println("number of times java script arrived: "+Collections.frequency(info, p5));
		System.out.println("SNO "+"  Name of inventor  "+"  programming language  ");
	    for(prolangs prs:info) {
	    	System.out.println(prs.sno+prs.inventor+prs.lang);
	    }
	}

}

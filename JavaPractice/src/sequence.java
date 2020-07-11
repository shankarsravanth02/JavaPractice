
public class sequence {

	public static void main(String[] args) {
		 String name="Sravanth";
		 char nm[]=name.toCharArray();
		for(int i=0;i<=nm.length-1;i++) {
			for(int j=0;j<=i;j++) {
				if(nm[i]==nm[j]) {
					System.out.println(nm[i]);
				}
			}
		 }


	}

}

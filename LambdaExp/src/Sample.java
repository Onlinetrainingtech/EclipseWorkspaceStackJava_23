import java.util.ArrayList;

public class Sample {

	public static void main(String[] args) {
		
		ArrayList<Integer>k1=new ArrayList<Integer>();
		k1.add(10);
		k1.add(20);
		k1.add(30);
		
		System.out.println("To display the data is::"+k1);
		System.out.println("To size of::"+k1.size());
		
		k1.forEach((n)->{System.out.println(n);});
		

	}

}

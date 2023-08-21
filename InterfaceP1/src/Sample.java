interface B
{
	void get1();
	void get2();
}
 class D1 implements B
{

	public void get1() {
		
		System.out.println("This is get1 function1..");
		
	}

	public void get2() {
		
		System.out.println("This is get2 function2..");
		
	}
	
}
public class Sample {

	public static void main(String[] args) {
		
		D1 f1=new D1();
		f1.get1();
		f1.get2();

	}

}

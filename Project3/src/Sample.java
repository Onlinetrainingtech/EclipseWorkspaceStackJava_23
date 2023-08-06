import java.util.Scanner;

public class Sample {

	
	int pid;
	String pname;
    Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the pid value is::");
	    pid=sc.nextInt();
	    System.out.println("Enter the pname value is::");
	    pname=sc.next();
	}
	void display()
	{
		System.out.println("Your value is::"+pid+""+pname);
	}
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.input();
		s1.display();

	}

}

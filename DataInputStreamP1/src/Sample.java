import java.io.DataInputStream;
import java.io.IOException;

class Demo
{
	DataInputStream dis=new DataInputStream(System.in);
	int empid,salary;
	String empname;
	void get1()throws IOException
	{
		System.out.println("Enter the empid and Salary is::");
		empid=Integer.parseInt(dis.readLine());
		salary=Integer.parseInt(dis.readLine());
		empname=dis.readLine();
	}
	
	void get2()
	{
		System.out.println("Your value is::"+empid+""+salary+""+empname);
	}
}
public class Sample {

	public static void main(String[] args) throws IOException {
		
		Demo d1=new Demo();
		d1.get1();
		d1.get2();

	}

}

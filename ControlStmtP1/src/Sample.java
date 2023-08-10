import java.util.Scanner;

class Demo
{
	int age=61;
	int bns,salary;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		int pid=1002;
		if(pid==1001)
		{
			System.out.println("Your Pid is equal..");
		}
		else
		{
			System.out.println("Your pid is not equal...");
		}
	}
	void get2()
	{
		System.out.println("Enter the age is::");
		age=sc.nextInt();
		if(age>=61)
		{
			System.out.println("Ente the salary::");
			salary=sc.nextInt();
			if(salary>=2000)
			{
				bns=salary+500;
				System.out.println("Your salary is::"+bns);
			}
			else
			{
				bns=salary+1000;
				System.out.println("Your salary is::"+bns);
			}
		}
		else
		{
			System.out.println("Age is low..");
		}
	}
}
public class Sample {

	public static void main(String[] args) {
	
		Demo d1=new Demo();
		//d1.get1();
		d1.get2();

	}

}

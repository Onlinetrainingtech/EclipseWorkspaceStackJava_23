import java.util.Scanner;

public class Sample 
{
  int pid[]=new int[5];
  //String pname[]=new String[5];
  int i,n;
  Scanner sc=new Scanner(System.in);
  void get1()
  {
	  System.out.println("Enter the n value is::");
	  n=sc.nextInt();
	  for(i=0;i<=n;i++)
	  {
		  System.out.println("Enter the array value is::");
		  pid[i]=sc.nextInt();
	  }
  }
  void get2()
  {
	  for(i=0;i<=n;i++)
	  {
		  System.out.println("Your value is::"+pid[i]);
	  }
  }
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.get1();
		s1.get2();

	}

}

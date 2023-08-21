
public class Sample 
{

   void get1(int pid)
   {
	   System.out.println("Get1 value is::"+pid);
   }
   void get1(int cid,String cname)
   {
	   System.out.println("Get2 value is::"+cid+""+cname);
   }
	
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.get1(1001);
		s1.get1(2001,"azar");

	}

}

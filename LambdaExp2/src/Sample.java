interface StringFun
{
	String run(String str);
}
public class Sample {

	public static void main(String[] args) {
		
		StringFun ex=(s)->s+"azar";
		StringFun as=(s)->s+"welcome";
		printFormatted("Hello",ex);
		printFormatted("Hello",as);

	}
	public static void printFormatted(String str,StringFun format)
	{
		String result=format.run(str);
		System.out.println(result);
	}

}

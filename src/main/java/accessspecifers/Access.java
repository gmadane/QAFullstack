package accessspecifers;

public class Access
{
int a; 
int p;
String c;
	public static void main(String [] arg)
	{
		Access a=new Access();
		a.method1(9,8);
		a.method2();
	}
	
	public void method1(int b, int d)
	{
		this.a=b;
		this.p=d;
		System.out.println(a+" "+p);
	}
		
	public void method2()
	{
		System.out.println("hello "+a+" "+p);
	}
}
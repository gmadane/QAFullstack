package array_operations;

public class accessspecifiers {
	
    int classvar=54;
	protected int pro=980;
	public int pub=876;

	public static void main(String[] args) {

		int local=34;
		System.out.println(local);		
	}	
	public void method1()
	{
		System.out.println(classvar);
	}

}
class second extends accessspecifiers
{
	public void second1()
	{
		System.out.println(classvar);
	}
	
}

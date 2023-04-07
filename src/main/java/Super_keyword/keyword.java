package Super_keyword;

public class keyword {

	public static void main(String[] args) 
	{
		child obj=new child();
		obj.display();
	}
}

class parent 
{
	int data=200;
}





class child extends parent
{
	int data =100;
	public void display()
	{
		System.out.println(super.data);
		System.out.println(data);

	}
}
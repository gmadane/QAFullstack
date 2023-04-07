package Super_keyword;

public class childon {
	public static void main(String[] args) 
	{
		childone child=new childone();
		child.display();
	}
}

class parentone
{	
	void message()
	{
		System.out.println(" i am in parent class");
	}
	
}

class childone  extends parentone
{
	void message()
	{
		System.out.println("I am in child class");
	}

	public void display()
	{	
		
		super.message();
	}

}


package Super_keyword;

public class supwithcons {

	public static void main(String[] args) {
		childcons childco=new childcons();
		//childco.print();
	}

}

class parentcon
{
	parentcon()
	{
		System.out.println("Hello I am in contructor parent class");
	}
	

}

class childcons extends parentcon 
{
	childcons()
	{
		super();
	}
	
	
	public void print()
	{
		System.out.println("Hello Print child");
	}
}
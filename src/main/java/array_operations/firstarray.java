package array_operations;

public class firstarray {

	public static void main(String[] args) 
	{
		
		firstarray obj=new firstarray();
		
		//int addition=obj.add(50,4);
		obj.add(50,4);
		obj.add("Ganesh","madane");
		System.out.println(obj.add("Ganesh","madane"));
		
	//	System.out.println(addition);
		
		//obj.add( , )
		 

	}
	//return type void null  
	
	//polymorphism
	
	//overloading overriding 
	
	
	public int add(int num1,int num2)
	{
		num1=num1+num2;
		System.out.println(num1);
		return num1;
	}
	
	public String add(String str1,String str2)
	{
		
		
	//	System.out.println(str1 +"  "+str2);
		
	   return str1 +"  "+str2;
	}

}

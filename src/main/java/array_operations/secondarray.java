package array_operations;

public class secondarray {

	public static void main(String[] args) 
	{
	// array: it is group of element with same datatype 
		int array1[]=new int[4];				
		int array2[]= {1,2,243,5,6,7};
		
		String strarra[]=new String[4];		
		String strarra1[]= {"Mahesh","Bramha","Vishnu"};
		
		char ch1[]=new char[4];		
		char ch21[]= {'M','B','V'};
		
		
		array1[0]=12;
		array1[1]=32;
		array1[2]=98;
		array1[3]=12;		
		
		strarra[0]="Pornima";
		strarra[1]="Apeksha";
		strarra[2]="Rupali";
		strarra[3]="QA";	
		
		
	//   System.out.println(array1.length);
		
	    for(int i=0;i<array1.length;i++)
	    {
	    	System.out.print(array1[i]+" ");
	    }

	    System.out.println();
	    for(int i=0;i<strarra.length;i++)
	    {
	    	System.out.print(strarra[i]+"  ");
	    }

		
		
	
		
		
		
		
		
		//array1[]  // one dimentional 
	   // array1[][]// two dimen
	   //[][][]// three dimen

	}

}

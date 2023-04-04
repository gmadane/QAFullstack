package qa;

public class StringOperations {

	public static void main(String[] args) 
	{
      String str ="My name is Amar akbar anthony";
    
     // System.out.println(str.length());
     //String strarray[]=new String[str.length()];
    // 
   //   
   //   strarray= str.split("");
    //   System.out.println(str);
    //   StringBuilder sbuilder=new StringBuilder("GaneshMadane");
      //StringBuffer sbuffer=new StringBuffer("PornimaLatur");
      // System.out.println(sbuffer.reverse());
 //     System.out.println(sbuilder.reverse());
          
      String rev="ganeshmadane";      
      String strarray1[]=new String[rev.length()];    
      strarray1=rev.split("");      
        System.out.println(strarray1.length);
            
    //  System.out.println(strarray1[20]);
        
      for(int i=strarray1.length-1;i>=0;i--)
      {    	
    	  System.out.print(strarray1[i]+" ");
      }
      
      
     
    
      
      
      
    //  sbuffer="Ganesh madane";
     // sbuilder="pornima";
      		
      
     
      
      
    //  System.out.println(strarray.length);
      
    //  System.out.println(strarray[0]);
	/*
	 * int count=0; for(int i=0;i<strarray.length;i++) {
	 * if(strarray[i].equals("name") || (strarray[i].equals("m"))) { count++;
	 * System.out.println(strarray[i]); } //System.out.println(strarray[i]); }
	 */
      
      
     // System.out.println(count);
      
		
	}

}

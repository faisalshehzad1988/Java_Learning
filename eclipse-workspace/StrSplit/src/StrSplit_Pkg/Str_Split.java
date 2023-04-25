package StrSplit_Pkg;

public class Str_Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			    String strMain = "Alpha, Beta, Delta, Gamma, Sigma";
			    String[] arrSplit = strMain.split(", ");
			    
			    for (int i=0; i < arrSplit.length; i++)
			    {
			      System.out.println(arrSplit[i] );
			    }
			    
			    System.out.print("\n");
			    
			    String[] arrSplit_2 = strMain.split(", ", 3);
			    for (int i=0; i < arrSplit_2.length; i++)
			    {
				      System.out.println(arrSplit_2[i]);
			    
			    }
			    
			    
			    System.out.print("\n");
			    
			    
			    String strMain1 ="Welcome to Java Language Tutorial"; 
			    String[] arrSplit_3 = strMain1.split("\\s");
			        for (int i=0; i < arrSplit_3.length; i++){
			          System.out.println(arrSplit_3[i]);
			        }

	}
}




public class Pattern21 { 
	public static void main(String[] args) { 
		int n=5;
		for(int i=1;i<=n;i++){ 
			for(int s=1;s<=n-i;s++){    
				System.out.print(" "); 	  
				}    
			for(int j=1;j<=i;j++) { 
				System.out.print(j);
				
		} 
			System.out.println();  
		}   		 
	}

} 

OUTPUT: 
    1
   12
  123
 1234
12345

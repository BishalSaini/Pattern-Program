
public class Pattern18 {    
	public static void main(String[] args) { 
		int n=5;
		for(int i=1;i<=n;i++){ 
			for(int j=1;j<=i;j++){   
				System.out.print((char)(96+j)+" "); 	 
			}  
			System.out.println();  
		}
	}  
} 

OUTPUT:
a 
a b 
a b c 
a b c d 
a b c d e 



public class Pattern14 {  
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) { 
			for(int j=1;j<=i;j++) { 
				System.out.print(i%2);
			} 
			System.out.println("");
		}
	}	
}

OUTPUT: 
1
00
111
0000
11111
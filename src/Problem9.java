
public class Problem9 {
	
	public static void Solve(int n){
		int i=0,j=0,k=0;
		long product = 0;
		Boolean found = false;
		int a=0,b=0,c=0;
	
		for(i=1;i<=n;i++) {
			for(j=i+1;j<=n;j++){
				
				k = n-j-i;
				
				if((Math.pow(i, 2) + Math.pow(j, 2)) == Math.pow(k, 2) ){
					if((i+j+k) == n){
						a = i;
						b = j;
						c = k;
						product = a * b * c;
						found = true;
					}
				}
			}
			
			if(found)
				break;
		}
		
		System.out.println(String.format("a: %d b: %d c: %d", a,b,c));
		System.out.println(String.format("Total: %d", a + b + c));
	    System.out.print(String.format("Product: %d", product));
	}

}

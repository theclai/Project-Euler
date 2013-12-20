
public class Problem10 {
	
	private static long SumPrimeNumber(int n,int below){
		
		long totalSum = 0;
		Boolean[] isPrimes = new Boolean[n+1];
		long[] primeNumbers = new long[n*2];
		
		for(int i=2;i<=n;i++){
			isPrimes[i] = true;
		}
		
		for(int i=2;i*i<=n;i++){
			
			if(isPrimes[i]){
				for(int j=i;i*j<=n;j++){
					isPrimes[j*i] = false;
				}
			}
		}
		
		int ct = 0;
		
		for(int i=2;i<n;i++){
			if(isPrimes[i]){
				
				primeNumbers[ct] = i;
				ct++;
			}
		}
		
		for(int i=0;i<primeNumbers.length;i++) {
			if(primeNumbers[i] < below) {
				totalSum += primeNumbers[i];
			}		
		}
		
		return totalSum;
	}
	
	public static void Solve(int n,int bellow){
		
		System.out.print(String.format("Total: %d", SumPrimeNumber(n,bellow)));
	}

}

import java.util.ArrayList;

import javax.naming.BinaryRefAddr;


public class Problem7 {
	
	private static int[] FindPrimes(int n) {
		
		int[] primeNumbers = new int[n+1];
		
		Boolean[] primes = new Boolean[n+1];
	
		for(int i=2;i<=n;i++){
			primes[i] = true;
		}
		
		for(int i=2;i*i<=n;i++){
			if(primes[i]){
				for(int j=i;i*j<=n;j++){
					primes[i*j] = false;
				}
			}
		}
		
		for(int i=2;i<= primes.length-1;i++){
			if(primes[i]){
				primeNumbers[i] = i;
			}
		}
		
		return primeNumbers;
	}
	
	private static int BinarySearch(ArrayList<Integer> array,int key,int left,int right){
		int value = 0;
		int idx = (left + right) / 2;
		
		if(idx > array.size())
			return -1;
		
		int pivot = array.get(idx);
		
		if(left > right)
			return - 1;
		
		if(key  < pivot){
			right = idx - 1;
			return BinarySearch(array, key, left, right);
		}
		else if (key > pivot){
			left = idx + 1;
			return BinarySearch(array, key, left, right);
		}
		else {
			value = array.get(pivot);
		}
		
		return value;
		
	}
	
	public static void Solve(int n,int idx){
		
		int[] prime = new int[n];
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		
		prime = FindPrimes(n);
		
		for(int i=0;i<prime.length;i++){
			if(prime[i] != 0) {
				
				primeList.add(prime[i]);
			}
			
		}
		
		int value = BinarySearch(primeList, idx-1, 0, primeList.size());
		
		System.out.print("Value: "+ value);
	}
}

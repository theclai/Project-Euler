
public class Problem6 {
	
	public static void Solve(){
		
		int natural = 1;
		int totalNatural = 0;
		int n= 100;
		int square=0;
		int totalSquare = 1;
		int total = 0;
		
		for(int i=1;i<=n;i++){
			
			natural = i * i;
			totalNatural += natural;
			natural = 0;
			
			square = square + i;
		}
		
		totalSquare = square * square;
		total = totalSquare - totalNatural;
		
		System.out.println(total);
		//System.out.print(totalNatural);
	}

}

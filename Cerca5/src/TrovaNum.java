
public class TrovaNum {

	public static void main(String[] args) {
		int[] V = {7, 4, 5, 23, 1, 5};
		int[] W = {5, 3, 9, 7, 1, 0};
		boolean trovato = trova5(V, W, 0, V.length-1);
		System.out.println(trovato);
	}
	
	public static boolean trova5(int[] V,int[] W, int p, int q) {
		if (p==q) {
			if (V[p]==5 && W[p]==5) {
				return true;
			} else if (V[p]==5){
				int i = p+1;
				while (i<W.length) {
					if (W[i]==5) {
						return true;
					}
					i++;
				}
				return false;
			} else if (W[p]==5) {
				int i = p+1;
				while (i<V.length) {
					if (V[i]==5) {
						return true;
					}
					i++;
				}
				return false;
			} else {
				return false;
			}
			
		} 
			int m = (p+q)/2;
			
			//boolean x = trova5(V, W, p, m) || trova5(V, W, m+1, q);
			//boolean y = trova5(W, V, p, m) || trova5(W, V, m+1, q);
		return ((trova5(V, W, p, m) || trova5(V, W, m+1, q))) ;
	
			
				
				
				
				/*boolean x1 = trova5(W, V, p, m);
				boolean y1 = trova5(W, V, m+1, q);
				if (x1 || y1) {
					return true;
				}
				
			}
			return false;
	
			if (x == true) {
				return (trova5(W, V, p, m) || trova5(W, V, m+1, q) );
					
				
			} else {
				boolean y = trova5(V, W, m+1, q);
				if (y) {
					return (trova5(W, V, m+1, q) || trova5(W, V, p, m)) ;
					
				}
				return false;
			} */
		
			
		
	}
}

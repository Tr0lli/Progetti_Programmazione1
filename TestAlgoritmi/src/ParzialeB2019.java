
public class ParzialeB2019 {
	public static int CombinazioniK1K2(char[] V, int p, int q, char K1, char K2) {
		if (p==q) {
			return 0;
		}
		int mid = (p+q)/2;
		int ris = CombinazioniK1K2(V, p, mid, K1, K2) + CombinazioniK1K2(V, mid+1, q, K1, K2);
		if (V[mid] == K1) {
			if (V[mid+1] ==K2) {
				ris = ris+1;
			}
		} 
		if (V[mid]==K2 && V[mid+1]==K1) {
			ris = ris+1;
		}
		return ris;
	}
}


public class TestCombinazioniK1K2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] A = {'t','g','h','x','l','d','h','h','h','x','h','e'};
		char K1 = 'h';
		char K2 = 'x';
		int ris = ParzialeB2019.CombinazioniK1K2(A, 0, A.length-1, K1, K2);
		System.out.println(ris);
	}

}

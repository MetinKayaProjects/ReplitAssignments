package homework_repl_it_220_229;

public class BadProducts_229 {
	public static boolean badP(int[] products, int limit) {

		int numBroken = 0;
		
		for (int i = 0; i < products.length; i++) {
			if (products[i] == 0) {
				numBroken++;
			}
			
		}
		if (numBroken < limit) {
			return true;
		}return false;
		
	}
	public static void main(String[] args) {
		int[] products = {1,1,1,1};
		System.out.println(badP(products,5));
		
		int[] products2 = {1,1,1,1,0,0,0,0};
		System.out.println(badP(products2,2));
		
		int[] products3 = {1,1,1,0};
		System.out.println(badP(products3, 6));
	}
}
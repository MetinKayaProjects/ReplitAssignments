package homework_repl_it_160_169;

public class MethodsWithReturn7_3Locks_162 {
	public static void main(String[] args) {

		System.out.println(threeLocks(true, false, true));
	}

	/* This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.
	 * 
	 * It returns true only if both a and b are true or c is true.
	 * 
	 * https://en.wikipedia.org/wiki/Truth_table
	 */
	public static boolean threeLocks(boolean a, boolean b, boolean c) {
		return ((a && b) || c);

	}// end threeLocks

}

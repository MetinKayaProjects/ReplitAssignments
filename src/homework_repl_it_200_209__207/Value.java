package homework_repl_it_200_209__207;

public class Value {
	private int num;
	int x1;
	int x2;
	/*
	 * Write a class definition of a class named 'Value' with the following: 
	 * - a constructor accepting a single integer parameter 
	 * - a constructor with no parameters 
	 * 
	 * - a method 'setVal' that accepts a single parameter, 
	 * - a boolean method, 'wasModified' that returns true if setVal was ever called for the
	 * object. 
	 * - a method 'getVal' that returns an integer value as follows: if setVal
	 * has ever been called, it getVal returns the last value passed to setVal.
	 * Otherwise if the "single int parameter" constructor was used to create the
	 * object, getVal returns the value passed to that constructor. Otherwise getVal
	 * returns 0.
	 */
	// WRITE YOUR CODE HERE
	
	public Value() {
		
	}
	public Value(int num) {
		//setVal(num);
		
		this.num = num;
		x1++;
	}
	
	public void setVal(int num) {
		this.num = num;
		x2++;
	}
	
	public boolean wasModified () {
		if (x2>0) {
			return true;
		}
		return false;
	}
	public int getVal() {
		if (x2>0) {
			return num;
		}
		if (x1>0) {
			return num;
		}else {
			return 0;
		}
	}

}

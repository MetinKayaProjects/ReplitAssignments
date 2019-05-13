package homework_repl_it_160_169;

public class MethodWithStringWordCount_169 {
	public static void main(String[] args) {
		System.out.println(wordCount("bla"));
		
	}
	/*
	 * This method gets a string and returns the word count of that string.

		example:
		
		wordCount("foo bar")
		returns 2
		
		wordCount("one two three")
		returns 3
		
		wordCount("bla")
		returns 1
		
		hint:
		
		https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#split(java.lang.String)
	 */
	
	public static int wordCount(String words) {
		
		
		return words.split(" ").length;
	}

}

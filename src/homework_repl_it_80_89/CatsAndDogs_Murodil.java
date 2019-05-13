package homework_repl_it_80_89;

public class CatsAndDogs_Murodil {
	public static void main(String[] args) {
		String str = "mycatyourcat";
		int count = 0;
		for (int i = 0; i <= str.length()-3; i++) {
			String temp = str.substring(i, i+3);
			System.out.println(temp);
			if(temp.equals("cat")) {
				count++;
			}
		}
		System.out.println("Number of cat in str: " + count);
		
		
		
	}

}

package homework_repl_it_140_149;

import java.util.Scanner;

public class findCube_141 {
	public static void main(String[] args) {
		cube();
		
	}
	public static void cube() {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int cubeOfNum = num*num*num;
		System.out.println(cubeOfNum);
	}

}

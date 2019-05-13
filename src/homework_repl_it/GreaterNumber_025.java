package homework_repl_it;

import java.util.Scanner;

public class GreaterNumber_025 {
	public static void main(String[] args) {
		
	/*
	  Instructions from your teacher:
using an if statement check which int is larger a or b, and then output:
"number is greater".

for example:
a=1
b=2

output: 
2 is greater

a=5
b=7

output:
7 is greater
	 	
	 */
		
	int a, b;
	Scanner input = new Scanner(System.in);
	a = input.nextInt();
	b = input.nextInt();
	
	if(a > b) {
		System.out.println(a + " is greater"); 
	}else {
			System.out.println(b + " is greater");
		}
	}
		
		
		
		
	}



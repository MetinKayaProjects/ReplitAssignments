package homework_repl_it_3;

import java.util.Scanner;

public class BuildARoute076 {
	public static void main(String[] args) {
		
//	    Write a program that will print out route instructions. 
//	    Your program should take 2 parameters: start point and end point. 
//	    Use left, right, up and down for navigation. Insert ">" between commands. 
//	    If start point equals to end point - display: "start/end(start or end variable!) found".
//	    Note: you may move only clock wise.		
////		Example:
//	    Input: A
//	    Input: D
//	    Output: right > down > left: D found
//
//	    Input: C
//	    Input: C
//	    Output: C found
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the start point: ");
		String startPoint = scan.next();
		System.out.println("Enter the end point: ");
	    String endPoint = scan.next();	
		
	  
	   
	    if(startPoint.equalsIgnoreCase("A") && endPoint.equalsIgnoreCase("B")) {
	    	System.out.println("right: B found");
	    	
	    }else if(startPoint.equalsIgnoreCase("A") && endPoint.equalsIgnoreCase("C")) {
	    	System.out.println("right > down: C found");
	    	
	    }else if(startPoint.equalsIgnoreCase("A") && endPoint.equalsIgnoreCase("D")) {
	    	System.out.println("right > down > left: D found");
	    	
	    }else if(startPoint.equalsIgnoreCase("B") && endPoint.equalsIgnoreCase("C")) {
	    	System.out.println("down : C found");
	    	
	    }else if(startPoint.equalsIgnoreCase("B") && endPoint.equalsIgnoreCase("D")) {
		    	System.out.println("down > left: D found");
				
	    }else if(startPoint.equalsIgnoreCase("B") && endPoint.equalsIgnoreCase("A")) {
	    	System.out.println("down > left > up: A found");
	    	
	    }else if(startPoint.equalsIgnoreCase("C") && endPoint.equalsIgnoreCase("D")) {
	    	System.out.println("left: D found");
	   
	    }else if(startPoint.equalsIgnoreCase("C") && endPoint.equalsIgnoreCase("A")) {
		    System.out.println("left > up: A found");
		    
	    }else if(startPoint.equalsIgnoreCase("C") && endPoint.equalsIgnoreCase("B")) {
		    System.out.println("left > up > right: B found");  
	 	    	
	    }else if(startPoint.equalsIgnoreCase("D") && endPoint.equalsIgnoreCase("A")) {
	    	System.out.println("up: A found");
	  
	    }else if(startPoint.equalsIgnoreCase("D") && endPoint.equalsIgnoreCase("B")) {
	    	System.out.println("up > right: B found");
	   
	    }else if(startPoint.equalsIgnoreCase("D") && endPoint.equalsIgnoreCase("C")) {
	    	System.out.println("up > right > down: C found");
	    }else {
			System.out.println(startPoint + " found");
		}
	    
	    
//	    if(start.equalsIgnoreCase("A")) {
//	    	if(end.equalsIgnoreCase("A")) { 
//		    	endPoints = 1;
//	    	   	startPoint = 1;
//	    	}
//	    }if(start.equalsIgnoreCase("B")) {
//	    	if(end.equalsIgnoreCase("B")) {
//		    	endPoints = 2;
//	    	   	startPoint = 2;
//	    }
//	    }if(start.equalsIgnoreCase("C")) {
//	    	if(end.equalsIgnoreCase("C")) { 
//		    	endPoints = 3;
//	    	   	startPoint = 3;
//	    	}
//	    }if(start.equalsIgnoreCase("D")) {
//	    	if(start.equalsIgnoreCase("D")) {
//		    	endPoints = 4;
//		    	startPoint = 4;
//	    }
//	    
//	    
//	    }
//	  
//	    
//	  
//	    
//	    System.out.println(startPoint);
//
//	    System.out.println(endPoints);
//		
//		
		
	}

}

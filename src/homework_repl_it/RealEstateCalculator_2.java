package homework_repl_it;

import java.util.Scanner;

public class RealEstateCalculator_2 {
	
	
	public static void main(String[] args) {
	    //DO NOT CHANGE
	    int propertyPrice = 0; 
	        int numberOfBedrooms, garageSpots;
	        float metroAccessibility, schoolScore, highwayAccessibility;
	        boolean backyard, smoking, garage;
	        String houseType;
	        Scanner scan = new Scanner(System.in);
	        System.out.println("*****************************************");
	        System.out.println("* Welcome to the RealEstate calculator! *");
	        System.out.println("*****************************************");
	    //WRITE YOUR CODE HERE
	    System.out.println("Enter your property type:");
	    houseType = scan.nextLine(); // nextLine olmali, yoksa girilen herseyin ilk kelimesini alir. 
	    								//ve Single Family House'u gormez, sadece Single' alir ve hata verir.
	    
	    if(houseType.equals("Condo")){
	      propertyPrice = 50000;
	      System.out.println("How many bedrooms do you have?");
	      numberOfBedrooms = scan.nextInt();
	      propertyPrice = propertyPrice + (numberOfBedrooms * 30000);
	      System.out.println("Do you have a backyard?");
	      backyard = scan.nextBoolean();
	      if (backyard == true){
	        System.out.println("Backyard is not available for condo!");
	      }
	      System.out.println("Do you have garage?");
	      garage = scan.nextBoolean();
	      if (garage == true){
	        System.out.println("How many spots?");
	        garageSpots = scan.nextInt();
	        if (garageSpots <=10){
	        propertyPrice = propertyPrice + (20000*garageSpots);
	        }else{ 
	        System.out.println("Pardon, it's not a public parking!");
	        }
	        System.out.println("How close is metro station?");
	        metroAccessibility = scan.nextFloat();
	        if (metroAccessibility <= 1){
	          propertyPrice = propertyPrice + 10000;
	        }else if (metroAccessibility >=1 && metroAccessibility <=3){
	          propertyPrice = propertyPrice + 5000;
	        }
	        System.out.println("How close is highway?");
	        highwayAccessibility = scan.nextFloat();
	        if (highwayAccessibility <=1){
	          propertyPrice = propertyPrice + 15000;
	        }else if(highwayAccessibility >= 1 && highwayAccessibility <= 5){
	          propertyPrice = propertyPrice + 8000;
	        }else if (highwayAccessibility >=5 && highwayAccessibility <=20){
	          propertyPrice = propertyPrice + 4000;
	        }
	        System.out.println("What's the rating of nearest school?");
	        schoolScore = scan.nextFloat();
	        if (schoolScore <= 10 && schoolScore >=8){
	          propertyPrice = propertyPrice + 45000;
	        } else if (schoolScore <8 && schoolScore >= 4){
	          propertyPrice = propertyPrice + 20000;
	        } else{
	          propertyPrice = propertyPrice + 5000;
	        }
	        System.out.println("Does any of your family members smoking?");
	        smoking = scan.nextBoolean();
	        if (smoking == true){
	          propertyPrice = propertyPrice - 5000;
	        }
	        
	        
	        
	        
	        
	        System.out.println("Market report has been generated.");
	        System.out.println("Your estimate market price is: " + propertyPrice + "$");
	        
	        
	        
	      }
	    }else if(houseType.equals("Townhouse")){
	      propertyPrice = 75000;
	      System.out.println("How many bedrooms do you have?");
	      numberOfBedrooms = scan.nextInt();
	      propertyPrice = propertyPrice + (numberOfBedrooms * 30000);
	      System.out.println("Do you have a backyard?");
	      backyard = scan.nextBoolean();
	      if (backyard == true){
	        propertyPrice = propertyPrice + 5000;
	      }
	      System.out.println("Do you have garage?");
	      garage = scan.nextBoolean();
	      if (garage == true){
	        System.out.println("How many spots?");
	        garageSpots = scan.nextInt();
	        if (garageSpots <=10){
	        propertyPrice = propertyPrice + (20000*garageSpots);
	        }else{ 
	        System.out.println("Pardon, it's not a public parking!");
	        }
	        System.out.println("How close is metro station?");
	        metroAccessibility = scan.nextFloat();
	        if (metroAccessibility <= 1){
	          propertyPrice = propertyPrice + 10000;
	        }else if (metroAccessibility >=1 && metroAccessibility <=3){
	          propertyPrice = propertyPrice + 5000;
	        }
	        System.out.println("How close is highway?");
	        highwayAccessibility = scan.nextFloat();
	        if (highwayAccessibility <=1){
	          propertyPrice = propertyPrice + 15000;
	        }else if(highwayAccessibility >= 1 && highwayAccessibility <= 5){
	          propertyPrice = propertyPrice + 8000;
	        }else if (highwayAccessibility >=5 && highwayAccessibility <=20){
	          propertyPrice = propertyPrice + 4000;
	        }
	        System.out.println("What's the rating of nearest school?");
	        schoolScore = scan.nextFloat();
	        if (schoolScore <= 10 && schoolScore >=8){
	          propertyPrice = propertyPrice + 45000;
	        } else if (schoolScore <8 && schoolScore >= 4){
	          propertyPrice = propertyPrice + 20000;
	        } else{
	          propertyPrice = propertyPrice + 5000;
	        }
	        System.out.println("Does any of your family members smoking?");
	        smoking = scan.nextBoolean();
	        if (smoking == true){
	          propertyPrice = propertyPrice - 5000;
	        }
	        
	        
	        
	        
	        
	        System.out.println("Market report has been generated.");
	        System.out.println("Your estimate market price is: " + propertyPrice + "$");
	        
	        
	        
	      }
	    }else if(houseType.equals("Single Family Home")){
	      propertyPrice = 95000;
	      System.out.println("How many bedrooms do you have?");
	      numberOfBedrooms = scan.nextInt();
	      propertyPrice = propertyPrice + (numberOfBedrooms * 30000);
	      System.out.println("Do you have a backyard?");
	      backyard = scan.nextBoolean();
	      if (backyard == true){
	        propertyPrice = propertyPrice + 5000;
	      }
	      System.out.println("Do you have garage?");
	      garage = scan.nextBoolean();
	      if (garage == true){
	        System.out.println("How many spots?");
	        garageSpots = scan.nextInt();
	        if (garageSpots <=10){
	        propertyPrice = propertyPrice + (20000*garageSpots);
	        }else{ 
	        System.out.println("Pardon, it's not a public parking!");
	        }
	        System.out.println("How close is metro station?");
	        metroAccessibility = scan.nextFloat();
	        if (metroAccessibility <= 1){
	          propertyPrice = propertyPrice + 10000;
	        }else if (metroAccessibility >=1 && metroAccessibility <=3){
	          propertyPrice = propertyPrice + 5000;
	        }
	        System.out.println("How close is highway?");
	        highwayAccessibility = scan.nextFloat();
	        if (highwayAccessibility <=1){
	          propertyPrice = propertyPrice + 15000;
	        }else if(highwayAccessibility >= 1 && highwayAccessibility <= 5){
	          propertyPrice = propertyPrice + 8000;
	        }else if (highwayAccessibility >=5 && highwayAccessibility <=20){
	          propertyPrice = propertyPrice + 4000;
	        }
	        System.out.println("What's the rating of nearest school?");
	        schoolScore = scan.nextFloat();
	        if (schoolScore <= 10 && schoolScore >=8){
	          propertyPrice = propertyPrice + 45000;
	        } else if (schoolScore <8 && schoolScore >= 4){
	          propertyPrice = propertyPrice + 20000;
	        } else{
	          propertyPrice = propertyPrice + 5000;
	        }
	        System.out.println("Does any of your family members smoking?");
	        smoking = scan.nextBoolean();
	        if (smoking == true){
	          propertyPrice = propertyPrice - 5000;
	        }
	        
	        
	        
	        
	        
	        System.out.println("Market report has been generated.");
	        System.out.println("Your estimate market price is: " + propertyPrice + "$");
	        
	        
	        
	      }
	    }
	    
	    
	    
	    
	    
	  }
	}



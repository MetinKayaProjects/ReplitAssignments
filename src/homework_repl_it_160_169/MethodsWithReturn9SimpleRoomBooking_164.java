package homework_repl_it_160_169;

public class MethodsWithReturn9SimpleRoomBooking_164 {
	public static void main(String[] args) {
		
		System.out.println(simpleRoomBook(false,2,1,2018));
		System.out.println(simpleRoomBook(true,2,1,2018));
		System.out.println();
		System.out.println(simpleRoomBook(true,7,0,2018));
		System.out.println(simpleRoomBook(true,7,1,2018));
		System.out.println(simpleRoomBook(true,7,5,2018));
		System.out.println(simpleRoomBook(true,7,8,2018));
		
	}
	/*
	 * To book  a room first it needs to be available for rent and make sure its available at the date selected:
the room is already booked between 7/1/2018 - 7/8/2018 and not available
accepting bookings only for year of 2018

example:

simpleRoomBook(false,2,1,2018)
return false

simpleRoomBook(true,2,1,2018)
return true

simpleRoomBook(true,7,2,2018)
return false
	 */
	public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){
		 if (!isAvailable) {
				return false;
		    }else if (year == 2018 && month != 7) {
		    	return true;
				}else if ( year == 2018 && month == 7 && day !=0 && (day < 1 || day > 8 )) {
					return true;
		    }else {
					return false;
				
		    }
		
//		return (isAvailable && 
//				((year == 2018 && month != 7 )||(year == 2018 && month == 7 && day != 0 && (day <1 || day > 8))));
	   
	  }

}

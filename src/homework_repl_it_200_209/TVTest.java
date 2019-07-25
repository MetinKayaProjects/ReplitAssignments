package homework_repl_it_200_209;

public class TVTest {
	public static void main(String[] args) {
		
		TV tv = new TV();
//		tv.brand = "Siemens";
//		System.out.println(tv.brand);
		tv.setVolumeLevel(1);
		System.out.println(tv.getVolumeLevel());
		System.out.println();
		tv.setChannel(111);
		System.out.println(tv.getChannel());
		System.out.println();
		
		tv.setBrand("LG");
		System.out.println(tv.getBrand());
		
		tv.setVolumeLevel(5);
		System.out.println(tv.getVolumeLevel());
		tv.isOn();
		System.out.println(tv.isOn());
		
		tv.volumeUp();
		
		
		System.out.println();
		
//		tv.turnOn();
		
		tv.turnOff();
		
		
	
	}

}

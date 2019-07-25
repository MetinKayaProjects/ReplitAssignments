package homework_repl_it_200_209;

public class TV {
	int channel = 1;
	int volumeLevel = 1;
	boolean on = false;
	String brand = "undefined";

	public TV() {
		System.out.println("Creating TV object using no Args- constructor");
	}

	public TV(String brand) {
		this.brand = brand;
		System.out.println("Creating TV object using 1 arg - constructor");
	}
//	Generate getters/setters for volumeLevel (getVolumeLevel/setVolumeLevel), 
//	channel (getChannel/setChannel) and brand (getBrand/setBrand) instance variables.

	public int getVolumeLevel() {
		return volumeLevel;
	}

	/*
	 * Volume can be only in the range between 1 and 7. You may change volume only
	 * if TV is on. Otherwise, display message:
	 * "ERROR: TV is either OFF or invalid Volume level". Create isOn() method that
	 * will check tv status.
	 */
	public void setVolumeLevel(int volumLevel) {
		
			if (volumLevel>=1 && volumLevel<=7 && on==true) {
				this.volumeLevel = volumLevel;
			}else {
				System.out.println("ERROR: TV is either OFF or invalid Volume level");
			}

	}

	public int getChannel() {
		return channel;
	}

	/*
	 * Value of a variable channel cannot be negative or zero, and cannot be higher
	 * than 120. If user will try to set invalid channel, display message:
	 * "ERROR: TV is either OFF or invalid Channel".
	 */
	public void setChannel(int channel) {
		if (channel > 0 && channel <= 120 && on==true) {
			this.channel = channel;
		} else {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		}

	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	/*
	 * Declare methods channelUp() to increase variable channel by one, and
	 * channelDown() to decrease variable channel by one.
	 */

	public void channelUp() {
		setChannel(getChannel()+1);
	}

	public void channelDown() {
		setChannel(getChannel()-1);
	}

	/*
	 * Declare methods volumeUp() to increase variable volume by one, and
	 * volumeDown() to decrease variable volume by one.
	 */
	public void volumeUp() {
		setVolumeLevel(getVolumeLevel()+1);;
	}

	public void volumeDown() {
		setVolumeLevel(getVolumeLevel()-1);;
	}

	/*
	 * Create isOn(), turnOn() and turnOff() methods for "on" instance variable. If
	 * tv is already on, no need to turn it on again, display message:
	 * "TV is already ON". If tv is already off, then no need to turn it off again,
	 * display message: "TV is already OFF".
	 */
	public boolean isOn() {
		return on;
	}

	public void turnOn() {
		if (on==true) {
			System.out.println("TV is already ON");
		}else {
			on=true;
		}
	}

	public void turnOff() {
		if (on==false) {
			System.out.println("TV is already OFF");
		}else {
			on = false;
		}
	}

}

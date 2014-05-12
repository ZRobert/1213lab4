//Robert Payne
//L02
//5/29/2012

public class TelevisionDriver{

	public static void main(String[] args)
	{
		//Initialize the manufacturer and Screen Size
		final String manufacturer = "Toshiba";
		final int ScreenSize = 46;
		
		//Create the television object		
		Television myTV = new Television(manufacturer,ScreenSize);
		
		//Turns the TV on
		myTV.Power();
		System.out.println("ON");
		
		//Prints the channel and then changes it, prints the new one
		System.out.println("Channel: " + myTV.getChannel());
		myTV.setChannel(6);
		System.out.println("New Channel: " + myTV.getChannel());
		
		//Prints the current volume, increases 5 times and prints again
		System.out.println("Current Volume: " + myTV.getVolume());
		
		for(int i = 0; i < 5; i++)
			myTV.increaseVolume();
			
		System.out.println("New Volume: " + myTV.getVolume());
		
		//Prints the manufacturer
		System.out.println("Manufacturer: " + myTV.getManufacturer());
		System.out.println("Screen Size: " + myTV.getScreenSize());
		
		//Turns the TV off
		myTV.Power();
		System.out.println("OFF");
		}
}//end of class		
		
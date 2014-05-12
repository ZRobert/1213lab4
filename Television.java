//Robert Payne
//L02
//5/29/2012

public class Television{

	//instance fields
	public String manufacturer;
	public int screenSize;
	private boolean powerOn;
	private int channel;
	private int volume;
	
	//constructor
	
	public Television(String m, int ss)
	{
		manufacturer = m;
		screenSize = ss;
		powerOn = false;
		channel = 8;
		volume = 5;
	}
	//end constructors
	
	//takes an int input and sets the channel
	public void setChannel(int chan)
	{
		channel = chan;
	}
	
	//Changes the power status of the TV
	public void Power()
	{
		powerOn = !powerOn;
	}
	
	//increases the volume as long as it is not maxed already
	public void increaseVolume()
	{
		if(volume < 25)
			volume ++;
	}
	
	//decreaes the volume as long as the volume is not minimized already
	public void decreaseVolume()
	{
		if(volume > 0)
			volume--;
	}	
	
	//returns the channel as an integer
	public int getChannel()
	{
		return channel;
	}
	
	//returns the volume as an integer
	public int getVolume()
	{
		return volume;
	}
	
	//returns the manufacturer
	public String getManufacturer()
	{
		return manufacturer;
	}
	
	//returns the screensize; size is initialized by the driver for the TV
	public int getScreenSize()
	{
		return screenSize;
	} 
}//end of class	
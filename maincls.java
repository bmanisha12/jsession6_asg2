import java.util.Scanner;

abstract class Instrument{
int loudness;
abstract void play();
}
class StringedInstrument extends Instrument{
int numberOfStrings;
	void play() 
	{
		// TODO Auto-generated method stub
		System.out.println("\n Instrument's number of strings are : "+numberOfStrings);
		System.out.println("\n Loudness : "+loudness);
		
	}
	public void get() {
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);

		System.out.println("\n enter number of strings of instrument: ");
		numberOfStrings = s.nextInt();
		System.out.println("\n enter loudness: ");
		loudness = s.nextInt();
		
 	}
	
}	
	class ElectricGuitar extends StringedInstrument
	{
		
	}
	
	class ElectricBassGuitar extends StringedInstrument
	{
		
	}



public class maincls {
public static void main(String args[])
{   ElectricBassGuitar ebg = new ElectricBassGuitar();
	ElectricGuitar eg = new ElectricGuitar();
	System.out.println("\n Enter data for Electric Guitar: ");
	eg.get();
	System.out.println("\nEnter data for  Electric Bass Guitar: ");
	ebg.get();
	System.out.println("\n Instrument "+eg.getClass()+" information");
	
	eg.play();
	System.out.println("\n Instrument "+ebg.getClass()+" information: ");
 
	ebg.play();
}
}

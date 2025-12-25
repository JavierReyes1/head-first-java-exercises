
// Testing sequencer from javax.sound.midi.*
import javax.sound.midi.*;

public class MusicTest1
{
	public void play()
	{
		try{
			Sequencer sequencer = MidiSystem.getSequencer();
			System.out.println("We got a sequencer");
			System.out.println("it works");
		}catch(MidiUnavailableException e){
			System.out.println("it doesn't work'");
		}
	}//close play
	
	public void riskyStuff() throw Exception(){
		throw new Excpetion();
	}
	
	public static void main(String[]args)
	{
		MusicTest1 mt = new MusicTest1();
		mt.play();
	}
}

import javax.sound.midi.*;

public class MusicTest2{

	boolean truthsOrLies = false;

	public void createSequencer(){
		try{
			Sequencer sequencer = MidiSystem.getSequencer(); 
		}catch(MidiUnavailableException e){
			System.out.println("Not working");
		}
	}
	public static void main(String[] args){

	}
}

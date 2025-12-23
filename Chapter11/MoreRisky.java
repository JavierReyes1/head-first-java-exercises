import static java.lang.System.out;
public class MoreRisky {
	boolean abandonHope;


	public void testRisk() throws Exception{ //This method must tell the world that it throws an exception
		if(abandonHope){
			throw new Exception(); //Create a new exception object and throw it
		}
	}

	public void crossFingers(){
		try{
			testRisk();
		}catch(Exception ex){
			System.out.println("Kaboom");
			out.println("crazy");
		}
	}

	public static void main(String[] args) {
		MoreRisky mr = new MoreRisky();
		mr.testRisk();
	}
}

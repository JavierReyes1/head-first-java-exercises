import static java.lang.System.out;

public class MoreRisky {
	boolean abandonHope = false;

	public void testRisk() throws Exception { // This method must tell the world that it throws an exception
		if (!abandonHope) {
			out.println("testRisk method success");
			throw new Exception(); // Create a new exception object and throw it
		}
	}

	public void crossFingers() {
		try {
			testRisk();
		} catch (Exception ex) {
			System.out.println("Kaboom");
			out.println("crazy");
		}
		out.println("CrossFingers was a thing");
	}
	
	public void takeItEasy(){
		crossFingers();
	}

	public static void main(String[] args) {
		MoreRisky mr = new MoreRisky();
		mr.takeItEasy();
	}
}

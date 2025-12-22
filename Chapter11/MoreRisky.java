public class MoreRisky {
	boolean abandonHope;

	public void testRisk() throws Exception{ //This method must tell the world that it throws an exception
		if(abandonHope){
			throw new Exception(); //Create a new exception object and throw it
		}
	}

	public void crossFingers(){
		testRisk();
	}

	public static void main(String[] args) {
	
	}
}

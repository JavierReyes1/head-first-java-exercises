//Testing method declaration with Expection handling
public class Risk {

	public void takeRisk() throws Exception {
		throw new Exception();
	}

	public static void main(String[] args) {
		Risk r = new Risk();
		try{
			r.takeRisk();
			System.out.println("Big W");
		}catch(Exception ex){
			System.out.println("No bueno");
		}

	}
}

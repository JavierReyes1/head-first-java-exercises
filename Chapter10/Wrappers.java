//Testing wrapping numbers
public class Wrappers{
	int a = 2;
	String b = "4";
	Integer e = 1;

	public static void main(String[]args){
		Wrappers wr = new Wrappers();
		wr.go();
	}

	public void go(){
		String s = String.format("Value a is: %d", a);
		System.out.println(s);
		String z = Integer.toString(a);
		String g = String.format("Value a is: %s", z);
		System.out.println(g);
	}
}

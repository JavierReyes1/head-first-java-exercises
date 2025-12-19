//Purpose: Show how wrapping works. This program throws an Integer.intValue() exception becuase
//this.i is null. In other words, Ingeger i was never initialized.
//.2) Create a String called s, create an int, wrap s into an Integer and print out x
//.3) Practice String.format()
//Things I learnt:
//	- Do not use %,.2d on a double, it does not work. instead, use %,.2f
public class TestBox {
	Integer i = 1;
	int j;
	String s = "2";
	double cost = 245678.34;
	public final static int PS5_COUNT;
	static double price;
	static int count;
	static{
		PS5_COUNT = 1;
		count = 101;
	}

	public static void main(String[] args){
		TestBox t = new TestBox();
		t.go();
		doStuff(45);

	}

	final static public void doStuff(final int x){
		//this method can't be overridden  
		String s = String.format("The value of x is: %d", x);
		System.out.println(s);
	}
	public void go(){
		j = i;
		int x = Integer.parseInt(s);

		System.out.println(x);
		System.out.println(j);
		System.out.println(i);
		String a = String.format("Variable x is: %d", x);
		String b = String.format("Ferrari cost: %,.2f", cost );
		System.out.println(a);
		System.out.println(b);
		System.out.println(PS5_COUNT);
		System.out.println(price);
		System.out.println(count);
	}
		
}

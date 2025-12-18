//Purpose: Show how wrapping works. This program throws an Integer.intValue() exception becuase
//this.i is null. In other words, Ingeger i was never initialized.
public class TestBox {
	Integer i;
	int j;

	public static void main(String[] args){
		TestBox t = new TestBox();
		t.go();
	}

	public void go(){
		j = i;
		System.out.println(j);
		System.out.println(i);
	}
		
}

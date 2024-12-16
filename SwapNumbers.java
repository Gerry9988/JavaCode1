package assignments;

public class SwapNumbers {
	// Program to swap two numbers with using third variable
	public static void main(String[] args) {

		int a = 20, b = 10, c;
		c = a + b; // c=20+10 = 30
		a = c - a; // new value of a is => 30-20 =10
		b = c - a; // new value of b is => 30-10 =20 here latest value of a is 10
		System.out.println("value of a after swaping is " + a);
		System.out.println("Value of b after swaping is " + b);

	}

}

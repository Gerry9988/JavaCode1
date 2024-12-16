package assignments;

public class SwapNumbersWithoutThirdVariable {

	public static void main(String[] args) {
		//Program to swap two numbers without using third variable
		
		int a=20,b=10;
		a=a+b;  			//latest value of a is 20+10=30
		b=a-b;				//latest value of b is 30-10=20
		a=a-b;				//latest value of a is 30-20=10
		System.out.println("Value of a after swapping is " +a);
		System.out.println("Value of b after swapping is " +b);
		

	}

}

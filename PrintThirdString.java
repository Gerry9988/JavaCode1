package assignments;

public class PrintThirdString {

	public static void main(String[] args) {
		String basti = "Bramptonpur MaltonColony OakvilleNagar HamiltonPur";

		// Split the sentence into words based on white space
		String[] splits = basti.split(" ");

		if (splits.length >= 3)
			System.out.println("The third word is: " + splits[2]);
		else
			System.out.println("third word is not there");

	}

}

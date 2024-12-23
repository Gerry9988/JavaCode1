package assignments;

public class PrintWordWithEvenLength {
	//Program to find even number of letters from given string.
			//Steps:			
			// 1. if string is not blank and words with even number of letters found then print those words
			// 2. if no word with even number length then print a message that no even length word is found.
			// 3. if string is empty then print a message that string is empty.
			 
	public static void main(String[] args) {
		String sentence = "Once there was a crow. He was thirsty. He saw a pitcher of water. He put stones in it, water came up, he drank water and flew away ";

		int evenCount = 0; // count number of words with even number of letters

		// condition if string is not blank
		if (!sentence.isBlank()) {

			// spilt string into array of words
			String[] SplitWords = sentence.split(" ");

			// read each word of String array with foreach loop
			for (String word : SplitWords) {
				
				//print word if length of word is even
				if (word.length() % 2 == 0) {
					System.out.println(word);
					evenCount++; //increase count if even word is found
				}
			}

			// if no word is found with even length
			if (evenCount == 0) {
				System.out.println("no even length of word is found, whole paragraph is odd");
			}

		} else //if string is empty
			System.out.println("Nothing is found");
	}

	}



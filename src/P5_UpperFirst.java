/*
	ISYS 320
	Name(s): Anthony Quehl
	Date: 
*/

public class P5_UpperFirst {

	public static void main(String[] args) {
		String word = "Jedi Knight";
		String delimiter = " ";
		
		upperFirst(word, delimiter);
		System.out.print(upperFirst(word, delimiter));
	}
	
	public static String upperFirst(String word, String delimiter) {
		String[] halves = word.split(delimiter);
		String firstHalf = halves[0];
		String secondHalf = halves[1];
		String updatedString = firstHalf.toUpperCase() + delimiter + secondHalf;
		
		return(updatedString);
	}

}

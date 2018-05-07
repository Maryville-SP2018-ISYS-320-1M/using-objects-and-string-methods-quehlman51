/*
	ISYS 320
	Name(s): Anthony Quehl
	Date: 
*/


public class P2_BananaStand {
	public static void main(String[] args) {
		String quote = "There's always money in the banana stand.";
		System.out.println(quote.toUpperCase().substring(28, 34));
		lastHalf("There's always money in the banana stand.");
	}
	
	public static String lastHalf(String quote) {
		int half = quote.length() / 2;
		String newQuote = quote.substring(half);
		return newQuote;
		
	}
}

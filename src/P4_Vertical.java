/*
	ISYS 320
	Name(s): Anthony Quehl
	Date: 
*/

public class P4_Vertical {

	public static void main(String[] args) {
		String string = "hey now";
		vertical(string);
	}

	public static void vertical(String string) {
		for (int i = 0; i < string.length(); i++) {
			System.out.println(string.charAt(i));
		}
	}

}

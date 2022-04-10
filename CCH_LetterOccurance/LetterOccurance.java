import java.util.*;

public class LetterOccurance{
	public static void findOccur(char[] ch){

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i=0; i<ch.length; i++) {
			int occur = 0;
			for (int j=0; j<ch.length; j++) {
				if (ch[i]==ch[j]) {
					occur++;
				}
			}
			map.put(ch[i],occur);
		}
		System.out.println("Your Character occurance is: ");
		System.out.println(map);
	}

	public static void main(String[] args) {
		System.out.println("Enter your string is: ");
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine().toLowerCase();
		char[] ch = new char[text.length()];
		for (int i=0; i < text.length(); i++) {
			ch[i] = text.charAt(i);
		}
		findOccur(ch);
	}
}
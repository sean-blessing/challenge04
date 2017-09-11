package challenge04;

import java.util.Scanner;

public class VowelReplacerApp {

	public static void main(String[] args) {
		System.out.println("Vowel Replacer App");
		Scanner sc = new Scanner(System.in);
		String sentence = "";
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter a sentence:  ");
			String newSentence = "";
			sentence = sc.nextLine();
			char[] characters = sentence.toCharArray();
			for (char c:characters) {
				if (c=='A'||c=='a'||
					c=='E'||c=='e'||
					c=='I'||c=='i'||
					c=='O'||c=='o'||
					c=='U'||c=='u') {
					newSentence+="_";
				}
				else newSentence+=c;
			}
//			newSentence = sentence;
//			newSentence = newSentence.replace("e", "_");
//			newSentence = newSentence.replace("E", "_");
//			newSentence = newSentence.replace("a", "_");
//			newSentence = newSentence.replace("A", "_");
//			newSentence = newSentence.replace("i", "_");
//			newSentence = newSentence.replace("I", "_");
//			newSentence = newSentence.replace("o", "_");
//			newSentence = newSentence.replace("O", "_");
//			newSentence = newSentence.replace("u", "_");
//			newSentence = newSentence.replace("U", "_");
			System.out.println("result:  "+newSentence);
			System.out.println("Again?");
			choice = sc.next();
			sc.nextLine();
		}
		System.out.println("Bye!");
	}

}

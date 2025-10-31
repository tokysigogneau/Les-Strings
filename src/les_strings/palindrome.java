package les_strings;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ask_user = new Scanner(System.in);
		System.out.println("Ecrivez un mor ou une phrase");
		
		// i insert the message in a variable then split each element to put in an array
		String rawUserMessage = ask_user.nextLine().toLowerCase();
		String [] userSentenceWord = rawUserMessage.split(" ");

		//call function for palindrome thing
		
		
		if (checkPalindrome(userSentenceWord)) {
			System.out.println("Oui '"+ rawUserMessage+"' est un palindrome");
		}
		else {
			System.out.println("Non '"+ rawUserMessage+"' n'est pas un palindrome");
		}
		
		
		
	}
	
	static boolean checkPalindrome(String [] Table) {
		//This part is used to have a table with each letter of the sentence/word 
		String wordToCheck = lesStrings.ConcateWords(Table);
		String [] lettersTable = wordToCheck.split("");
		System.out.println(Arrays.toString(lettersTable));
		
		//this variable will contain each letter in the reversed order
		String[] reverseTable = new String[lettersTable.length];
		
		// this loop add each letter of the main table 1 by 1 starting from the last letter
		for (int i = 0 ; i < lettersTable.length ; i++) {
			reverseTable[i] = lettersTable[lettersTable.length - 1 - i];
		}
		System.out.println(Arrays.toString(reverseTable));
		
		// this compare the 2 tables if they have the same content or not
		if (Arrays.equals(lettersTable, reverseTable)) {
			return true;
		}
		else {
			return false;
		}
		
		
		
		
		
	}
}

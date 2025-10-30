package les_strings;
import java.util.Arrays;
import java.util.List;

import java.util.Scanner;

public class lesStrings {

	private static final boolean FALSE = false;
	private static final boolean TRUE = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ask_user = new Scanner(System.in);
		System.out.println("Bonjour Mr l'aventurier ");
		System.out.println("Ecrivez une phrase ");

		// i insert the message in a variable then split each element to put in an array
		String rawUserMessage = ask_user.nextLine();
		String [] userSentenceWord = rawUserMessage.split(" ");
		//We need to put Arrays.toString so we get information a human can read
		System.out.println("contenu de la liste : " + Arrays.toString(userSentenceWord));
		

		
		ConcateWords (userSentenceWord);
		FindWord(userSentenceWord, ask_user);
		
	}
	// this method will be used to concatenate words together, will table a table as parameter
	static void ConcateWords (String[] WordsTable) {
		String ConcatenateResult = "";
		
		for (int i = 0; i < WordsTable.length ; i++) {
			ConcatenateResult = ConcatenateResult.concat(WordsTable[i]);
			System.out.println(ConcatenateResult);
		}
	}
	
	//this method takes a table of strings and the scanner so we can ask the user the word he wants

	static void FindWord (String[] Table,Scanner ask_user) {
		System.out.println("Quel mot voulez-vous rechercher?");
		String WordToFind = ask_user.nextLine();
		
		boolean WordFound = false;
		// we will check for each element in the table until we find one that match the wanted word
		for (int i = 0; i < Table.length ; i++ ) {
			
			//this check if the current word is the one we want then break the loop if we found it, we don't need to continue the loop
			if (Table[i].equals(WordToFind)) {
				System.out.println("Oui le mot ' " + WordToFind + " ' est bien dans cette phrase");
				WordFound = true;
				break;			
			}
		}
		if (!WordFound) {
			System.out.println("Le mot recherché ' " + WordToFind + " ' n'est pas dans la liste");
		}
		
		
	}

}

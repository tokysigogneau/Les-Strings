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
		ChangeWord(userSentenceWord,ask_user,rawUserMessage);
		ask_user.close();
	}
	// this method will be used to concatenate words together, will table a table as parameter
	static String ConcateWords (String[] WordsTable) {
		String ConcatenateResult = "";
		
		for (int i = 0; i < WordsTable.length ; i++) {
			ConcatenateResult = ConcatenateResult.concat(WordsTable[i]);
			System.out.println(ConcatenateResult);
			
		}
		return ConcatenateResult;
	}
	
	//this method takes a table of strings and the scanner so we can ask the user the word he wants

	static boolean FindWord (String[] Table,String WordToFind) {
		//System.out.println("Quel mot voulez-vous rechercher?");
		//String WordToFind = ask_user.nextLine();
		
		boolean WordFound = false;
		// we will check for each element in the table until we find one that match the wanted word
		for (int i = 0; i < Table.length ; i++ ) {
			
			//this check if the current word is the one we want then break the loop if we found it, we don't need to continue the loop
			if (Table[i].equals(WordToFind)) {
				System.out.println("Oui le mot ' " + WordToFind + " ' est bien dans cette phrase");
				WordFound = true;
				return true;			
			}
		}
		if (!WordFound) {
			System.out.println("Le mot recherché ' " + WordToFind + " ' n'est pas dans la liste");
			return false;	
		}
		return false;
		
	}
	
	//This method is used to find the reference of the word to change
	static int FindWordID (String[] Table,String WordToFind) {
		int wordReference = 0;
		// we will check for each element in the table until we find one that match the wanted word
		for (int i = 0; i < Table.length ; i++ ) {
			
			//this check if the current word is the one we want then break the loop if we found it, we don't need to continue the loop
			if (Table[i].equals(WordToFind)) {
				System.out.println("La référence [] du mot est le numéro : " + wordReference);
				return wordReference;
			}
			wordReference ++; //If it has not been found in the current loop, it will check the next reference
		}

		return wordReference;
	}
	
	//this function let the user edit a word 
	static void ChangeWord(String[] Table, Scanner ask_user, String rawUserMessage ) {
		System.out.println("Voici votre phrase : " + rawUserMessage);
		System.out.println("Quel mot voulez vous remplacer?");
		String WordToChange = ask_user.nextLine();
		
		String[] Table2 = Table ;

		//Create a loop to find indice of specific word then change it with table[n] = newWord
		
		boolean WordExists = lesStrings.FindWord(Table2,WordToChange);
		
		if (WordExists) {
			int WordRef = FindWordID(Table2,WordToChange);
			System.out.println("Avec quel mot voulez vous le remplacer?");
			String NewWord = ask_user.nextLine();
			Table[WordRef] = NewWord;
			System.out.println("Le nouveau tableau est : " + Arrays.toString(Table));
			
		}
		else {
			System.out.println("Le mot n'a pas été trouvé");
		}
	}

}

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
/**
 * Words 'R Fun Dictionary Project Template
 * Complete the methods to analyze the dictionary.
 * Add additional methods as needed. All variables except the File and Scanner
 * should be local.
 * @author rodriguezd
 *
 */
public class Dictionary
{
  static File fWebsters;
  static Scanner in;
  
  /*
   * Counts how many total words and five-letter words
   * are in this dictionary
   * Pre: File is opened, Scanner declared
   * Post: Number of words is printed
   */
  public static void countWords() throws IOException
  {
    in = new Scanner(fWebsters); //Initialize the Scanner
    int wordCounter = 0;
    int fiveLetterCounter = 0;
    String line = "";
    while(in.hasNextLine()){ // scans the file and increases wordCounter for each word, also checks for five letters and increases fiveLetterCounter
    	line = in.nextLine();
    	if(line.length() == 5){
    		fiveLetterCounter ++;
    	}
    	wordCounter ++;
    }
    System.out.printf("%-55s%30d\n","Number of Words:",wordCounter); //output
    System.out.printf("%-55s%30d\n","Number of Five Letter Words:", fiveLetterCounter);
  }
   
  /*
   * Counts how many five-letter words have 5,4,3,2,1,and 0 vowels
   * Only a e i o u upper and lower case are vowels
   * Pre: File is opened, Scanner declared
   * Post: Number of different vowel words are printed
   * Post: 0-Vowel words are printed
   */
  public static void countVowels() throws IOException
  {   
	  //reset Scanner to start of file
	  in = new Scanner(fWebsters); 
	  int vowel5 = 0;
	  int vowel4 = 0;
	  int vowel3 = 0;
	  int vowel2 = 0;
	  int vowel1 = 0;
	  int vowel0 = 0;
	  String line = "";
	  String zeroVowel = "";
	  while(in.hasNextLine()){ // scans each line and tracks the number of vowels in that word 
		  int vowelTracker = 0;
		  line = in.nextLine();
		  line = line.toLowerCase();
		  if(line.length() == 5){
			  for(int i = 0; i < line.length(); i ++){ // counts the number of vowels 
				  if(line.charAt(i) == 'a' || line.charAt(i) == 'e' || line.charAt(i) == 'i' || line.charAt(i) == 'o' || line.charAt(i)== 'u'){
					  vowelTracker ++;
				  		}
				  }
			  switch(vowelTracker) { //increases the corresponding tracking number and adds the word to the zero string if it has zero vowels
			  case 1: vowel1 ++;
			  break;
			  case 2: vowel2 ++;
			  break;
			  case 3: vowel3 ++;
			  break;
			  case 4: vowel4 ++;
			  break;
			  case 5: vowel5 ++;
			  break;
			  default: vowel0 ++;
			  zeroVowel += line + "\n";
			  break;
			  }
		  }
	  }
	  System.out.printf("%-55s%30d\n","Number of Five Letter Words with Zero Vowels:", vowel0); // output
	  System.out.printf("%-55s%30d\n","Number of Five Letter Words with One Vowel:", vowel1);
	  System.out.printf("%-55s%30d\n","Number of Five Letter Words with Two Vowels:", vowel2);
	  System.out.printf("%-55s%30d\n","Number of Five Letter Words with Three Vowels:", vowel3);
	  System.out.printf("%-55s%30d\n","Number of Five Letter Words with Four Vowels:", vowel4);
	  System.out.printf("%-55s%30d\n","Number of Five Letter Words with Five Vowels:", vowel5);
	  System.out.println("The words with zero vowels are:");
	  System.out.print(zeroVowel);
  }
  

  
  /*
   * Counts the number of characters in the longest and shortest word
   * Pre: File is opened, Scanner declared
   * Post: Number of characters in the longest word is printed
   * Post: Number of characters in the shortest word is printed
   */
  public static void longestAndShortestCount() throws IOException
  {
	  in = new Scanner(fWebsters); 
	  int longest = 0;
	  int shortest = 1000;
	  String line = "";
	  while(in.hasNextLine()){ //scans each line and checks against longest and shortest 
		  line = in.nextLine();
		  if(line.length() > longest){
			  longest = line.length();
		  }
		  if(line.length() < shortest)
			  shortest = line.length();
	  }
	  System.out.printf("%-55s%30d\n","The Largest Amount of Letters in a Word Is:", longest); //output
	  System.out.printf("%-55s%30d\n","The Smallest Amount of Letters in a Word Is:", shortest);
  }
  
  
  /*
   * Counts and displays all the words containing "java" in any case.
   * Pre: File is opened, Scanner declared
   * Post: Number of java words is printed
   * Post: All the java words are printed with java converted to all upper case
   */
  public static void javaWords() throws IOException
  {
	  in = new Scanner(fWebsters); 
	  String line = "";
	  System.out.println("The Words that Contain Java Are:");
	  while(in.hasNextLine()){	//scans each line looking for "java"
		  line = in.nextLine();
		  line = line.toLowerCase();
		  if (line.contains("java")){
			  line = line.replace("java", "JAVA"); // replaces "java" with "JAVA" and outputs
			  System.out.println(line);
		  }
	  }
  }
  
  public static void main(String[] args) throws IOException
  {
    //Open file
	//Add file to project folder
    fWebsters = new File ("websters_dictionary.txt");
    
    //Analyze words, runs all other methods
    countWords();
    countVowels();
    longestAndShortestCount();
    javaWords();
  }
}

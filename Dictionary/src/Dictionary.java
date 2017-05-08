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
    
    while(in.hasNext())
    {

    }

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
    
  }
  
  /*
   * Counts the number of characters in the longest and shortest word
   * Pre: File is opened, Scanner declared
   * Post: Number of characters in the longest word is printed
   * Post: Number of characters in the shortest word is printed
   */
  public static void longestAndShortestCount()
  {
    
  }
  
  
  /*
   * Counts and displays all the words containing "java" in any case.
   * Pre: File is opened, Scanner declared
   * Post: Number of java words is printed
   * Post: All the java words are printed with java converted to all upper case
   */
  public static void javaWords()
  {

  }
  
  public static void main(String[] args) throws IOException
  {
    //Open file
	//Add file to project folder
    fWebsters = new File ("websters_dictionary.txt");
    
    //Analyze words
    countWords();
    countVowels();
    longestAndShortestCount();
    javaWords();
  }
}

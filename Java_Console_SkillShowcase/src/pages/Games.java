package pages;

import java.util.Random;
import java.util.Scanner;
import static java_console_skillshowcase.Java_Console_SkillShowcase.newPage;
import static java_console_skillshowcase.Java_Console_SkillShowcase.pressAnyKeyToContinue;
import static validation.InputValidation.getChar;
import static validation.InputValidation.getString;

/**
 *
 * @author L. Andrew Overholt
 */
public class Games {
    Scanner sc = new Scanner(System.in);
    static boolean quit = false;
    static char c = 0;
    
       
    /**
     * This method displays the Games menu
     */
    public static void loadGamesMenu() {
        while (!quit) {
            newPage();
            
            // Print the menu and store the selection in variable c
            c = getChar("~~~~~~~~~~~~~~~~~\n"
                      + ">>    Games    <<\n"
                      + "~~~~~~~~~~~~~~~~~\n"
                      + "(M): Mad Lib\n"
                      + "(G): Guess the Number\n"
                      + "(H): Home\n"
                      + "(Q): Quit\n\n"
                      + "Your choice: ");
            
            // use the users selection stored in variable c to navigate to the 
            // appropriate screen
            switch (c) {
                case 'M', 'm' -> madLib();
                case 'G', 'g' -> System.out.println("\nGuess the Number has not been created yet");
                case 'H', 'h' -> java_console_skillshowcase.Java_Console_SkillShowcase.loadHomeMenu();
                case 'Q', 'q' -> quit = true;
                default -> { 
                }
            }
        }
    }
    
    /**
     * This method calls a random Mad lib
     */
    public static void madLib() {
        
        // Get a random number
        Random rand = new Random(); //instance of random class
        int randNum;
        randNum = rand.nextInt(2); //generate random values from 0-1
        
        switch (randNum) {
            case 0 -> madLib1();
            case 1 -> madLib2();
            default ->  {
            }
        }
    }
    
    
    /**
     * madLib1 prompts the user for words and then puts them in the blanks of a 
     * Mad Lib
     */
    public static void madLib1() {
        
        newPage();
        
        /**
         * prompt the user for words to fill in the blanks
         */
        // Line 1
        String adj1 = getString("Enter an adjective: ");
        String noun1 = getString("Enter a noun: ");
        String adj2 = getString("Enter an adjective: ");
        // Line 2
        String noun2 = getString("Enter a noun(place): ");
        // Line 3
        String adj3 = getString("Enter an adjective: ");
        // Line 4
        String adj4 = getString("Enter an adjective: ");
        String noun3 = getString("Enter a plural noun(vehicle): ");
        String adj5 = getString("Enter an adjective: ");
        // Line 5
        String adj6 = getString("Enter an adjective: ");
        String noun4 = getString("Enter a plural noun: ");
        // Line 6
        String adj7 = getString("Enter an adjective: ");
        String noun5 = getString("Enter a plural noun: ");
        // Line 7
        String noun6 = getString("Enter a plural noun: ");
        // Line 8
        String adj8 = getString("Enter an adjective: ");
        // Line 9
        String noun7 = getString("Enter a noun: ");
        String verb1 = getString("Enter a verb: ");
        String adj9 = getString("Enter an adjective: ");
        // Line 10
        String verb2 = getString("Enter a verb: ");
        String noun8 = getString("Enter a plural noun: ");
        // Line 11
        String noun9 = getString("Enter a plural noun(type of job): ");
        // Line 12
        String adj10 = getString("Enter an adjective: ");
        String verb3 = getString("Enter a verb: ");
        // Line 13
        String adj11 = getString("Enter an adjective: ");
        
        
        newPage();
        // print the complete mad lib to the screen
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                         + "~~          Star  Wars          ~~\n"
                         + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                         + "Star Wars is a " + adj1 + " " + noun1 + " of " + adj2 + "\n" //line1
                         + "versus evil in a " + noun2 + " far far away.\n" //line2
                         + "There are " + adj3 + " battles between\n" //line3
                         + adj4 + " " + noun3 + " in " + adj5 +"\n" //line4
                         + "space and " + adj6 + " duals with " + noun4 + "\n" //line5
                         + "called  " + adj7 + " sabers. " + noun5.substring(0, 1).toUpperCase() + noun5.substring(1) + "\n" //line6
                         + "called droids are helpers and " + noun6 + "\n" //line7
                         + "to the heroes. A " + adj8 + " power called\n" //line8
                         + "The " + noun7 + " " + verb1 + "s people to do " + adj9 + "\n" //line9
                         + "things, like " + verb2 + " " + noun8 + ". The Jedi\n" //line10
                         + noun9 + " use The Force for the\n" //line11
                         + adj10 + " side, and the Sith " + verb3 + " it for\n" //line12
                         + "the " + adj11 + " side.\n"); //line13
        
        pressAnyKeyToContinue();
    }
    
    
    /**
     * madLib2 prompts the user for words and then puts them in the blanks of a 
     * Mad Lib
     */
    public static void madLib2() {
        
        newPage();

        // prompt the user for words to fill in the blanks
        // Line 1
        String noun1 = getString("Enter a noun: ");
        String adj1 = getString("Enter an adjective: ");
        String noun2 = getString("Enter a noun(thing): ");
        // Line 2
        String adj2 = getString("Enter an adjective: ");
        String noun3 = getString("Enter a noun: ");
        // Line 3
        String noun4 = getString("Enter a noun(place): ");
        // Line 4
        String noun5 = getString("Enter a plural noun: ");
        String noun6 = getString("Enter a noun(unit of time): ");
        // Line 5
        String adv1 = getString("Enter an adverb: ");
        String verb1 = getString("Enter a verb(past tense): ");
        // Line 6
        String adv2 = getString("Enter an adverb: ");
        
        
        newPage();
        // print the complete mad lib to the screen
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                         + "~~       Pixar's Next Hit       ~~\n"
                         + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                         + "Once upon a blue " + noun1 + ", a " + adj1 + " " + noun2 + "\n" // line1
                         + "and a(n) " + adj2 + " dog fell in a(n)" + noun3 + " and it\n" // line2
                         + "was amazing. They went to " + noun4 + " and ate\n" // line3
                         + noun5 + " every " + noun6 + ". After some time,\n" // line4
                         + "they " + adv1 + " parted ways and " + verb1 + "\n" // line5
                         + adv2 + " every after."); //line6
        
        pressAnyKeyToContinue();
    }
}

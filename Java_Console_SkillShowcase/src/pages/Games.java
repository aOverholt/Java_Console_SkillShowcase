package pages;

import java.util.Random;
import java.util.Scanner;
import static java_console_skillshowcase.Java_Console_SkillShowcase.*;
import static validation.InputValidation.getChar;
import static validation.InputValidation.getInt;
import static validation.InputValidation.getString;

/**
 *
 * @author L. Andrew Overholt
 */
public class Games {
    // load Scanner
    Scanner sc = new Scanner(System.in);
    
    // Variables
    static char c = 0;
       
    /**
     * This method displays the Games menu
     */
    public static void loadGamesMenu() {
        while (!java_console_skillshowcase.Java_Console_SkillShowcase.quit) {
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
                case 'G', 'g' -> guessTheNumber();
                case 'H', 'h' -> java_console_skillshowcase.Java_Console_SkillShowcase.loadHomeMenu();
                case 'Q', 'q' -> java_console_skillshowcase.Java_Console_SkillShowcase.quit = true;
                default -> { 
                    System.out.println("\nThat is not a valid option. Please try again!");
                    pressAnyKeyToContinue();
                }
            }
        }
    }
    
    /**
     * This method calls a random Mad lib
     */
    private static void madLib() {
        
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
    private static void madLib1() {
        
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
    private static void madLib2() {
        
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
    
    
    /**
     * guessTheNumber asks the user for a range, a number of guesses, and then picks
     * a random number within the range and gives the user the amount of guesses to 
     * figure it out.
     */
    private static void guessTheNumber() {
        int min = 0;
        int max = 0;
        int range;
        int multiplier;
        int answer;
        int guess;
        int numGuesses = 0;
        int maxGuesses = 3;
        boolean maxIsHigherThanMin = false;
        
        
        newPage();
        
        // print info section
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~\n"
                         + ">>  Guess the Number  <<\n"
                         + "~~~~~~~~~~~~~~~~~~~~~~~~\n"
                         + "You will enter a range of numbers, then a random\n"
                         + "number in that range of numbers will be selected.\n"
                         + "You will have " + maxGuesses + " guesses to get the correct number.\n"
                         + "Good Luck!");
        
        // get the range of numbers from the user
        while (!maxIsHigherThanMin) {
            min = getInt("\n\nEnter the lowest number in the range: ");
            max = getInt("Enter the highest number in the range: ");
            
            if (max <= min) {
                System.out.println("\nThe second number you enter must be higher than the first!");
            } else {
                maxIsHigherThanMin = true;
            }
        }
        
        /*
         * The way the random answer works:
         * 1. We get a random number between 0 and 10. This number will act like a percentage.
         * 2. We find the range using the max minus the min. For instance, max 15 - min 11 = range of 4
         * 3. Multiply the "percentage" by the range and then divide by 10 
         * 4. We get the answer by adding that number to the min.
         * 
         * Lets say min = 43, max = 72, multiplier = 6
         * range would be 29 (72 - 43)
         * 29 * 6 = 174
         * 174 / 10 = 17.4
         * answer = 17.4 + 43
         * answer = 60.4, which rounds down to 60
         */
        
        // Get a random number between 1-10
        Random rand = new Random(); //instance of random class
        multiplier = rand.nextInt(100); //generate random values from 0-100 (percentage)
        
        // get the range
        range = max - min;
        
        // calculate the answer 
        answer = min + (int)Math.round(((multiplier * range)/100));
        
        System.out.println("\n\nNow guess the number! Remember, it must be between " + min + " and " + max + ".");
        
        while (numGuesses < maxGuesses) {
            guess = getInt("\nYour guess: ", min, max);
            numGuesses ++;
            
            if (guess != answer) { // If they guess wrong
                    if (numGuesses < maxGuesses) {
                        System.out.println("Incorrect! Try again!");
                    } else {
                        System.out.println("Incorrect! You are out of guesses.\n"
                                         + "The correct number was " + answer + ".");
                    }
            } else { // If they guess correctly
                System.out.println("You win!! Congratulations!");
                numGuesses += maxGuesses; // make sure the loop ends
            }
            
            
        }
        pressAnyKeyToContinue();
        loadGamesMenu();
        
    }
}

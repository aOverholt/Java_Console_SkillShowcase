package java_console_skillshowcase;

import java.util.Scanner;
import static validation.InputValidation.getChar;

/**
 *
 * @author L. Andrew Overholt
 */
public class Java_Console_SkillShowcase
{
    /*
     * MAIN METHOD
     */
    public static void main(String[] args)
    {
        loadHomeMenu();
    }

    
    
    // load Scanner
    Scanner sc = new Scanner(System.in);
    
    // Variables
    static char c = 0;
    static boolean quit = false;
    
    
    
    /**
     * This method displays the Home menu
     */
    private static void loadHomeMenu() {
        while (!quit) {
            System.out.println("\n\n\n\n**************************************************************\n"
                             + "Welcome to L. Andrew Overholt's Java Console Skills Showcase!\n"
                             + "**************************************************************\n\n");
            
            
            // Print the menu and store the selection in variable c
            c = getChar("~~~~~~~~~~~~~~~~\n"
                      + ">>    Home    <<\n"
                      + "~~~~~~~~~~~~~~~~\n"
                      + "(G): Games\n"
                      + "(L): Loops\n"
                      + "(M): Math\n"
                      + "(Q): Quit\n\n"
                      + "Your choice: ");
            
            // use the users selection stored in variable c to navigate to the 
            // appropriate screen
            switch (c) {
                case 'G':
                case 'g':
                    loadGamesMenu();
                    break;
                case 'l':
                case 'L':
                    loadLoopsMenu();
                    break;
                case 'M':
                case 'm':
                    loadMathMenu();
                    break;
                case 'Q':
                case 'q':
                    quit = true;
                    break;
                default:
            }
        }
    }
    
    /**
     * This method displays the Games menu
     */
    private static void loadGamesMenu() {
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
                case 'M':
                case 'm':
                    pages.Games.madLib();
                    break;
                case 'G':
                case 'g':
                    System.out.println("\nGuess the Number has not been created yet");
                    break;
                case 'H':
                case 'h':
                    loadHomeMenu();
                    break;
                case 'Q':
                case 'q':
                    quit = true;
                    break;
                default:
            }
        }
    }
    
    /**
     * This method displays the Loops menu
     */
    private static void loadLoopsMenu() {
        while (!quit) {
            newPage();
            
            // Print the menu and store the selection in variable c
            c = getChar("~~~~~~~~~~~~~~~~~\n"
                      + ">>    LOOPS    <<\n"
                      + "~~~~~~~~~~~~~~~~~\n"
                      + "(W): While Loop\n"
                      + "(F): For Loop\n"
                      + "(D): Do While\n"
                      + "(H): Home\n"
                      + "(Q): Quit\n\n"
                      + "Your choice: ");
            
            // use the users selection stored in variable c to navigate to the 
            // appropriate screen
            switch (c) {
                case 'W':
                case 'w':
                    System.out.println("\n\"While Loop\" has not been created yet");
                    break;
                case 'F':
                case 'f':
                    System.out.println("\n\"For Loop\" has not been created yet");
                    break;
                case 'D':
                case 'd':
                    System.out.println("\n\"Do While Loop\" has not been created yet");
                    break;
                case 'H':
                case 'h':
                    loadHomeMenu();
                    break;
                case 'Q':
                case 'q':
                    quit = true;
                    break;
                default:
            }
            
        }
        
    }
    
    /**
     * This method displays the Math menu
     */
    private static void loadMathMenu() {
        while (!quit) {
            newPage();
            
            // Print the menu and store the selection in variable c
            c = getChar("~~~~~~~~~~~~~~~~~\n"
                      + ">>    Math    <<\n"
                      + "~~~~~~~~~~~~~~~~~\n"
                      + "(A): Add\n"
                      + "(S): Subtract\n"
                      + "(M): Multiply\n"
                      + "(D): Divide\n"
                      + "(H): Home\n"
                      + "(Q): Quit\n\n"
                      + "Your choice: ");
            
            // use the users selection stored in variable c to navigate to the 
            // appropriate screen
            switch (c) {
                case 'A':
                case 'a':
                    System.out.println("\n*** \"Add\" has not been created yet ***");
                    break;
                case 'S':
                case 's':
                    System.out.println("\n***\"Subtract\" has not been created yet ***");
                    break;
                case 'M':
                case 'm':
                    System.out.println("\n***\"Multiply\" has not been created yet ***");
                    break;
                case 'D':
                case 'd':
                    System.out.println("\n***\"Divide\" has not been created yet ***");
                    break;
                case 'H':
                case 'h':
                    loadHomeMenu();
                    break;
                case 'Q':
                case 'q':
                    quit = true;
                    break;
                default:
            }
            
        }
        
    }
    
    /**
     * Creates white space and a divider between "pages"
     */
    public static void newPage() {
            System.out.println("\n\n\n\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n"
                             + " * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n\n\n");
    }
    
    /**
     * Gives the user the opportunity to see information before moving on to 
     * the next screen
     */
     public static void pressAnyKeyToContinue() { 
         System.out.println("\nPress Enter key to continue...");
         try {
             System.in.read();
         }  
         catch(Exception e) {
         }  
     }
}

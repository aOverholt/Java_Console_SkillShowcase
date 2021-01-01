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

    
    
    
    Scanner sc = new Scanner(System.in);
    static char c = 0;
    static boolean quit = false;
    
    
    private static void loadHomeMenu()
    {
        while (!quit) {
            System.out.println("\n\n\n\n**************************************************************\n"
                             + "Welcome to L. Andrew Overholt's Java Console Skills Showcase!\n"
                             + "**************************************************************\n\n");
            
            
            // Print the menu
            c = getChar("** HOME **\n"
                      + "(G): Games\n"
                      + "(L): Loops\n"
                      + "(M): Math\n"
                      + "(Q): Quit\n\n"
                      + "Your choice: ");
            switch (c) {
                case 'G':
                case 'g':
                    loadGamesMenu();
                    break;
                case 'l':
                case 'L':
                    System.out.println("\nLoops menu has not been created yet");
                    break;
                case 'M':
                case 'm':
                    System.out.println("\nMath menu has not been created yet");
                    break;
                case 'Q':
                case 'q':
                    quit = true;
                    break;
                default:
            }
            
        }
    }
    
    private static void loadGamesMenu() {
        while (!quit) {
            System.out.println("\n\n\n\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n"
                             + " * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n\n\n");
            
            
            // Print the menu
            c = getChar("** GAMES **\n"
                      + "(M): Mad Lib\n"
                      + "(G): Guess the Number\n"
                      + "(H): Home\n"
                      + "(Q): Quit\n\n"
                      + "Your choice: ");
            switch (c) {
                case 'M':
                case 'm':
                    System.out.println("\nMad Lib has not been created yet");
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
    
}

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
        loadMainMenu();
    }

    
    
    
    Scanner sc = new Scanner(System.in);
    static char c = 0;
    static boolean quit = false;
    
    
    private static void loadMainMenu()
    {
        while (!quit) {
            System.out.println("\n\n\n\nWelcome to L. Andrew Overholt's Java Console Skills Showcase!\n");
            
            
            // Print the menu
            c = getChar("** MENU **\n"
                    + "(G): Games\n"
                    + "(L): Loops\n"
                    + "(M): Math\n"
                    + "(Q): Quit\n\n"
                    + "Your choice: ");
            switch (c) {
                case 'G':
                case 'g':
                    System.out.println("\nGames menu has not been created yet");
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
    
}

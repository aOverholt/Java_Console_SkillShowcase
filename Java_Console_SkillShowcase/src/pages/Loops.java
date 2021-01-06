package pages;

import java.util.Scanner;
import static java_console_skillshowcase.Java_Console_SkillShowcase.newPage;
import static java_console_skillshowcase.Java_Console_SkillShowcase.pressAnyKeyToContinue;
import static validation.InputValidation.getChar;

/**
 *
 * @author L. Andrew Overholt
 */
public class Loops {
    // load Scanner
    Scanner sc = new Scanner(System.in);
    
    // Variables
    static char c = 0;
    
    
    /**
     * This method displays the Loops menu
     */
    public static void loadLoopsMenu() {
        while (!java_console_skillshowcase.Java_Console_SkillShowcase.quit) {
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
                case 'W', 'w' -> System.out.println("\n\"While Loop\" has not been created yet");
                case 'F', 'f' -> System.out.println("\n\"For Loop\" has not been created yet");
                case 'D', 'd' -> System.out.println("\n\"Do While Loop\" has not been created yet");
                case 'H', 'h' -> java_console_skillshowcase.Java_Console_SkillShowcase.loadHomeMenu();
                case 'Q', 'q' -> java_console_skillshowcase.Java_Console_SkillShowcase.quit = true;
                default ->      {
                    System.out.println("\nThat is not a valid option. Please try again!");
                    pressAnyKeyToContinue();
                }
            }
            
        }
        
    }
    
}

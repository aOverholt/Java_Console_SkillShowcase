package pages;

import java.util.Scanner;
import static java_console_skillshowcase.Java_Console_SkillShowcase.newPage;
import static validation.InputValidation.getChar;

/**
 *
 * @author L. Andrew Overholt
 */
public class Maths {
    Scanner sc = new Scanner(System.in);
    static boolean quit = false;
    static char c = 0;
    
    
    /**
     * This method displays the Math menu
     */
    public static void loadMathMenu() {
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
                case 'A', 'a' -> System.out.println("\n*** \"Add\" has not been created yet ***");
                case 'S', 's' -> System.out.println("\n***\"Subtract\" has not been created yet ***");
                case 'M', 'm' -> System.out.println("\n***\"Multiply\" has not been created yet ***");
                case 'D', 'd' -> System.out.println("\n***\"Divide\" has not been created yet ***");
                case 'H', 'h' -> java_console_skillshowcase.Java_Console_SkillShowcase.loadHomeMenu();
                case 'Q', 'q' -> quit = true;
                default ->      {
                }
            }
            
        }
        
    }
    
    
}

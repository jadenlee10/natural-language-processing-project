/**
 * The NLPRunner class is a simple console-based application that prompts the user
 * to check for synonyms of their emotions using the EmotionsAnalyzer class.
 * 
 * <p>The program interacts with the user through the console, asking if they want
 * synonyms for how they feel. If the user agrees, they input an emotion, and the
 * program returns matching words. Otherwise, it ends with a friendly message.</p>
 *
 * @author Your Name
 * @version 1.0
 */
import java.util.Scanner;

public class NLPRunner {
    /**
     * The main method starts the program, interacts with the user, and uses
     * EmotionsAnalyzer to find synonyms for emotions.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmotionsAnalyzer analyzer = new EmotionsAnalyzer();

        System.out.println("Do you want different synonyms of how you are feeling? y/n");
        String response = scanner.nextLine().toLowerCase();

        if (response.equals("y")) {
            System.out.println("How Do You Feel: ");
            String userEmotion = scanner.nextLine();
            System.out.println("Matching words: " + analyzer.getEmotion(userEmotion));
        } else if (response.equals("n")) {
            System.out.println("Okay, have a great day!");
        } else {
            System.out.println("Invalid input. Please restart and enter 'y' or 'n'.");
        }

        scanner.close();
    }
}

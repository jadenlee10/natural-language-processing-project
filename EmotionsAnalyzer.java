/**
 * The EmotionsAnalyzer class processes emotions and finds synonyms for given emotions
 * by reading data from a file containing groups of related words.
 *
 * <p>The class loads a list of emotions and their synonyms from a file and provides a method
 * to search for matching words based on user input.</p>
 *
 * @author Your Name
 * @version 1.0
 */
import java.util.ArrayList;

public class EmotionsAnalyzer {
    private ArrayList<String> emotions;

    /**
     * Constructs an EmotionsAnalyzer and initializes the emotions list
     * by reading from the "synonyms.txt" file.
     */
    public EmotionsAnalyzer() {
        // Properly initialize the instance variable
        this.emotions = FileReader.toStringList("synonyms.txt");
    }

    /**
     * Searches for synonyms of a given emotion from the list.
     *
     * @param emotion The emotion to search for.
     * @return A string containing the matching words, or a message if none are found.
     */
    public String getEmotion(String emotion) {
        if (emotion == null || emotions == null) {
            return "No matching words found.";
        }

        for (String group : emotions) {
            if (group.toLowerCase().contains(emotion.toLowerCase())) {
                return group;
            }
        }
        return "No matching words found.";
    }
}

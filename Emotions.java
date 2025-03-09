/**
 * The Emotions class represents an emotion with a description.
 * It also provides a method to create a list of emotions from a text file.
 *
 * <p>This class is useful for handling emotion-related data and retrieving
 * descriptions of emotions.</p>
 *
 * @author Your Name
 * @version 1.0
 */
import java.util.ArrayList;

class Emotions {
  private String description; // The description of the emotion

  /**
   * Constructs an Emotions object with the specified description.
   *
   * @param description The description of the emotion.
   */
  public Emotions(String description) {
    this.description = description;
  }

  /**
   * Returns the description of the emotion.
   *
   * @return The emotion description.
   */
  public String getDescription() {
    return description;
  }

  /**
   * Creates a list of Emotions objects from a text file.
   *
   * @param filename The name of the file containing emotion descriptions.
   * @return A list of Emotions objects.
   */
  public static ArrayList<Emotions> createEmotions(String filename) {
    ArrayList<String> data = FileReader.toStringList(filename);
    ArrayList<Emotions> emotion = new ArrayList<>();

    for (String currentData : data) {
      emotion.add(new Emotions(currentData));
    }

    return emotion;
  }

  /**
   * Returns a string representation of the emotion.
   *
   * @return The description of the emotion.
   * @Override
   */
  public String toString() {
    return description;
  }
}
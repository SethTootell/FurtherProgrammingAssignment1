import java.util.ArrayList;
import java.util.Optional;

public class Menu {
    private final String prompt;
    private final ArrayList<MenuItem> options;

    public Menu(String prompt, ArrayList<MenuItem> options) {
        this.prompt = prompt;
        this.options = options;
    }

    public String getPrompt() {
        return prompt;
    }
    public ArrayList<MenuItem> getOptions() {
        return options;
    }
    public void displayMenuItems() {
        for (MenuItem item : options) {
            System.out.println("\t" + item.toString());
        }
    }

    public Optional<MenuItem> matchKey(String key) {
        for (MenuItem item : options) {
            if (item.getKey().equals(key)) {
                return Optional.of(item);
            }
        }
        return Optional.empty();
    }

    private void display(String internal) {
        int separatorLength = 50;
        String seperator = "-".repeat(separatorLength);
        System.out.println(seperator);
        System.out.println("> " + internal);
        System.out.println(seperator);
    }

    public void displayPrompt() {
        display(prompt);
    }
}

import java.util.ArrayList;

public class Menu {
    private String prompt;
    private ArrayList<MenuItem> options;
    final int seperatorLength = 50;

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
    public void addOption(MenuItem option) {
        options.add(option);
    }
    public void displayMenuItems() {
        for (MenuItem item : options) {
            System.out.println("\t" + item.toString());
        }
    }

    private void display(String internal) {
        String seperator = "-".repeat(seperatorLength);
        System.out.println(seperator);
        System.out.println("> " + internal);
        System.out.println(seperator);
    }

    public void displayPrompt() {
        display(prompt);
    }
}

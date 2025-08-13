import java.util.ArrayList;
import java.util.Optional;

/// class for creating a menu using the builder pattern
public class MenuBuilder {
    ArrayList<MenuItem> menuItems;
    Optional<String> prompt;

    public MenuBuilder() {
        menuItems = new ArrayList<>();
        prompt = Optional.empty();
    }

    public MenuBuilder addItem(MenuItem item) {
        menuItems.add(item);
        return this;
    }
    public MenuBuilder setPrompt(String prompt) {
        this.prompt = Optional.of(prompt);
        return this;
    }
    public Menu build() throws MenuBuilderException {
        if (!prompt.isPresent()) {
            throw new MenuBuilderException("Please enter a prompt");
        }
        if (menuItems.isEmpty()) {
            throw new MenuBuilderException("No items to display");
        }
        return new Menu(prompt.get(), menuItems);
    }
}

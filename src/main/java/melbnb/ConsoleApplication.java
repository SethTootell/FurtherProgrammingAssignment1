package melbnb;

import melbnb.menu.Menu;
import melbnb.menu.MenuBuilder;
import melbnb.menu.MenuItem;
import melbnb.property.Property;
import melbnb.property.PropertyCSVParser;

import java.io.File;
import java.util.List;

public class ConsoleApplication {
    private List<Property> db;

    ConsoleApplication(String csvPath) {
        PropertyCSVParser parser = new PropertyCSVParser(new File(csvPath));
        this.db = parser.readFile();
    }

    public void run() {
        Menu menu = new MenuBuilder()
                .addItem(new MenuItem("1", "first", () -> System.out.println("First item")))
                .addItem(new MenuItem("2", "second", () -> System.out.println("Second item")))
                .setPrompt("Hello World!")
            .build();


        menu.run();

    }
}

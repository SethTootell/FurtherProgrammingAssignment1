import java.util.Optional;
import java.util.Scanner;

public class ConsoleApplication {
    public static void run() {
        Menu menu = new MenuBuilder()
                .addItem(new MenuItem("1", "first", () -> System.out.println("First item")))
                .addItem(new MenuItem("2", "second", () -> System.out.println("Second item")))
                .setPrompt("Hello World!")
                .build();

        menu.run();

    }
}

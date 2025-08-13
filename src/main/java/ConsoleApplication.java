import java.util.Optional;
import java.util.Scanner;

public class ConsoleApplication {
    public static void run() {
        Menu menu = new MenuBuilder()
                .addItem(new MenuItem("1", "first", () -> System.out.println("First item")))
                .addItem(new MenuItem("2", "second", () -> System.out.println("Second item")))
                .setPrompt("Hello World!")
                .build();

        menu.displayPrompt();
        menu.displayMenuItems();

        mainLoop(menu);

    }

    private static void mainLoop(Menu menu) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine().trim();
            System.out.println(input);
            boolean found = false;
            Optional<MenuItem> menuItem = menu.matchKey(input);
            if (menuItem.isPresent()) {
                menuItem.get().run();
                break;
            }
        }
    }
}

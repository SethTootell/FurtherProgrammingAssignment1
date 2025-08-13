import java.util.ArrayList;

public class ConsoleApplication {
    public static void run() {
        ArrayList<MenuItem> arr = new ArrayList<>();

        Menu menu = new MenuBuilder()
                .addItem(new MenuItem("1", "first", ConsoleApplication::temp))
                .addItem(new MenuItem("2", "second", ConsoleApplication::temp))
                .setPrompt("Hello World!")
                .build();
        menu.displayPrompt();
        menu.displayMenuItems();
    }
}

//TODO: remove
public static void temp() {
    return;
}
}

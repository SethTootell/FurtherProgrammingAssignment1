import java.util.ArrayList;

public class ConsoleApplication {
    public static void run() {
        ArrayList<MenuItem> arr = new ArrayList<>();
        arr.add(new MenuItem("1", "first", ConsoleApplication::temp));
        arr.add(new MenuItem("2", "second", ConsoleApplication::temp));
        Menu menu = new Menu("Testing", arr);
        menu.displayPrompt();
        menu.displayMenuItems();
    }
    public static void temp() {
        return;
    }
}

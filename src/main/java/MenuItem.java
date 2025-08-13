public class MenuItem {
    final String key;
    final String label;
    final Runnable action;

    MenuItem(String key, String label, Runnable action) {
        this.key = key;
        this.label = label;
        this.action = action;
    }

    @Override
    public String toString() {
        return key + ": " + label;
    }
}

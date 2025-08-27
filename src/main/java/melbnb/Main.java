package melbnb;

public class Main {
    static final String csvFilePath = "src/main/resources/Melbnb.csv";
    public static void main(String[] args) {
        new ConsoleApplication(csvFilePath).run();
    }
}

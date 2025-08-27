package melbnb;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

/// CSVParser for properties
public class PropertyCSVParser {
    ArrayList<P>

    public PropertyCSVParser(File file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            br.readLine(); // The first line is a header line, since the format of the csv file is known for this
                           // program we ignore it
            // TODO:
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private readLine()
}

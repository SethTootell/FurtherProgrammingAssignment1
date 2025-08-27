package melbnb.property;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/// CSVParser for properties
public class PropertyCSVParser {
    BufferedReader file;

    public PropertyCSVParser(File file) {
        try {
            this.file = new BufferedReader(new FileReader(file));
            // first line is a header file,
            // the format of the csv for this
            // application is known therefore we
            // will skip it.
            this.file.readLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Property> readFile() {
        ArrayList<Property> properties = new ArrayList<>();
        Property property;
        while ((property = readProperty()) != null) {
            properties.add(property);
        }
        return properties;
    }

    private Property readProperty() throws RuntimeException {
        try {
            String l = file.readLine();
            if (l == null) return null;
            String[] line = l.split(",");
            return Property.fromLine(line);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}

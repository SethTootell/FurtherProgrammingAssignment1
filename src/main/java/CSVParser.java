import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

public class CSVParser {
    HashMap<String, String[]> data;

    public CSVParser(File file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            String[] firstLine = br.readLine().split(",");
            for (String s : firstLine) {
                data.put(s, firstLine);
            }
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                data.put(values[0], values);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

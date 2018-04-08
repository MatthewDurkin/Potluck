import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.*;


public class csvCleaner {

    public static void clean(Map<String, String> dirtyDict) {
        try {
            String headers = "";
            String values = "";
            String csvOutput = "";
            headers += dirtyDict.keySet();
            headers = headers.replace("[", "");
            headers = headers.replace("]", "");
            values += dirtyDict.values();
            values = values.replace("[", "");
            values = values.replace("]", "");
            BufferedWriter writer = new BufferedWriter(new FileWriter("PotluckEvent" + ".csv"));
            writer.write(headers);
            writer.newLine();
            writer.write(values);
            writer.close();
        } catch(IOException e) {
            System.out.println("IOException caught!");
        }
    }

}
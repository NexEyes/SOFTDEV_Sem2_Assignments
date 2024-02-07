import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        String filename = "src/start.text";
        String newFileName = "src/ender.txt";

        Path filepath = Paths.get(filename);
        List<String> lines = Files.readAllLines(filepath);

                FileWriter fileWriter = new FileWriter(newFileName, true);
        BufferedWriter writer = new BufferedWriter(fileWriter);

        for(String line: lines) {
        writer.append(line);
        writer.append("\n");
        }   
        


        writer.close();
    }
}

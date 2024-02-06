import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
       
        String filename = "src/file.text";

        Path filepath = Paths.get(filename);
        List<String> sum = Files.readAllLines(filepath);

        for(String sums: sum) {
            System.out.println(sums);
        }
    }
}

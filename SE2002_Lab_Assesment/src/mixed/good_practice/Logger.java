import java.io.FileWriter;

public class Logger {
    public void log(String message) {
        try (FileWriter writer = new FileWriter("log.txt", true)) {
            writer.write(message + "\n");
        } catch (Exception e) { 
            e.printStackTrace(); 
        }
    }
}

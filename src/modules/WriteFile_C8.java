package modules;

import java.io.File;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class WriteFile_C8 {
  public static void writeFile(String data) {
    try {
        new File("./src/data/reports-day-C8.csv");
        FileWriter file = new FileWriter("./src/data/reports-day-C8.csv", true);
        file.write(data);
        file.close();
        System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
  }
}

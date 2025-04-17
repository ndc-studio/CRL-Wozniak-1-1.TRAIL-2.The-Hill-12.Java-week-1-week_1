package modules;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;

/**
 * @see READ: https://www.w3schools.com/java/java_files_read.asp
 */
public class Challenge_6 {
    public static void challenge_6() {
        try {
            File myObj = new File("./src/data/data.txt");
            Scanner myReader = new Scanner(myObj);
            HashMap<Character, Integer> counterMap = new HashMap<Character, Integer>();

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String regex = "[^a-zA-Z]";
                String str = data.replaceAll(regex, "").toLowerCase();
                
                for (int i = 0; i < str.length(); i++) {
                    char charCurrentI = str.charAt(i);
                    
                    for (int j = 0; j < str.length(); j++) {
                        char charCurrentJ = str.charAt(j);

                        if (charCurrentI == charCurrentJ) {
                            counterMap.put(charCurrentI, counterMap.getOrDefault(charCurrentI, 0) + 1);
                            break;
                        }
                    }
                }
            }

            System.out.println(counterMap);

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("SCRIPT_ERROR: An error occurred.");
            e.printStackTrace();
        }
    }
}

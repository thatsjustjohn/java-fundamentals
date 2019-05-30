package linter;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class LinterReader {
    public String findErrors(Path pathName) {
        StringBuilder errors = new StringBuilder();
        try {
            Scanner sc = new Scanner(new File(pathName.toString()));
            int lineNum = 1;
            int errorCounter = 0;
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                // Initial test cases
                if(!line.endsWith(";")) {
                    if (!(line == "" || line.contains("if") || line.contains("else"))) {
                        // Test for end of string and make sure string isn't null
                        if (line.length() > 0) {
                            char lastChar = line.charAt(line.length() - 1);
                            if (!(lastChar == '{' || lastChar == '}')) {
                                errors.append(String.format("Line %d: Missing semicolon.\n", lineNum));
                                errorCounter++;
                            }
                        }
                    }
                }
                lineNum++;
            }
            errors.append(String.format("Total Errors: %d\n", errorCounter));
        } catch(FileNotFoundException e) {
            System.out.println("File not found");
            System.out.println(e);
        }
        return errors.toString();
    }
}

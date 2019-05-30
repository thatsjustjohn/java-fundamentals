package linter;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class LinterReader {
    public void findErrors(Path pathName) {
        HashSet<String> charSet = new HashSet<>();
        charSet.add("");
        charSet.add("}");
        charSet.add("{");
        charSet.add("if");
        charSet.add("else");


        try {
            Scanner sc = new Scanner(new File(pathName.toString()));
            int lineNum = 1;
            int errorCounter = 0;
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                // Initial test cases
                if(!(line == "" || line.contains("if") || line.contains("else")))
                {
                    // Test for end of string and make sure string isn't null
                    if(line.length() > 0){
                        char lastChar = line.charAt(line.length() - 1);
                        if(!(lastChar == '{' || lastChar == '}')){
                            System.out.println(String.format("Line %d: Missing semicolon.", lineNum));
                            errorCounter++;
                        }
                    }
                }
                lineNum++;
            }
            System.out.print("Total Errors: " + errorCounter);
        } catch(FileNotFoundException e) {
            System.out.println("File not found");
            System.out.println(e);
        }
    }
}

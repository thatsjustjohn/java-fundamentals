/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        LinterReader reader = new LinterReader();
        Path p1 = Paths.get("src/main/resources/gates.js");
        String errors = reader.findErrors(p1);

    }
}

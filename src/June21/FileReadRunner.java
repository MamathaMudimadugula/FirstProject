package June21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadRunner {
public static void main(String[] args) throws IOException {
Path pathFileToRead = Paths.get("C:/apache-jmeter-5.4.3/bin/LogiQids/a2.csv");
List<String> lines = Files.readAllLines(pathFileToRead);
System.out.println(lines);
}
}


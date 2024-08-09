import java.io.*;
import java.nio.file.*;
import java.util.stream.*;
public class ReadFileLineByLine {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\sathwika.kintali\\Desktop\\java\\File.txt");
        try(Stream<String> lines = Files.lines(path) )
        {
            lines.forEach(line->{
                System.out.println(line+" ,line length:  "+line.length());
        });
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}

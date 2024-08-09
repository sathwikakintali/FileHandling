import java.io.*;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.StandardOpenOption.*;
import java.util.*;
public class WriteToFile {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\sathwika.kintali\\Desktop\\java\\write.txt");
        List<String> line = Arrays.asList("hi","im","sathwika");
        try
        {
           Files.write(path,line, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}

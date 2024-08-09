import java.io.*;
public class ReadFromFile {
    public static void main(String[] args) {
        try(FileReader reader=new FileReader("C:\\Users\\sathwika.kintali\\Desktop\\java\\Source.txt");
            FileWriter writer = new FileWriter("C:\\Users\\sathwika.kintali\\Desktop\\java\\Destination.txt")){
            int character;
            while((character = reader.read())!=-1)
            {
                writer.write((char)character);
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }
}

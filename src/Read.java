import java.io.*;
public class Read {
    public static void main(String[] args) {
        String input = "C:\\Users\\sathwika.kintali\\Desktop\\java\\Input.txt";
        try(BufferedReader reader = new BufferedReader(new FileReader(input))){
            String line;
            while((line=reader.readLine())!=null)
            {
                System.out.println(line);
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}

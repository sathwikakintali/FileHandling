import java.nio.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;


public class MergeFiles {
    public static void main(String[] args) {
        Path dir = Paths.get("C:\\Users\\sathwika.kintali\\Desktop\\M");
        Path outputfile = Paths.get("C:\\Users\\sathwika.kintali\\Desktop\\java\\Outputfile.txt");
        try(Stream<Path> way = Files.list(dir);
            OutputStream out = Files.newOutputStream(outputfile,StandardOpenOption.CREATE,StandardOpenOption.APPEND))
        {
            way.filter(Files::isRegularFile).forEach(path ->{
                try(FileChannel fileChannel = FileChannel.open(path))
                {
                    ByteBuffer buffer = ByteBuffer.allocate(1024);
                    while(fileChannel.read(buffer)!=-1)
                    {
                        buffer.flip();
                        while(buffer.hasRemaining())
                        {
                            out.write(buffer.get());
                        }
                        buffer.clear();
                    }
                }
                catch(IOException e)
                {
                  e.printStackTrace();
                }

            });
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }


    }
}

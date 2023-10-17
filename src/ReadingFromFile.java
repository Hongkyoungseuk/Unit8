import java.io.*;

public class ReadingFromFile {
    public static void main(String[] args) throws IOException {
        // opening the file for reading
        FileReader fr = new FileReader("text.txt");
        // creation of the object for reading
        BufferedReader in = new BufferedReader(fr);

        // reading a line of text from the file
        String line = in.readLine();
        System.out.println(line);

        // closing the file
        fr.close();
        
    }
}

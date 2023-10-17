import java.io.*;

public class WritingOnFile {
    public static void main(String[] args) throws IOException{
           
        // opening the file for writing
        FileWriter f = new FileWriter("text.txt");
        // creation of the object for writing
        PrintWriter out = new PrintWriter(f);
        
        // writing text on the file
        out.println("some text to write to the file");
        
        // closing the output channel and the file
        out.close();
        f.close();
    }
}

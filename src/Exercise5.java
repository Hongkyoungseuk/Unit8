import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercise5 {
    //TODO 다시
    public static void studentWriter() throws IOException {
        FileWriter f = new FileWriter("student.txt");
        PrintWriter out = new PrintWriter(f);

        
        out.close();
        f.close();
    }


    public static void studentReader(File file) throws IOException {
        FileReader f = new FileReader(file);
        BufferedReader in = new BufferedReader(f);

        String line = in.readLine();
        System.out.println(line);

        f.close();
    }

    public static void studentScore() {
        

    }
    
}

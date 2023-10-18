import java.io.*;

public class Exercise5 {
    
    public static void studentWriter() throws IOException {
        FileWriter f = new FileWriter("student.txt");
        PrintWriter out = new PrintWriter(f);

        out.println("Rossi 25 24 26 30 24 30");
        out.println("Bianchi 20 24 25");
        out.println("Verdi 30 24 30 27");
        
        out.close();
        f.close();
    }

    public static void studentReader(String filename) throws IOException {
        FileReader f = new FileReader(filename);
        BufferedReader in = new BufferedReader(f);

        while (true) {
            String line = in.readLine();
            if (line == null) {
                break;
            }
            System.out.println(line);
        }
        in.close(); // 굳이 BufferedReader를 닫을 필요는 없다. /Why? 수정사항이 없어서
        f.close();
    }

    public static void main(String[] args) throws IOException {
        studentWriter();
        studentReader("student.txt");
    }
    
    
}

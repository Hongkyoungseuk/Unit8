import java.io.*;

public class Exercise4 {
    
    public static void multipTable(String fileName, int n) throws IOException {
        System.out.println("파일 : " + fileName + ".txt");

        FileWriter f = new FileWriter(fileName + ".txt");
        PrintWriter fw = new PrintWriter(f);

        for (int j = 1; j <= n ; j++) {
            for (int i = 1; i <= n ; i++) {
                fw.print(i*j + " ");
            }
            fw.println("");
        }
        fw.close();
        f.close();
    }

    public static void main(String[] args) throws IOException {
        multipTable("Exercise4", 3);
    }
}

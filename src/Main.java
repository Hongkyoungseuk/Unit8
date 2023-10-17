import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Writing text (쓰기위한 file)
        // 1.opening the file for writing (creation of the file)
        FileWriter fw = new FileWriter("text.txt");
        PrintWriter out = new PrintWriter(fw);

        // 2.writing text on the file
        out.println("some text to write to the file");
        for (int i = 0 ; i < 10 ; i++) {
            out.print(i + " ");
        }

        // 3.closing the output channel and the file
        out.close();
        fw.close();

        // Reading from a text file (읽기위한 file)
        // 1.opening the file for reading
        FileReader fr = new FileReader("text.txt");
        BufferedReader in = new BufferedReader(fr);

        // 2.reading a line of text from the file
        String line = in.readLine();
        System.out.println(line);
        String line2 = in.readLine();
        System.out.println(line2);

        // 3.closing the file
        fr.close();


        File f1 = new File("garbage.txt");
        boolean b = f1.delete();
        // delete() : 파일이 성공적으로 삭제되면 true를 반환한다.
        System.out.println(b);

        File f2 = new File("oldname.txt");
        File f3 = new File("newname.txt");
        boolean a = f2.renameTo(f3);
        // renameTO(File) : 파일 이름이 성공적으로 바뀌면 true를 반환한다. 변경할 파일이 있으면 덮어씌운다.
        System.out.println(a);
    }
}

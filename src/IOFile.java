import java.io.*;

public class IOFile {
    private String fileName;

    public IOFile() {}
    public IOFile(String fileName) {
        this.fileName = fileName;
    }

    public int countLines() throws IOException {
        int count = 0;
        FileReader fr = new FileReader(fileName);
        BufferedReader in = new BufferedReader(fr);
        String line = in.readLine();
        while (line != null) {
            count++;
            line = in.readLine();
        }
        fr.close();
        in.close();
        return count;
    }

    public void write(OutputStream os) throws IOException {
        // 파일의 내용을 os에 기록하는 것; 

        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();

        PrintWriter pw = new PrintWriter(os);
        while(true) {
            if (line == null) {
                break;
            }
            pw.println(line);
            line = br.readLine();
        }
        pw.close();
        fr.close();
    }
    public void print() throws IOException {
        // 파일의 내용을 비디오에 인쇄하는것;
        FileReader fr = new FileReader(fileName);
        BufferedReader in = new BufferedReader(fr);

        String line = in.readLine();
        while(true) {
            if (line != null) {
                System.out.println(line);
                line = in.readLine();
            }
        }
    }
    public void copy(String filename) throws IOException {
        // 파일의 내용을 filename이란 이름에 지정된 파일로 복사합니다.
        FileReader f = new FileReader(this.fileName);
        BufferedReader br = new BufferedReader(f);

        FileWriter newF = new FileWriter(filename);
        PrintWriter pw = new PrintWriter(newF);
        
        String line = br.readLine();
        while (true) {
            if (line ==null) {
                break;
            }
            pw.println(line);
            line = br.readLine();
        }
        f.close();
        pw.close();
        newF.close();
    }
    void delete() {
        // 대용량 스토리지에서 파일을 삭제합니다.
        File f = new File(fileName);
        f.delete();
    }
}

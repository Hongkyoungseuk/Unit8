import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;

public class IOFile {
    private String fileName;
    private File f;
    private String[] contents;

    public IOFile() {}
    public IOFile(String fileName) {
        this.fileName = fileName;
        this.f = new File(fileName);
    }

    public int countLines() throws IOException {
        int count = 0;
        FileReader fr = new FileReader(f);
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

    public void write(OutputStream os) {
        //TODO 파일의 내용을 os에 기록하는 것;

        

    }
    public void print() {
        //TODO 파일의 내용을 비디오에 인쇄하는것;
    }
    public void copy(String filename) {
        //TODO 파일의 내용을 filename이란 이름에 지정된 파일로 복사합니다.
    }
    void delete() {
        //TODO  대용량 스토리지에서 파일을 삭제합니다.
    }
}

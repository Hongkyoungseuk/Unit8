import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class IOStrings {
    
    public String[] loandArray(InputStream is, int n) throws IOException {
        //is에 의해 지정된 입력 채널에서 읽은 n개의 문자열 배열을 반환합니다.
        String[] st = new String[n];
        
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        for (int i = 0; i < n ; i++) {
            st[i] = br.readLine();
        }
        return st;
    }

    public void saveArray(OutputStream os, String[] sa) {
        PrintStream ps = new PrintStream(os);
        PrintWriter pw = new PrintWriter(os);   // or
        for (int i = 0 ; i < sa.length ; i++) {
            ps.println(ps);
        }
    }
}

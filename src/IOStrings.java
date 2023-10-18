import java.io.*;

public class IOStrings {
    
    public String[] loadArray(InputStream is, int n) throws IOException {
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
        // os에 의해 지정된 출력 채널에 문자열 sa의 배열을 씁니다.
        PrintWriter pw = new PrintWriter(os);   
        for (int i = 0 ; i < sa.length ; i++) {
            pw.println(sa[i]);
        }
        pw.close();
    }
}

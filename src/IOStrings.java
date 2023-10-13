import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class IOStrings {
    
    public String[] loandArray(InputStream is, int n) {
        //is에 의해 지정된 입력 채널에서 읽은 n개의 문자열 배열을 반환합니다.
        String[] st = new String[n];
        for (int i = 0; i < n ; i++) {
            st[i] = is.toString();
        }
        return st;
    }

    public void saveArray(OutputStream os, String[] sa) {
        for (int i = 0 ; i < sa.length ; i++) {
            System.out.println();
        }
        
        
    }
}

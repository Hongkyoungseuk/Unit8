import java.io.File;

public class Exercise4 {
    

    public static void multipTable(File file) {
        String fileName;
        long n;
        fileName = file.getName(); // 파일의 이름 "~~.~~""
        n = file.length(); // 파일의 크기
        
        System.out.println(fileName);
        for (int j = 0; j < n ; j++) {
            for (int i = 0; i < n ; i++) {
                System.out.print(i*j + " ");
            }
            System.out.println("");
        }
    }
}

import java.io.File;

public class Exercise4 {
    
    public static void multipTable(File file, int n) {
        String fileName;
        fileName = file.getName(); // 파일의 이름 "~~.~~""
        
        System.out.println(fileName);
        for (int j = 1; j <= n ; j++) {
            for (int i = 1; i <= n ; i++) {
                System.out.print(i*j + " ");
            }
            System.out.println("");
        }
    }
}

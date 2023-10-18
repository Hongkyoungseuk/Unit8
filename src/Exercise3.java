import java.io.*;

public class Exercise3 {
    
    private String filename;

    Exercise3(String name) {
        this.filename = name;
    }

    public void print() throws IOException{
        switch(filename.charAt(0)) {
            case '/' : case ';' : case '%' :
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line != null) {
                System.out.println(line);
                line = br.readLine();
            }
            fr.close();

            default :
        }
    }
    
}

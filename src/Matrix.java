import java.io.*;

public class Matrix {
    private int[][] matrix;

    Matrix(int n, int m) {
        this.matrix = new int[n][m];
    }

    public void save(String filename) throws IOException{
        FileWriter fw = new FileWriter(filename);
        PrintWriter pw = new PrintWriter(fw);
        
        for (int i = 0 ; i < matrix.length ; i++) {
            for (int j = 0 ; j < matrix[0].length ; j++) {
                pw.println(matrix[i][j]);
            }
        }
        pw.close();
        fw.close();
    }
    public static Matrix read(String filename) throws IOException{
        //TODO
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);



        return matrix ;
    }
    public Matrix sum(Matrix m) {
        if (matrix.length != m.matrix.length) {
            return null;
        }
        if (matrix[0].length != m.matrix[0].length) {
            return null;
        }
        Matrix result = new Matrix(matrix.length, matrix[0].length);
        for (int i = 0 ; i < matrix.length ; i++) {
            for (int j = 0 ; j < matrix[0].length ; j++) {
                result.matrix[i][j] = this.matrix[i][j] + m.matrix[i][j];
            }
        }
        return result;
    }
    public Matrix product(Matrix m) {
        if (matrix.length != m.matrix.length) {
            return null;
        }
        if (matrix[0].length != m.matrix[0].length) {
            return null;
        }
        Matrix result = new Matrix(matrix.length, matrix[0].length);
        for (int i = 0 ; i < matrix.length ; i++) {
            for (int j = 0 ; j < matrix[0].length ; j++) {
                result.matrix[i][j] = this.matrix[i][j] * m.matrix[i][j];
            }
        }
        return result;
    }
}

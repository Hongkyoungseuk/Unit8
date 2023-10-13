import java.util.Scanner;

public class Exercise2 {
    

    public static double average() {
        double avg;
        int sum = 0;
        int count = 1;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while (num != 0) {
            sum += num;
            num = sc.nextInt();
        }

        avg = sum/count;
        sc.close();
        return avg;
    }
}

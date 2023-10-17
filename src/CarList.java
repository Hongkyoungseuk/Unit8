import java.io.*;

public class CarList {

    private String filename;

    public CarList(String fn) {
        this.filename = fn;
    }

    public int countNewCars() throws IOException {
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);

        int count = 0;
        Car c = Car.read(br);
        while (c != null) {
            if (c.getDriven_kilometers() == 0) {
                count++;
            }
            c = Car.read(br);
        }
        br.close();
        return count;
    }
    public Car mostExpensiveCar() throws IOException {
        FileInputStream is = new FileInputStream(filename);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        double max = 0;
        Car cmax = null;
        Car c = Car.read(br);
        while (c != null) {
            if (c.getPrice() > max) {
                max = c.getPrice();
                cmax = c;
            }
            c = Car.read(br);
        }
        br.close();
        return cmax;
    }
    public void addCar(Car c) throws IOException {
        FileWriter fw = new FileWriter(filename, true);
        PrintWriter pw = new PrintWriter(fw);

        pw.println(c.getModel());
        pw.println(c.getManufacturing_year());
        pw.println(c.getDriven_kilometers());
        pw.println(c.getPrice());
        pw.close();
    }
    public void removeCar(Car c) throws IOException {
        File f = new File(filename);
        FileInputStream is = new FileInputStream(f);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        File ftemp = new File("cars-temporary.txt");
        FileOutputStream os = new FileOutputStream(ftemp);
        PrintWriter pw = new PrintWriter(os);

        Car curr = Car.read(br);
        while (curr != null) {
            if (!curr.equalTo(c)) {
                pw.println(curr.getModel());
                pw.println(curr.getManufacturing_year());
                pw.println(curr.getDriven_kilometers());
                pw.println(curr.getPrice());
            }
            curr = Car.read(br);
        }
        br.close();
        pw.close();
        ftemp.renameTo(f);
    }

}

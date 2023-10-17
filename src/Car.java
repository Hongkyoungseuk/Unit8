import java.io.*;

public class Car {
    
    private String model;
    private int manufacturing_year;
    private int driven_kilometers;
    private double price;

    public Car(String m, int y, int k, double p) {
        this.model = m;
        this.manufacturing_year = y;
        this.driven_kilometers = k;
        this.price = p;
    }

    public String toString() {
        return model + ", year: " + manufacturing_year + ", km: " + driven_kilometers + ", price: " + price;
    }
    public boolean equalTo(Car c) {
        return this.model.equals(c.model) && this.manufacturing_year == c.manufacturing_year && this.driven_kilometers == c.driven_kilometers && this.price == c.price;
    }
    public static Car read(BufferedReader br) throws IOException {
        String s = br.readLine();
        if (s == null) {
            return null;
        } else {
            return new Car(s, Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()), Double.parseDouble(br.readLine()));
        }
    }

    //get
    public String getModel() {
        return model;
    }
    public int getManufacturing_year() {
        return manufacturing_year;
    }
    public int getDriven_kilometers() {
        return driven_kilometers;
    }
    public double getPrice() {
        return price;
    }
}

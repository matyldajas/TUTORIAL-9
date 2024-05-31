// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Vehicle c=new Car("Volvo","c30",2012,215,10);
        Vehicle t=new Truck("Volvo","t20",2020,1000,100,5000);
        System.out.println(c.calculateFuelEfficiency());
        System.out.println(t.calculateFuelEfficiency());

    }
}

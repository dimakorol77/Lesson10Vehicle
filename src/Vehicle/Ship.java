package Vehicle;

public class Ship extends Vehicle {

    private int PassengersQuantaty;
    private String Port;
    public Ship(int price, int speed, int year, int passengersQuantaty, String port) {
        super(price, speed, year);
        PassengersQuantaty = passengersQuantaty;
        Port = port;
    }
  public String toString()
  { return   getPrice()+" "+ getSpeed()+" " + getYear()+ " "+ Port+" "+ PassengersQuantaty; }

}

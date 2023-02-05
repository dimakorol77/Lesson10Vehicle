public class Plain extends Vehicle {
    private int Height;
    private int PassengersQuantaty;




    public Plain(int price, int speed, int year, int height, int passengersQuantaty) {
        super(price, speed, year);
        Height = height;
        PassengersQuantaty = passengersQuantaty;
    }

    public int getHeight() {
        return Height;
    }

    public int getPassengersQuantaty() {
        return PassengersQuantaty;
    }

    public String toString()
    { return   getPrice()+" "+ getSpeed()+" " + getYear()+ " "+ Height+" "+ PassengersQuantaty; }




}

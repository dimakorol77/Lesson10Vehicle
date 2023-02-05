public class Car extends Vehicle {



    public Car(int price, int speed, int year) {
        super(price, speed, year);
    }

    public String toString()
    { return   getPrice()+" "+ getSpeed()+" " + getYear(); };}


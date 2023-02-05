package Vehicle;

public class Main {


    public static void main(String[] args) {
        Plain plain1 = new Plain(10000000,800,2001,25,220);
         Car car1 = new Car(20000, 250, 2019);
         Ship ship1 = new Ship(300000000, 75,2000, 5000, "Liverpool" );


        System.out.println(ship1.toString() );
        System.out.println(car1.toString() );
        System.out.println(plain1.toString() );
    }
}
//Використовуючи IntelliJ IDEA, створіть проект.
// Потрібно: Створити клас Vehicle.Vehicle. У тілі класу створіть поля: координати та параметри суден (ціна, швидкість, рік випуску).
// Створіть 3 похідних класи Plane, Саг та Vehicle.Ship. Для класу Plane має бути визначена висота та кількість пасажирів. Для класу Vehicle.Ship – кількість пасажирів та порт приписки.
// Написати програму, яка виводить на екран інформацію про кожен засіб пересування.
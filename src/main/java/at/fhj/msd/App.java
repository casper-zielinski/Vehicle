package at.fhj.msd;

import at.fhj.msd.vehicles.Car;
import at.fhj.msd.vehicles.Motorcycle;
import at.fhj.msd.vehicles.Vehicle;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(4, 10, 100);
        System.out.println(v.calcAcceleration());
        Motorcycle m = new Motorcycle(10, 100);
        System.out.println(m.calcAcceleration());
        Car c2 = new Car("lol", 4, 10, 100);
        System.out.println(c2.calcAcceleration());
        System.out.println(c2.toString());
        System.out.println(m);
        System.out.println(v);
        
    
    }
}

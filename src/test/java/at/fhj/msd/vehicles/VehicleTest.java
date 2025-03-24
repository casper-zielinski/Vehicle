package at.fhj.msd.vehicles;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class VehicleTest {
      Vehicle vehicle;
      Motorcycle motorcycle;


      @Test
      @DisplayName("Test1")
      void test()
      {
            vehicle = new Vehicle(4, 10, 100);
            assertEquals(vehicle.calcAcceleration(), 40);
      }

      @Test
      @DisplayName("Test2")
      void test1()
      {
            motorcycle = new Motorcycle(10, 100);
            assertEquals(80, motorcycle.calcAcceleration());
      }



}

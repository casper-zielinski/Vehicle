package at.fhj.msd.vehicles;

public class Car extends Vehicle {

      protected String make;
      public Car(String make, int wheels, int weight, int horsepower){
            super(wheels,weight,horsepower);
            this.make = make;
      }

      public String getMake()
      {
            return this.make;
      }

      @Override
      public String toString()
      {
            return String.format("this Car has %d wheels, %d horsepower and wheights: %d", this.wheels, 
            this.horsepower, this.weight);
      }
}

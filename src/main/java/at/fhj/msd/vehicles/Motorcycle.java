package at.fhj.msd.vehicles;

public class Motorcycle extends Vehicle {

      

      public Motorcycle(int weight, int horsepower){
            super(2,weight,horsepower);
      }

      @Override
      public double calcAcceleration()
      {
            return (((this.horsepower)/(this.weight/2)))*4;
      }

      @Override
      public String toString()
      {
            return String.format("this Motorcycle has %d horsepower and wheights: %d", 
            this.horsepower, this.weight);
      }
}

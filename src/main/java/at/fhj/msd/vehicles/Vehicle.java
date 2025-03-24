package at.fhj.msd.vehicles;

import java.awt.Rectangle;
import java.util.Objects;

public class Vehicle extends Object{
      protected int wheels;
      protected int weight;
      protected int horsepower;


      public Vehicle(int wheels, int weight, int horsepower)
      {
            this.wheels = wheels;
            this.weight = weight;
            this.horsepower = horsepower;
      }

      public double calcAcceleration()
      {
            return (this.horsepower / this.weight) * this.wheels; 
      }

      @Override
      public String toString()
      {
            return String.format("this Vehicle has %d wheels, has %d horsepower and wheights: %d", this.wheels, 
            this.horsepower, this.weight);
      }

      @Override
      public boolean equals(Object obj)
      {
            if (obj == this) return true;
            Vehicle other = (Vehicle)obj;
            if (!(obj instanceof Rectangle))
            {
                  return false;
            }
            if ( getClass() != obj.getClass())
            {
                  return false;
            }
            return this.horsepower == other.horsepower && this.weight == other.weight
            && this.wheels == other.wheels;
      }

      @Override
      public int hashCode()
      {
            return Objects.hash(this.horsepower, this.weight, this.wheels);
      }

}

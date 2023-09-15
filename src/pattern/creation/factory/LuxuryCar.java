package pattern.creation.factory;

import utils.CarType;

public class LuxuryCar extends Car {

   LuxuryCar() {
    super(CarType.LUXURY);
    this.construct();
  }

  @Override
  protected void construct() {
    System.out.println("This is a constructor of Luxury Car.");
  }
}

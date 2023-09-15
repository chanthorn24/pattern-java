package pattern.creation.factory;

import utils.CarType;

public class SedanCar extends Car {

  protected SedanCar() {
    super(CarType.SEDAN);
    this.construct();
  }

  @Override
  protected void construct() {
    System.out.println("This is a constructor of Sedan Car.");
  }
}

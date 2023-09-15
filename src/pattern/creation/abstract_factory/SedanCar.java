package pattern.creation.abstract_factory;

import utils.CarType;
import utils.LocationType;

public class SedanCar extends Car {

  protected SedanCar(LocationType location) {
    super(CarType.SEDAN, location);
    this.construct();
  }

  @Override
  protected void construct() {
    System.out.println("Building sedan car");
  }
}

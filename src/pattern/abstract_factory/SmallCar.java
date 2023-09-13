package pattern.abstract_factory;

import utils.CarType;
import utils.LocationType;

public class SmallCar extends Car {

  protected SmallCar(LocationType location) {
    super(CarType.SMALL, location);
    this.construct();
  }

  @Override
  protected void construct() {
    System.out.println("Building small car");
  }
}

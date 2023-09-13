package pattern.abstract_factory;

import utils.CarType;
import utils.LocationType;

public class LuxuryCar extends Car {

  protected LuxuryCar(LocationType location) {
    super(CarType.LUXURY, location);
    this.construct();
  }

  @Override
  protected void construct() {
    System.out.println("Building luxury car");
  }
}

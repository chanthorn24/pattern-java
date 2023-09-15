package pattern.creation.abstract_factory;

import utils.CarType;
import utils.LocationType;

public class CambodiaCarFactory {

  private CambodiaCarFactory() {}

  public static Car buildCar(CarType model) {

    Car car = null;

    switch (model) {
      case SEDAN -> car = new SedanCar(LocationType.CAMBODIA);
      case SMALL -> car = new SmallCar(LocationType.CAMBODIA);
      case LUXURY -> car = new LuxuryCar(LocationType.CAMBODIA);
    }

    return car;
  }
}

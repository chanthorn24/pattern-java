package pattern.creation.factory;

import utils.CarType;

public class CarFactory {

  private CarFactory() {}

  public static Car builderCar(CarType model) {
    Car car = null;
    switch (model) {
      case SMALL -> car = new SmallCar();
      case LUXURY -> car = new LuxuryCar();
      case SEDAN -> car = new SedanCar();
    }

    return car;
  }
}

package pattern.creation.factory;

import utils.CarType;

public class SmallCar extends Car {

  protected SmallCar() {
    super(CarType.SMALL);
    this.construct();
  }

  @Override
  protected void construct() {
    System.out.println("This is a constructor of Small Car.");
  }
}

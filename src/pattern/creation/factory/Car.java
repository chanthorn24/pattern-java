package pattern.creation.factory;

import utils.CarType;

public abstract class Car {

  protected Car(CarType model) {
    this.model = model;
    this.arrangeParts();
  }

  private void arrangeParts() {
    // Do one time processing here
    System.out.println(
        String.format("Car: this part is arrangeParts of %s", this.model.getValue())
    );
  }

  // Do subclass level processing in this method
  protected abstract void construct();

  private CarType model;

  public CarType getModel() {
    return model;
  }

  public void setModel(CarType model) {
    this.model = model;
  }
}

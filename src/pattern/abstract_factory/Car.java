package pattern.abstract_factory;


import utils.CarType;
import utils.LocationType;

public abstract class Car {

  protected Car(CarType model, LocationType location) {
    this.model = model;
    this.location = location;
  }

  protected abstract void construct();

  private CarType model;
  private LocationType location;

  @Override
  public String toString() {
    return "Model - " + model + " built in " + location;
  }

  // GETTER/SETTER
  public CarType getModel() {
    return model;
  }

  public void setModel(CarType model) {
    this.model = model;
  }

  public LocationType getLocation() {
    return location;
  }

  public void setLocation(LocationType location) {
    this.location = location;
  }
}

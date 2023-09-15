package pattern.structural.adapter;

public class MovableAdapterImpl implements MovableAdapter {

  // dependency injection
  private final Movable luxuryCar;

  public MovableAdapterImpl(Movable luxuryCar) {
    this.luxuryCar = luxuryCar;
  }

  @Override
  public double getSpeed() {
    return convertMPHtoKMPH(luxuryCar.getSpeed());
  }

  private double convertMPHtoKMPH(double mph) {
    return mph * 1.60934;
  }
}

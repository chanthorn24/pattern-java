package pattern.creation.execute;

import utils.CarType;
import utils.ExecutionContext;

public abstract class CarAbstract implements CarInterface {

  protected abstract void buildCar(CarType model);

  protected abstract String getMessage();

  @Override
  public void execute(ExecutionContext context) {
    CarType model = CarType.valueOf(context.get("model").toString());
    buildCar(model);
    System.out.println(getMessage());
  }
}

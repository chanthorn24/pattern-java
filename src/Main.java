import pattern.creation.abstract_factory.CambodiaCarFactory;
import pattern.creation.factory.CarFactory;
import pattern.structural.adapter.BmwCar;
import pattern.structural.adapter.Movable;
import pattern.structural.adapter.MovableAdapter;
import pattern.structural.adapter.MovableAdapterImpl;
import pattern.structural.adapter.ToyotaCar;
import utils.CarType;

public class Main {

  public static void main(String[] args) {
    /*
     * @pattern type: Factory
     * @usage: factory pattern is used to create instances of different classes of the same type.

     * @since 09-10-2023
     * @author Chanthorn LY
     */
    System.out.println("""
                
        ### Factory Pattern
        """);
    System.out.println(CarFactory.builderCar(CarType.LUXURY));
    System.out.println(CarFactory.builderCar(CarType.SMALL));
    System.out.println(CarFactory.builderCar(CarType.SEDAN));

    /*
     * @pattern type: Abstract Factory
     * @usage: considered as another layer of abstraction over factory pattern

     * @since 09-10-2023
     * @author Chanthorn LY
     */
    System.out.println("""
                
                
        ### Abstract Factory Pattern
        """);
    System.out.println(CambodiaCarFactory.buildCar(CarType.SMALL));
    System.out.println(CambodiaCarFactory.buildCar(CarType.LUXURY));
    System.out.println(CambodiaCarFactory.buildCar(CarType.SEDAN));

    /*
     * @pattern type: Singleton
     * @usage: Singleton pattern is a design solution where an application wants to have one
     *         and only one instance of any class

     * @since 09-10-2023
     * @author Chanthorn LY
     */
    System.out.println("""
                
                
        ### Singleton Pattern
        """);

    /*
     * @pattern type: Adapter
     * @usage: Adapter, It enables two incompatible interfaces to work smoothly with each other.
     *         Convert the interface of a class into another interface clients expect.

     * @since 09-10-2023
     * @author Chanthorn LY
     */
    System.out.println("""
                
                
        ### Adapter Design Pattern
        """);
    Movable bmw = new BmwCar();
    Movable toyota = new ToyotaCar();
    MovableAdapter bmwAdapter = new MovableAdapterImpl(bmw);
    MovableAdapter toyotaAdapter = new MovableAdapterImpl(toyota);
    System.out.println(bmw.getSpeed());
    System.out.println(bmwAdapter.getSpeed());
    System.out.println(toyota.getSpeed());
    System.out.println(toyotaAdapter.getSpeed());
  }
}
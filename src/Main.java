import pattern.abstract_factory.CambodiaCarFactory;
import pattern.factory.CarFactory;
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

  }
}
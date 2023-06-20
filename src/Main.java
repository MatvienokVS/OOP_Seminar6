import Work3.CasualGreetingStrategy;
import Work3.FormalGreetingStrategy;
import Work3.Greeter;
import Work3.IntimateGreetingStrategy;
import work1.Rectangle;
import work1.Shape;
import work1.Square;

public class Main {
    public static void main(String[] args) {
        // Пример использования классов и интерфейсов
        Shape rectangle = new Rectangle(5, 3);
        System.out.println("Rectangle area: " + rectangle.calculateArea());

        Shape square = new Square(4);
        System.out.println("Square area: " + square.calculateArea());

        Greeter greeter = new Greeter();
        greeter.setGreetingStrategy(new FormalGreetingStrategy());
        System.out.println(greeter.greet());

        greeter.setGreetingStrategy(new CasualGreetingStrategy());
        System.out.println(greeter.greet());

        greeter.setGreetingStrategy(new IntimateGreetingStrategy());
        System.out.println(greeter.greet());
    }
}

package Work3;

// Формальное приветствие
public class FormalGreetingStrategy implements work3.GreetingStrategy {
    @Override
    public String generateGreeting() {
        return "Good evening, sir.";
    }
}

package Work3;

// Неформальное приветствие
public class CasualGreetingStrategy implements work3.GreetingStrategy {
    @Override
    public String generateGreeting() {
        return "Sup bro?";
    }
}

package Work3;

public class Greeter {
    private work3.GreetingStrategy greetingStrategy;

    public void setGreetingStrategy(work3.GreetingStrategy greetingStrategy) {
        this.greetingStrategy = greetingStrategy;
    }

    public String greet() {
        if (greetingStrategy == null) {
            throw new IllegalStateException("Greeting strategy is not set");
        }
        return greetingStrategy.generateGreeting();
    }
}

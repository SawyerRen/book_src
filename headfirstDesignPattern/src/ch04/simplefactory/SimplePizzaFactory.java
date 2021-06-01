package ch04.simplefactory;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new Pizza();
        }
        return pizza;
    }
}

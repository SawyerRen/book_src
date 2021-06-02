package ch04_factory.factorymethod;

public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza() {
        name = "chicago style cheese pizza";
        dough = "thick crust";
        sauce = "tomato sauce";
        toppings.add("shredded cheese");
    }
}

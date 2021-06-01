package ch04.factorymethod;

public class NYStyleCheesePizza extends Pizza{
    public NYStyleCheesePizza() {
        name = "NY style cheese pizza";
        dough = "thin crust";
        sauce = "marinara sauce";
        toppings.add("grated cheese");
    }
}

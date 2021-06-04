package ch08_template_method;

public abstract class Beverage {
    void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected abstract void addCondiments();

    private void pourInCup() {
        System.out.println("pour in cup");
    }

    protected abstract void brew();

    private void boilWater() {
        System.out.println("boil water");
    }
}

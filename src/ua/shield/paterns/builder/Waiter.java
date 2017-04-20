package ua.shield.paterns.builder;

/**
 * Created by sa on 19.04.17.
 */
public class Waiter {
    BuilderPizza builderPizza;
    public void setBuilderPizza(BuilderPizza builderPizza) {
        this.builderPizza = builderPizza;
    }

    public void createPizza() {
        builderPizza.createPizza();
        builderPizza.setDough();
        builderPizza.setSouce();
        builderPizza.setTopic();
    }

    public Pizza getPizza() {
        return builderPizza.getPizza();
    }
}

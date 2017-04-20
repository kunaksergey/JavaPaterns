package ua.shield.paterns.builder;

/**
 * Created by sa on 19.04.17.
 */
public class Main {
    public static void main(String[] args) {
        Waiter waiter=new Waiter();
        BuilderPizza builderPizza=new UniversalPizzaBuilder();
        waiter.setBuilderPizza(builderPizza);
        waiter.createPizza();
        Pizza pizza=waiter.getPizza();
        System.out.println(pizza);

    }
}

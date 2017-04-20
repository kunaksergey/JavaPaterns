package ua.shield.paterns.builder;

/**
 * Created by sa on 19.04.17.
 */
public class UniversalPizzaBuilder extends BuilderPizza {
    @Override
    void setDough() {
        pizza.setDough("doughtTwo");
    }

    @Override
    void setSouce() {
        pizza.setSouce("Souce UNi");
    }

    @Override
    void setTopic() {
        pizza.setTopic("Topic mayonez");
    }
}

package ua.shield.paterns.builder;

/**
 * Created by sa on 19.04.17.
 */
public class HawaiPizzaBuilder extends BuilderPizza {
    @Override
    void setDough() {
        pizza.setDough("doughtOne");
    }

    @Override
    void setSouce() {
        pizza.setSouce("Souce chili");
    }

    @Override
    void setTopic() {
        pizza.setTopic("Topic tomate");
    }
}

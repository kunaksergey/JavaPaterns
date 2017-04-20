package ua.shield.paterns.builder;

/**
 * Created by sa on 19.04.17.
 */
abstract public class BuilderPizza {
    Pizza pizza;

    public void createPizza(){
        pizza=new Pizza();
    }
    abstract void setDough();
    abstract void setSouce();
    abstract void setTopic();

    public Pizza getPizza() {
        return pizza;
    }
}

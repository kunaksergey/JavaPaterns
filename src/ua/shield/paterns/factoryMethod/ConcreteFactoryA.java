package ua.shield.paterns.factoryMethod;

/**
 * Created by sa on 20.04.17.
 */
public class ConcreteFactoryA extends AbstractFactory {
    @Override
    Product createProduct() {
        return new ConcreteProductA();
    }
}

package ua.shield.paterns.factoryMethod;

/**
 * Created by sa on 20.04.17.
 * Фабричный метод:
 * Тип: Порождающий
 * Цель:Предоставить потомкам интерфейс для создания экзеспляров некоторого класса
 */
public class Main {
    public static void main(String[] args) {
        Product  productA=new ConcreteFactoryA().createProduct();
        Product  productB=new ConcreteFactoryB().createProduct();
    }
}

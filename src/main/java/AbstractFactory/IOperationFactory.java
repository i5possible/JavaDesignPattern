package abstractfactory;

/**
 * Created by hliang on 08/12/2016.
 */

/**
 It's the Abstract Factory.
 The different betweent FactoryMethod and AbstractFactory is that the factory interface in AbstractFactory can
 produce kinds of Products. And the factory in FactoryMethod only can create a type of product.

 REFLECTION can be used to improve the AbstractFactory.
 */

public interface IOperationFactory {
    public IGenericOperation getNormalOperation();

    public ISpecialOperation getSpecialOperation();
}

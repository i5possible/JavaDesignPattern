package FactoryMethod;

/**
 * Created by hliang on 08/12/2016.
 */

/**
 * The different between SimpleFactory and FactoryMethod is that we extract IOperationFactory as an interface.
 * And for each Factory, we created the related FactoryClass Instead of the Only Factory in SimpleFactory.
 * The key point is the Interface of the Factory.
 */
public interface IOperationFactory {
    public IOperation getOperation();
}

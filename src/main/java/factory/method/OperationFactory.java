package factory.method;

/**
 * Created by hliang on 08/12/2016.
 */

/**
 * The different between simpleFactory and factoryMethod is that we extract OperationFactory as an interface.
 * And for each Factory, we created the related FactoryClass Instead of the Only Factory in simpleFactory.
 * The key point is the Interface of the Factory.
 */
public interface OperationFactory {
    public Operation getOperation();
}

package FactoryMethod;

/**
 * Created by hliang on 08/12/2016.
 */

/*
And instance of concrete factory.
 */
public class OperationMinusFactory implements IOperationFactory {
    @Override
    public IOperation getOperation() {
        return new OperationMinus();
    }
}

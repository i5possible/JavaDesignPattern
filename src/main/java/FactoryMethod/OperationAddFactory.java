package factorymethod;

/**
 * Created by hliang on 08/12/2016.
 */

/*
And instance of concrete factory.
 */
public class OperationAddFactory implements IOperationFactory {
    @Override
    public IOperation getOperation() {
        return new OperationAdd();
    }
}

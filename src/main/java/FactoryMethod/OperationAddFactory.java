package factorymethod;

/**
 * Created by hliang on 08/12/2016.
 */

/*
And instance of concrete factory.
 */
public class OperationAddFactory implements OperationFactory {
    @Override
    public Operation getOperation() {
        return new OperationAdd();
    }
}

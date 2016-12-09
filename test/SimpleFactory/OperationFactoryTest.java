package SimpleFactory;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hliang on 08/12/2016.
 */
public class OperationFactoryTest {
    @Test
    public void OperationAddTest() {
        Operation operation = new OperationFactory().createOperation("+").get();
        Assert.assertEquals(3.3, operation.getResult(1.1, 2.2), 1e-9);
    }

    @Test
    public void OperationMinusTest() {
        Operation operation = new OperationFactory().createOperation("-").get();
        Assert.assertEquals(-1.1, operation.getResult(1.1, 2.2), 1e-9);
    }

    @Test
    public void InvalidOperation() {
        boolean operationIsPresent = new OperationFactory().createOperation("InvalidOperation").isPresent();
        Assert.assertEquals(false, operationIsPresent);
    }
}

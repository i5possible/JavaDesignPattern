package factory.method;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hliang on 08/12/2016.
 */
public class OperationFactoryMethodTest {
    @Test
    public void OperationAddTest() {
        Operation operation = new OperationAddFactory().getOperation();
        Assert.assertEquals(3.3, operation.getResult(1.1, 2.2), 1e-9);
    }

    @Test
    public void OperationMinusTest() {
        Operation operation = new OperationMinusFactory().getOperation();
        Assert.assertEquals(-1.1, operation.getResult(1.1, 2.2), 1e-9);
    }
}

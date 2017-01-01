package factorymethod;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hliang on 08/12/2016.
 */
public class OperationFactoryMethodTest {
    @Test
    public void OperationAddTest() {
        Operation ioperation = new OperationAddFactory().getOperation();
        Assert.assertEquals(3.3, ioperation.getResult(1.1, 2.2), 1e-9);
    }

    @Test
    public void OperationMinusTest() {
        Operation ioperation = new OperationMinusFactory().getOperation();
        Assert.assertEquals(-1.1, ioperation.getResult(1.1, 2.2), 1e-9);
    }
}

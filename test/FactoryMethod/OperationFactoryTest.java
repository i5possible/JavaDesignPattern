package FactoryMethod;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hliang on 08/12/2016.
 */
public class OperationFactoryTest {
    @Test
    public void OperationAddTest() {
        IOperation ioperation = new OperationAddFactory().getOperation();
        Assert.assertEquals(3.3, ioperation.getResult(1.1, 2.2), 1e-9);
    }

    @Test
    public void OperationMinusTest() {
        IOperation ioperation = new OperationMinusFactory().getOperation();
        Assert.assertEquals(-1.1, ioperation.getResult(1.1, 2.2), 1e-9);
    }
}

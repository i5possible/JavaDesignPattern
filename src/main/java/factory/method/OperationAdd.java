package factory.method;

/**
 * Created by hliang on 08/12/2016.
 */

/**
 * An Instance of the concrete product.
 */
public class OperationAdd implements Operation {
    @Override
    public Double getResult(Double numberA, Double numberB) {
        return numberA + numberB;
    }
}

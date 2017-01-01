package simplefactory;

/**
 * Created by hliang on 08/12/2016.
 */

/******
 * SimpleFactory*****
 * The SimpleFactory is used for create objects.
 * It's define a interface to create a series of objects.
 */

public interface Operation {
    public Double getResult(Double numberA, Double numberB);
}

package SimpleFactory;

import java.util.List;

/**
 * Created by hliang on 08/12/2016.
 */
public class OperationAdd implements OperationInterface {

    private List<Double> numbers;

    public OperationAdd (Double numberA,Double numberB) {
        numbers.add(numberA);
        numbers.add(numberB);
    }

    public OperationAdd (List<Double> numbers) {
        this.numbers = numbers;
    }
    @Override
    public Double getResult() {
        Double result = 0.0;
        for (Double number : numbers) {
            result += number;
        }
        return result;
    }
}

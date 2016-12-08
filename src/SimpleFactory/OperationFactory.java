package SimpleFactory;

import java.util.Optional;

/**
 * Created by hliang on 08/12/2016.
 */
public class OperationFactory {
    public Optional<Operation> createOperation (String operationStr) {
        Optional<Operation> operation;
        switch (operationStr) {
            case "+" :
                operation = Optional.of(new OperationAdd());
                break;
            case "-" :
                operation = Optional.of(new OperationMinus());
                break;
            default :
                operation = Optional.empty();
                break;
            }
        return operation;
    }
}
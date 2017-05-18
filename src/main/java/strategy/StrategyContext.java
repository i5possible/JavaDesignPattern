package strategy;

import java.util.List;

/**
 * Created by hliang on 09/12/2016.
 */
public class StrategyContext {
    private Sort sort;

    public StrategyContext(Sort sort) {
        this.sort = sort;
    }

    public List listSort(List inputList) {
        return this.sort.listSort(inputList);
    }
}

package strategy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StrategyTest {
    @Test
    public void shouldPrintSortTypeWhenCalled () throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        List<String> classList = new ArrayList<String>();
        classList.add("strategy.BubbleSort");
        classList.add("strategy.QuickSort");
        classList.add("strategy.SelectSort");
        classList.forEach(this::doSort);
    }

    public void doSort (String sortType) {
        Sort sort = null;
        try {
            sort = (Sort) Class.forName(sortType).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        List<String> stringArrayList = new ArrayList<String>();
        sort.listSort(stringArrayList);
    }
}

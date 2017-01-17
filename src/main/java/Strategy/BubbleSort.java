package strategy;

import java.util.List;

/**
 * Created by hliang on 09/12/2016.
 */

/**
 * Concrete strategy.
 */
public class BubbleSort implements Sort {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> bubbleSort = Class.forName("strategy.BubbleSort");
        System.out.println(bubbleSort);
    }

    @Override
    public List listSort(List inputList) {
        System.out.println("BubbleSort");
        return null;
    }
}

package strategy;

/**
 * Created by hliang on 09/12/2016.
 */

import java.util.List;

/**
 * Abstract Strategy
 * Define the public interface of the algorithms.
 */
public interface Sort<E> {
    public List listSort(List inputList);
}

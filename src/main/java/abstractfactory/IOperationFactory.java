package abstractfactory;

/**
 * Created by hliang on 08/12/2016.
 */

/**
 * It's the Abstract Factory.
 * The different betweent factoryMethod and abstractfactory is that the factory interface in abstractfactory can
 * produce kinds of Products. And the factory in factoryMethod only can create a type of product.
 * <p>
 * REFLECTION can be used to improve the abstractfactory.
 */

public interface IOperationFactory {
    public IGenericOperation getNormalOperation();

    public ISpecialOperation getSpecialOperation();
}

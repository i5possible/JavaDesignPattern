package prototype;

public class ConcretePrototype extends Prototype {
    StuffInPrototype stuffInPrototype;

    public ConcretePrototype(String id, StuffInPrototype stuffInPrototype) {
        super(id);
        this.stuffInPrototype = stuffInPrototype;
    }

    /**
     * This clone is deep clone.
     * The 'substring(0)' return a new String.
     * The new StuffInPrototype(stuffInPrototype.getName()) is a new Object either.
     * So the two ConcretePrototype contains different object.
     * <p>
     * If use
     * return new ConcretePrototype(this.getId(), this.getStuffInProtoType());
     * The 'id' and the 'stuffInPrototype' is the same. When the cloned object is changed. The origin object is
     * changed either. This is called slight copy.
     */
    @Override
    public ConcretePrototype clone() {
        StuffInPrototype stuffInPrototype = this.getStuffInPrototype();
        StuffInPrototype stuffInPrototype1 = new StuffInPrototype(stuffInPrototype.getName());
        return new ConcretePrototype(this.getId().substring(0), stuffInPrototype1);
    }

    public StuffInPrototype getStuffInPrototype() {
        return stuffInPrototype;
    }

    public void setStuffInPrototype(StuffInPrototype stuffInPrototype) {
        this.stuffInPrototype = stuffInPrototype;
    }
}

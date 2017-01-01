package prototype;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConcretePrototypeTest {
    @Test
    public void shouldTheSameAsOriginObject() {
        ConcretePrototype concretePrototype = new ConcretePrototype("1", new StuffInPrototype());
        ConcretePrototype clone = concretePrototype.clone();
        assertEquals(concretePrototype.getId(), clone.getId());
        assertEquals(concretePrototype.getStuffInPrototype().getName(), clone.getStuffInPrototype().getName());
    }

    @Test
    public void shouldOriginStaySameWhenClonedObjectModified() {
        ConcretePrototype concretePrototype = new ConcretePrototype("1", new StuffInPrototype());
        ConcretePrototype clone = concretePrototype.clone();
        StuffInPrototype stuffInPrototype = clone.getStuffInPrototype();
        stuffInPrototype.setName("modified");
        clone.setStuffInPrototype(stuffInPrototype);
        assertFalse(concretePrototype.getStuffInPrototype() == clone.getStuffInPrototype());
        assertNotEquals(concretePrototype.getStuffInPrototype().getName(), clone.getStuffInPrototype().getName());
    }
}
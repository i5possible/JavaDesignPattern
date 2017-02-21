package visitor;

import java.util.ArrayList;
import java.util.List;

public class Container {
    private List<Element> elements = new ArrayList<>();

    public void attach(Element element) {
        elements.add(element);
    }

    public void detach(Element element) {
        elements.remove(element);
    }

    public void accept(Visitor visitor) {
        elements.forEach(element -> element.accept(visitor));
    }
}

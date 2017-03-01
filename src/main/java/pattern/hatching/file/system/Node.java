package pattern.hatching.file.system;

import java.util.List;

public abstract class Node {
    protected long size;
    protected String name;

    public Node(String name) {
        this.name = name;
    }

    abstract public List<Node> getChildren();

    abstract public long getSize();

    abstract void adopt(Node node);

    abstract void orphan(Node node);

    public String getName() {
        return name;
    }
}
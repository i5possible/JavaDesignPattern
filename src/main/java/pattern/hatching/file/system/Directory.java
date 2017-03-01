package pattern.hatching.file.system;

import java.util.List;

public class Directory extends Node {
    private List<Node> nodes;

    public Directory(String name) {
        super(name);
    }

    @Override
    public List<Node> getChildren() {
        return nodes;
    }

    @Override
    public long getSize() {
        return size + nodes.stream().mapToLong(Node::getSize).sum();
    }

    @Override
    void adopt(Node node) {
        nodes.add(node);
    }

    @Override
    void orphan(Node node) {
        nodes.remove(node);
    }

}

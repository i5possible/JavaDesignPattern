package pattern.hatching.file.system;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class File extends Node {
    public File(String name) {
        super(name);
    }

    @Override
    public List<Node> getChildren() {
        return newArrayList();
    }

    @Override
    public long getSize() {
        return size;
    }

    @Override
    void adopt(Node node) {
        throw new RuntimeException("Bad Operation!");
    }

    @Override
    void orphan(Node node) {
        throw new RuntimeException("Bad Operation!");
    }
}

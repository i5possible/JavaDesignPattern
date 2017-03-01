package pattern.hatching.file.system;

import java.util.Optional;

import static com.google.common.base.Strings.isNullOrEmpty;

public class Client {
    void mkdir (Node current, String path) {
        String subPath = subPath(path);

        if (isNullOrEmpty(path)) {
            current.adopt(new Directory(path));
        } else {
            String name = head(path);
            Optional<Node> node = find(current, name);
            if (node.isPresent()) {
                mkdir(node.get(), subPath);
            } else {
                throw new RuntimeException("No such directory!");
            }
        }
    }

    private String subPath(String path) {
        return path.substring(path.indexOf("/")+1);
    }

    private String head(String path) {
        return path.substring(0, path.indexOf("/"));
    }

    public Optional<Node> find(Node node, String name) {
        return node.getChildren().stream().filter(nodePredicate -> nodePredicate.getName().equals(name)).findAny();
    }
}

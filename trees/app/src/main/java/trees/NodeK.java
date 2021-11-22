package trees;
import java.util.ArrayList;
import java.util.List;

public class NodeK {
    String value;
    List<NodeK > children;


    public NodeK(String value) {
        this.value = value;
        children=new ArrayList<NodeK>();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<NodeK> getChildren() {
        return children;
    }

    public void setChildren(List<NodeK> children) {
        this.children = children;
    }
}

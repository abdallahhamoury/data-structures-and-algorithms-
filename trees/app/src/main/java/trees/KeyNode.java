package trees;

import java.util.ArrayList;
import java.util.List;
public class KeyNode <t>{
    t dataKeyNode;
    List<KeyNode> allChildren=new ArrayList<>();
    public List<KeyNode> getAllChildren() {
        return allChildren;
    }
    public void setAllChildren(List<KeyNode> allChildren) {
        this.allChildren = allChildren;
    }
    public KeyNode(t dataKeyNode) {
        this.dataKeyNode = dataKeyNode;
    }
}

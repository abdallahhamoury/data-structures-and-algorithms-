package trees;

public class Node<t> {
    public t nodeValue;
    public Node<t> left;
    public Node<t> right;
    public Node(t nodeValue) {
        this.nodeValue = nodeValue;
        left=right=null;
    }
}

package linkd.list;

public class Node<T> {
    public Node next;
    public T value;

    // crate constractor take value

    public Node(T value){
        this.value =value;
    }

}

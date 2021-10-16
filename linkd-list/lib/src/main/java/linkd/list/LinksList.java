package linkd.list;

public class LinksList<T> {
    Node head;
    public LinksList(){
        this.head = null;
    }
    // i have create insert , icludes , tosting

    public void insert(T value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }
    boolean includse(T value){
        Node current = head;
        while (current != null){
            if(current.value.equals(value)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public String toString() {
        Node current = head;
        String result = "";
        while (current != null) {
            result+= "{"+current.value+"}--->";
            current = current.next;
        }
        result+="NULL";
        return result;
    }
}

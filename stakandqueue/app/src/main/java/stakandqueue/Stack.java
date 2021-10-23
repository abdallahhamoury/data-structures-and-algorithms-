package stakandqueue;

public class Stack<T> {
    Node<T> top;
    public Stack (){
        this.top=null;
    }
    public void push(T value){
        Node newNode = new Node(value);
        newNode.next=top;
        top=newNode;
    }
    public Node pop(){
        if (top.next ==null){
            Node current2=top;
            top=null;
            return current2;
        }
        Node current=top;
        top=top.next;
        current.next=null;
        return current;
    }
    public boolean isEmppty(){
        if(top ==null){
            return true;
        }else {
            return false;
        }
    }
    public T peek(){
        return top.value;
    }
    public String toString (){
        Node current=top;
        String result="";
        while (current !=null){
            result +="{ "+current.value +" } ->";
        }
        result+="Null";
        return result;
    }





}
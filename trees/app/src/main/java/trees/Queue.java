package trees;

public class Queue<t> {
    public Node front;
    public Node rear;
    public void enqueue(t value) {
        Node newnodeQueue = new Node(value);
        if (front==null){
            front=newnodeQueue;
            rear=newnodeQueue;
        }else {
            rear.next=newnodeQueue;
            rear=newnodeQueue;
        }
    }
    public t dequeue() {
        t dequeuevalue = null;
        if (front == null) {
            try {
                throw new Exception("throw exception there some thing Wrong");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            dequeuevalue = (t) front.nodeValue;
            front = front.next;
        }
        return dequeuevalue;
    }
    public t peek() {
        if (front==null){
            try {
                throw new Exception("there is an empty");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else {
            return  (t) front.nodeValue;
        }return  (t) front.nodeValue;
    }
    public boolean isEmty() {
        if (front == null) {
            return true;
        } return false;
    }
}

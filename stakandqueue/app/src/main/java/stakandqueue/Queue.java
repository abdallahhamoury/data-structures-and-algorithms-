package stakandqueue;

import com.sun.jdi.Value;

public class Queue <T>{
    Node <T> rear;
    Node <T> front;
    public Queue(){
        this.rear=null;
        this.front=null;

    }
    public void enqueue (T value){
        Node newNode =new Node(value);


        if(front ==null){
            front=newNode;
            rear=newNode;
        }else {
            rear.next= newNode;
        }
        rear=newNode;
    }

    public T dequeue (){
        if (isEmpty())
        {
            return  null;
        }

        Node <T> temp = front;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        temp.next=null;
        return (T) temp.value;
    }

    public T peek(){
        return front.value;
    }
    public boolean isEmpty(){
        if(rear ==null&&front==null){
            return true;
        }else {
            {return false;}
        }






    }
    public String toString (){
        Node current=front;
        String result="";
        while (current != null){
            result+="{ "+current.value+"} ->";
            current=current.next;
        }
        result+="NULL";
        return result;
    }








 }

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
        }else {
            rear.next= newNode;
        }
        rear=newNode;
    }

    public Node dequeue (){
        if(front ==rear){
            rear =null;
            System.out.println(rear);
        }
        Node temp = front;
        front = front.next;
        temp.next=null;
        return temp;
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

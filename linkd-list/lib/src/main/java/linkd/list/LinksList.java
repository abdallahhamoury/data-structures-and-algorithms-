
package linkd.list;

import java.util.ArrayList;

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
    public void append(T value){
        Node newNode = new Node(value);
        Node current = head;
        while(current != null ){
            if(current.next == null){
                current.next = newNode;
                break;
            }else
                current = current.next;
        }
    }
    public void insertBefore(T value,T newValue){
        Node newNode = new Node(newValue);
        Node current = head;
        if(current.value.equals(value)){
            newNode.next = head;
            head = newNode;
        }else{
            while(current!= null){
                if(current.next.value.equals(value)){
                    newNode.next = current.next;
                    current.next = newNode;
                    break;
                }else
                    current=current.next;
            }
        }

    }
    public void insertAfter(T value,T newValue){
        Node newNode = new Node(newValue);
        Node current = head;
        while(current != null){
            if(current.value.equals(value)){
                newNode.next = current.next;
                current.next = newNode;

                break;
            }else
                current=current.next;
        }

    }

    public String  kthFromEnd(int num) {
        if (num < 0) {
            String note = "number can't be less than 0";

            return note;
        }
        Node item = this.head;
        int count = 0;
        while (item.next != null) {
            item = item.next;
            count++;
        }
        item = this.head;
        int finalCount = count - num;
        if (finalCount <= -1) {
            String note = "the input number cant be biger then  Linkedlist";

            return note;
        }
        for (int i = 0; i < finalCount; i++) {
            item = item.next;
        }
        return "The value of indix " + num + " from the tail =" + item.value;
    }


    public static LinksList ziplists(LinksList one, LinksList two) {
        Node oneCurrent = one.head;
        Node twoCurrent = two.head;
        Node temp1;
        Node temp2;
        // if list are empty
        if (oneCurrent == null) return two;
        if (twoCurrent == null) return one;
        while(true){
            temp1 = oneCurrent.next;
            temp2 = twoCurrent.next;
            oneCurrent.next = twoCurrent;
            oneCurrent = temp1;
            if (oneCurrent == null) break;
            twoCurrent.next = oneCurrent;
            twoCurrent = temp2;
            if (twoCurrent == null) break;
        }
        return one;
    }

}

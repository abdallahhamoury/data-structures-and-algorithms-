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
        Node pointer = head;
        Node appNode  = new Node(value);

        if(this.head == null){
            this.head = appNode;
        }else {
            while (pointer.next != null){
                pointer = pointer.next;
            }
        }
        pointer = pointer.next;
    }
     public void insertBefore(T value,T newinsert){
        if (head.value == value){
            this.insert(newinsert);
        }else {
            Node pointer = head;
            while (pointer.next!=null){
                if (pointer.next.value==value){
                    Node appNode = new Node((newinsert));
                    appNode.next = pointer.next;
                    pointer.next = appNode;
                    return;
                }
                pointer = pointer.next;
            }
        }
     }
     public void insertAfter(Integer value,Integer newinsert){
        Node appNode = new Node(newinsert);
        Node pointer = head;
        while (pointer!=null){
            if(pointer.value==value){
                appNode.next = pointer.next;
                pointer.next = appNode;
            }
            pointer = pointer.next;
        }
     }

     public String kthFromEnd(int k){
        int size = 0;
         ArrayList<Integer> listlinked = new ArrayList<>();
         Node current = head;
         if (current == null){
             return "embty";
         }
         while (current!=null){
             current = current.next;
             size++;
         }
         if(k > listlinked.size() || k < 0){
             throw new IndexOutOfBoundsException();
         }
         return "number that" + k + "from tail" + listlinked.get((size-1)-k);
     }

}

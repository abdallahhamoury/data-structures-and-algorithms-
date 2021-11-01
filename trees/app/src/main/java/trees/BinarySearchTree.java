package trees;
import java.util.ArrayList;
public class BinarySearchTree<t> extends BinaryTree{
    public void addFuction(t value){
        root=addFuctionHelper(root,value);
    }
    public Node addFuctionHelper(Node root,t value){
        //Node newNode=new Node (value);
        if(root==null){
            root= new Node (value);
        }else if((int)root.nodeValue>(int)value){
            root.left=addFuctionHelper(root.left,value);
        }else {
            root.right=addFuctionHelper(root.right,value);
        }return root;
    }
    public boolean containsFunction(t value){
        //Node root=new Node(value);
        return containsFunctionHelper(root,value);
    }
    public boolean containsFunctionHelper(Node root,t value){
        // Node newNode=root;
        if (root==null) {
            return false;
        }
        if((int)root.nodeValue>(int)value){
            // root=root.left;
            System.out.println((int)root.nodeValue);
            return containsFunctionHelper(root.left,value);
        }
        if((int)root.nodeValue<(int)value){
            // root=root.right;
            return containsFunctionHelper(root.right,value);
        }
        if((int)root.nodeValue==(int)value){
            return true;
        }
        return false;
    }
    public ArrayList<Integer> traversalFunction(BinaryTree<t> newTree){
        Queue<Node>queue=new Queue<>();
        ArrayList<Integer>dataList=new ArrayList<>();
        queue.enqueue(root);
        while (!queue.isEmty()){
            Node newNode=queue.dequeue();
            dataList.add((Integer) newNode.nodeValue);
            System.out.println(newNode);
            if (newNode.left!=null){
                queue.enqueue(newNode.left);
            } if (newNode.right!=null){
                queue.enqueue(newNode.right);
            }
        }return dataList;
    }
}
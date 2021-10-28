package trees;
import java.util.ArrayList;
public class BinaryTree <t>{
    public ArrayList<t>preOrder=new ArrayList<>();
    public ArrayList<t>inOrder=new ArrayList<>();
    public ArrayList<t>postOrder=new ArrayList<>();
    public Node<t>root;
    public ArrayList <t> preorderFunction(Node <t> rootNode){
        if (rootNode!=null){
            System.out.println(rootNode.getNodeValue());
            preOrder.add(rootNode.getNodeValue());
            if ((rootNode.getLeft()!=null)){
                preorderFunction(rootNode.getLeft());
            }  if ((rootNode.getRight()!=null)){
                preorderFunction(rootNode.getRight());
            }
        }return preOrder;
    }
    public ArrayList <t> inOrderFunction(Node <t> rootNode){
        if (rootNode!=null){
            if ((rootNode.getLeft()!=null)){
                inOrderFunction(rootNode.getLeft());
            }   System.out.println(rootNode.getNodeValue());
            inOrder.add(rootNode.getNodeValue());
            if ((rootNode.getRight()!=null)){
                inOrderFunction(rootNode.getRight());
            }
        }return inOrder;
    }
    public ArrayList <t> postOrderFunction(Node <t> rootNode){
        if ((rootNode.getLeft()!=null)){
            postOrderFunction(rootNode.getLeft());
        }
        if ((rootNode.getRight()!=null)){
            postOrderFunction(rootNode.getRight());
        }System.out.println(rootNode.getNodeValue());
        postOrder.add(rootNode.getNodeValue());
        return postOrder;
    }
}

package trees;
import java.util.ArrayList;
public class BinaryTree <t>{
    public ArrayList<t>preOrder=new ArrayList<>();
    public ArrayList<t>inOrder=new ArrayList<>();
    public ArrayList<t>postOrder=new ArrayList<>();
    public Node root;
    public ArrayList <t> preorderFunction(Node <t> rootNode){
        if (rootNode!=null){
            System.out.println(rootNode.nodeValue);
            preOrder.add(rootNode.nodeValue);
            if ((rootNode.left!=null)){
                preorderFunction(rootNode.left);
            }  if ((rootNode.right!=null)){
                preorderFunction(rootNode.right);
            }
        }return preOrder;
    }
    public ArrayList <t> inOrderFunction(Node <t> rootNode){
        if (rootNode!=null){
            if ((rootNode.left!=null)){
                inOrderFunction(rootNode.left);
            }   System.out.println(rootNode.nodeValue);
            inOrder.add(rootNode.nodeValue);
            if ((rootNode.right!=null)){
                inOrderFunction(rootNode.right);
            }
        }return inOrder;
    }
    public ArrayList <t> postOrderFunction(Node <t> rootNode){
        if ((rootNode.left!=null)){
            postOrderFunction(rootNode.left);
        }
        if ((rootNode.right!=null)){
            postOrderFunction(rootNode.right);
        }System.out.println(rootNode.nodeValue);
        postOrder.add(rootNode.nodeValue);
        return postOrder;
    }
    public int maxNumber(Node <Integer> rootNode) {
        if(rootNode==null) {
            return Integer.MIN_VALUE;
        }

        int maxNum=rootNode.nodeValue;
        int maxNumLeft= maxNumber(rootNode.left);
        int maxNumRight=maxNumber(rootNode.right);
        if(maxNumLeft>maxNum){
            maxNum=maxNumLeft;}
        if(maxNumRight>maxNum){
            maxNum=maxNumRight;}
        return maxNum;
    }
}
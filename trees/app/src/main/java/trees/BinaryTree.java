package trees;
import java.util.ArrayList;
import java.util.List;
public class BinaryTree <t> {
    public ArrayList<t>preOrder=new ArrayList<>();
    public ArrayList<t>inOrder=new ArrayList<>();
    public ArrayList<t>postOrder=new ArrayList<>();
    public Node root;
    //    public BinaryTree(t value) {
//        this.root = new Node<>(value);
//    }
//    public BinaryTree() {
//    }
//    public Node<t> getRoot() {
//        return root;
//    }
//    public void setRoot(Node<t> root) {
//        this.root = root;
//    }
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
        //throw new Exception("empyt Tree");
        //return -1;
        int maxNum=rootNode.nodeValue;
        int maxNumLeft= maxNumber(rootNode.left);
        int maxNumRight=maxNumber(rootNode.right);
        if(maxNumLeft>maxNum){
            maxNum=maxNumLeft;}
        if(maxNumRight>maxNum){
            maxNum=maxNumRight;}
//       if(rootNode.left!=null);
//       maxNum=Math.max(maxNum,maxB(rootNode.left));
        //System.out.println(maxNum);
        return maxNum;
    }
}
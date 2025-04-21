class Node{
    int data;
    Node left,right;
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}
  Class Max_level(){
    int max_level;

  }

public class Rightview {
    Node root;
     Max_level max=new Max_level();
 
    void RightViewUtil(Node node, int level)
    {
        if (node == null)
            return;
        if (max_level < level) {
            System.out.print(node.data + " ");
            max_level = level;
        }
 
        RightViewUtil(node.right, level + 1);
        RightViewUtil(node.left, level + 1);
    }
    void RightView()
    {
        max_level = 0;
        RightViewUtil(root, 1);
    }
    public static void main(String args[])
    {
    
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(3);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
 
        tree.leftView();
    }
}
 


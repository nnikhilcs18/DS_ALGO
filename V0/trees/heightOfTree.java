class Node
{
    Node left;
    Node right;
    Node(int k)
    {
        int key=k;
    }
}
public class heightOfTree
{
    
    public static void main(String args[])
    {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);

        root.left.left=new Node(20);
        root.right.right=new Node(30);
        System.out.println(height(root));
    }
       public static int  height(Node root)
        {
            if(root==null)
                return 0;
            else
            return Math.max(height(root.left),height(root.right))+1;    
        }
}
    

class node{
    node left;
    node right;
    int key;
    node(int k)
    {
        key=k;
    }
}
public class maxInTree {
    public static void main(String args[])
    {
        node root=new node(100);
        root.left=new node(2000);
        root.right=new node(30);
        System.out.println(getMax(root));
    }
    static int getMax(node root)
    {
        if(root==null)
            return Integer.MIN_VALUE;
        else return Math.max(root.key,Math.max(getMax(root.left),getMax(root.right)));

    }
    
}

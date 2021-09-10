class node{
    int key;
    node left;
    node right;
    node(int k)
    {
        key=k;
    } 
}
public class sizeOfTree {
    static int sum=0;
    public static void main(String args[]){
        node root=new node(10);
        root.left=new node(20);
        root.right=new node(30);
        root.left.left=new node(40);
         root.left.right=new node(50);
       //  root.right.left=new node(60);
         root.right.right=new node(70);
        System.out.println(size(root)+ "  sum=" +sum);

    }
    public static int size(node root)
    {
        if(root==null)
            return 0;
        else
        {
            sum+=root.key;
             return 1+size(root.left)+size(root.right);
        }
    }
    
}

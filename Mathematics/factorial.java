public class factorial {
    public static void main(String args[])
    {
        int n=5;
       int ans= fact2(n);
       System.out.println("ans:" +ans);
    }
    static int fact(int num)
    {
        int res=1;
        for(int i=2;i<=num;i++)
        {
            res=res*i;
        }
        return res;
    }
    static int fact2(int n)
    {
        if(n==0)
            return 1;
        return(n*fact(n-1));
    }
}

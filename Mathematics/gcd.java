public class gcd {
    public static void main(String args[])
    {
        int a=50,b=125;
        //int answer=naiveGCD(a, b);
       // int answer= euclidsGCD(a,b);
        int answer= optimisedEuclidsGCD(a,b);
        System.out.println(answer);
    }
    static int naiveGCD(int a,int b)
    {
        int res=Math.min(a,b);
        while(res>0)
        {
            if(a%res==0 && b%res==0)
            {
                break;
            }
            res--;
        }
        return res;
    }
    static int euclidsGCD(int a,int b)
    {
        while(a!=b)
        {
            if(a>b)
            {
                a=a-b;
            }
            else
            {
                b=b-a;
            }
        }
        return a;
    }
    //instead of using continious division we can modify the above algo and use %
    static int optimisedEuclidsGCD(int a,int b)
    {
        if(b==0)
            return a;
        else
            return optimisedEuclidsGCD(b,a%b);
    }
    
}

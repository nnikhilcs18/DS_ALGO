class countNumbers
{
    public static void main(String args[])
    {
        int num=12344;
        int count=0;
        while(num!=0)
        {
            num=num/10;
            count++;
        }
       System.out.println(count);
        //System.out.println(Math.floor(Math.log10(num)+1));

    }
}
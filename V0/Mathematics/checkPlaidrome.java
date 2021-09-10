public class checkPlaidrome {
    public static void main(String args[])
    {
        int n=151951;
        System.out.println(isPal(n));
    }
    static boolean isPal(int num)
    {
      int reverse=0;
      int temp=num;
      while(temp!=0)
      {
          int lastDigit=temp%10;
          reverse=reverse*10+lastDigit;
          temp=temp/10;
      }
      return(reverse==num);
    }  

}

public class check_Kth_bit {
    public static void main(String args[]){
        int check=34894;
        int k=13;
        //using left shift
        if((check&(1<<(k-1)))!=0)
            System.out.println("SET");
        else
            System.out.println("Not set");
        //using right shift
        if(((check>>(k-1))&1)==1)
        System.out.println("SET");
        else
            System.out.println("Not set");

    }
    
}

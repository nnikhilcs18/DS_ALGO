import java.util.Scanner;
public class deleteElement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int [] list={1,2,3,4,5,6,7,8,9,0};
        int k=sc.nextInt();
        //int pos=0;
        for(int i=k-1;i<list.length-1;i++)
        {
            list[i]=list[i+1];
        }
        list[list.length]=null;
        for(int element: list)
        System.out.println(element);
    }
    
}

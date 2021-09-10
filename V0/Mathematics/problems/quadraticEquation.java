package problems;

public class quadraticEquation {
    public static void main(String args[]){

        double a=1,b=-8,c=12;
        double solution1,solution2;
        double check=((b*b)-(4*a*c));
        if(check==0){
            System.out.println("roots are real and equal");
        }
        else if(check<0)
        System.out.println("roots are not real and imaginary");
        else
        System.out.println("roots are real and unique");
        solution1=((-b)+Math.sqrt(check))/(2*a);

        solution2=((-b)-Math.sqrt(check))/(2*a);
        System.out.println("solution 1 is "+ solution1 +"\nsolution 2 is "+ solution2);

    }
    
}

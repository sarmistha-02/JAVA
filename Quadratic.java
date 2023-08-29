import java.util.*;
class Quadratic{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a: ");
        double a=sc.nextDouble();
        System.out.println("Enter b: ");
        double b=sc.nextDouble();
        System.out.println("Enter c: ");
        double c=sc.nextDouble();
        double root1=1.0,root2=1.0;
        root1=(Math.sqrt((b*b)-(4*a*c))-b)/(2*a);
        root2=(((-1)*Math.sqrt((b*b)-(4*a*c)))-b)/(2*a);
        System.out.println("{"+root1+","+root2+"}");
    }
}
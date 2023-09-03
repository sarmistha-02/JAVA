import java.util.*;
class Choseop{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=sc.nextInt();
        System.out.println("Enter b: ");
        int b=sc.nextInt();
        System.out.println("Enter c: ");
        int c=sc.nextInt();
        if(c==1)
            System.out.println("Result: "+(a+b));
        else if(c==2)
            System.out.println("Result: "+(a-b));
        else if(c==3)
            System.out.println("Result: "+(a*b));
        else
            System.out.println("Result: "+(a/b));
    }
}